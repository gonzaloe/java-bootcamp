package exercise.one.ten;

public class MyDate {
	
	private int year;
	private int month;
	private int day;
	private static String[] strMonths = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
	private static String[] strDays = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
	private static int[] daysInMonths = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	public MyDate(int year, int month, int day) {
		setDate(year,month,day);
	}
	
	public static boolean isLeapYear(int year){
		if((year%4==0)&&(year%100!=0)) {
			return true;
		}
		else
			return false;
	}
	
	public static boolean isValidDate(int year, int month, int day) {
		if((year<0)||(year>9999))
			return false;
		else if((month<0)||(month>12))
			return false;
		else
			switch(month) {
			case 1:
			case 3:	
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				if((day<0)||(day>31))
					return false;
			case 2:
				if(isLeapYear(year)) {
					if((day<0)||(day>29))
						return false;
				}
				else	
					if((day<0)||(day>28))
						return false;
			case 4:
			case 6:
			case 9:
			case 11:
				if((day<0)||(day>30))
					return false;
			}
		return true;	
	}

	public static int getDayOfWeek(int year, int month, int day) {
		int num1 = 0;
		num1 = year/100;
		if((num1%4==1))
			num1=4;
		else if((num1%4==2))
			num1=2;
		else if((num1%4==3))
			num1=0;
		else if((num1%4==0))
			num1=6;
		int num2 = year;
		String snum2 = Integer.toString(num2);
		snum2 = snum2.substring(2,4);
		num2 = Integer.parseInt(snum2);
		int num3 = 0;
		num3 = num2/4;
		int num4 = 0;
		switch(month) {
		case 10:
			num4=0;
			break;
		case 1:
			if(isLeapYear(year))
				num4=6;
			else
				num4=0;
			break;
		case 3:
		case 11:
			num4=3;
			break;
		case 2:
			if(isLeapYear(year))
				num4=2;
			else
				num4=3;
			break;
		case 4:
		case 7:
			num4=6;
			break;
		case 5:
			num4=1;
			break;
		case 6:
			num4=1;
			break;
		case 8:
			num4=2;
		case 9:
		case 12:
			num4=5;
			break;
		}
		int suma = 0;
		suma = (num1+num2+num3+num4+day)%7;
		return suma;
	}
	


	public void setYear(int year) throws IllegalArgumentException {
		if(year>0 && year<=9999)
			this.year = year;
		else
			throw new IllegalArgumentException("Invalid year");
	}

	public void setMonth(int month) throws IllegalArgumentException {
		if(month>0 && month<13)
			this.month = month;
		else
			throw new IllegalArgumentException("Invalid month");
	}

	public void setDay(int day) throws IllegalArgumentException {
		int dayMax = 0;
		dayMax = daysInMonths[month-1];
			if((isLeapYear(year)) && (month==2))
				dayMax=29;
		if(day>1 && day<=dayMax)	
			this.day = day;
		else
			throw new IllegalArgumentException("Invalid day");
	}

	public void setDate(int year, int month, int day) throws IllegalArgumentException {
		if(isValidDate(year,month,day)) {
			this.year = year;
			this.month = month;
			this.day = day;
		}
		else
			throw new IllegalArgumentException("Invalid year, month or day");
	}

	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}
	

	
	public MyDate nextDay() {
		switch(month) {
		case 1:
		case 3:	
		case 5:
		case 7:
		case 8:
		case 10:
			if(day<31)
				this.day++;
			else if(day==31) {
				this.day=1;
				nextMonth();
			}
			break;
		case 2:
			if(isLeapYear(year)) {
				if(day<29)
					this.day++;
				else if(day==29) {
					this.day=1;
					nextMonth();
				}
			}
			else {	
				if(day<28)
					this.day++;
				else if(day==28) {
					this.day=1;
					nextMonth();
				}
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			if(day<30)
				this.day++;
			else if(day==30) {
				this.day=1;
				nextMonth();
			}
			break;
		case 12:
			if(day==31) {
				this.day=1;
				nextMonth();
			}
				
		}
		return this;
	}

	public MyDate nextMonth() {
		if(this.month<12) {
			this.month++;
			int dayMax = 0;
			dayMax = daysInMonths[month-1];
			if(isLeapYear(year) && day>29)
				day = 29;
			else if(day>dayMax)
				day = dayMax;
		}
		else if(this.month==12) {
			this.month=1;
			nextYear();
			int dayMax = 0;
			dayMax = daysInMonths[month-1];
			if(isLeapYear(year) && day>29)
				day = 29;
			else if(day>dayMax)
				day = dayMax;
		}
		return this;
	}

	public MyDate nextYear() throws IllegalStateException {
		if(this.year<9999) {
			this.year++;
			if(isLeapYear(year) && day == 28 && month == 2)
				setDay(29);
			if(!isLeapYear(year) && day == 29 && month ==2 )
				setDay(28);
		}
		else
			throw new IllegalStateException("Reached years limit");
		return this;	
	}
	
	public MyDate previousDay() {
		switch(month) {
		case 2:
		case 4:	
		case 6:
		case 8:
		case 9:
		case 11:
			if(day>1)
				this.day--;
			else if(day==1) {
				this.day=31;
				nextMonth();
			}
			break;
		case 3:
			if(isLeapYear(year)) {
				if(day>1)
					this.day--;
				else if(day==1) {
					this.day=29;
					previousMonth();
				}
			}
			else {	
				if(day>1)
					this.day--;
				else if(day==1) {
					this.day=28;
					previousMonth();
				}
			}
			break;
		case 5:
		case 7:
		case 10:
		case 12:
			if(day>1)
				this.day--;
			else if(day==1) {
				this.day=30;
				previousMonth();
			}
			break;
		case 1:
			if(day>1)
				this.day--;
			else if(day==1) {
				this.day=31;
				previousMonth();
			}
				
		}
		return this;
	}
	
	public MyDate previousMonth() {
		if(month>1) {
			this.month--;
			int dayMax = 0;
			dayMax = daysInMonths[month-1];
			if(isLeapYear(year) && day>29 && month == 2)
				day = 29;
			else if(day>dayMax)
				day = dayMax;
		}
			else if(month==1) {
				this.month=12;
				previousYear();
				int dayMax = 0;
				dayMax = daysInMonths[month-1];
				if(isLeapYear(year) && day>29 && month == 2)
					day = 29;
				else if(day>dayMax)
					day = dayMax;
		}
		return this;
	}

	public MyDate previousYear() {
		if(year>1) {
			this.year--;
			if(isLeapYear(year) && day == 28 && month == 2)
				setDay(29);
			if(!isLeapYear(year) && day == 29 && month ==2 )
				setDay(28);
		}
		else if(year==1) {
			throw new IllegalStateException("Reached years limit");
		}
		return this;
	}
	
	public String toString() {
		int i = 0;
		i = getDayOfWeek(this.year, month, day);
		return strDays[i] + " " + day + " " + strMonths[month-1] + " " + year;
	}
		
}	
