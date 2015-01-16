package exercise.one.nine;

public class MyTime {
	private int hour = 0;
	private int minute = 0;
	private int second = 0;
	
	public MyTime(int hour, int minute, int second) {
		setTime(hour,minute,second);
	}
	
	public void setTime(int hour, int minute, int second) throws IllegalArgumentException {

		if((hour>24 || hour<0)||(minute<0 || minute>60)||(second<0 || second>60))
			throw new IllegalArgumentException("Invalid hour, minute or second");
		else if (hour==24) 
			this.hour=00;
		else if (minute==60) 
			this.minute=00;
		else if (second==60)
			this.second=00;
		else {
			this.hour = hour;
			this.minute = minute;
			this.second = second;
		}
			
	}
	
	public int getHour() {
		return hour;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public int getSecond() {
		return second;
	}
	
	public String toString() {
		return hour + ":" + minute + ":" + second;
	}
	
	public MyTime nextSecond() {
		this.second++;
		setTime(hour, minute,second);
		return this;
	}
	
	public MyTime nextMinute() {
		this.minute++;
		setTime(hour, minute,second);
		return this;
	}

	public MyTime nextHour() {
		this.hour++;
		setTime(hour, minute,second);
		return this;
	}
	
	public MyTime previousSecond() {
		this.second--;
		setTime(hour, minute,second);
		return this;
	}
	
	public MyTime previousMinute() {
		this.minute--;
		setTime(hour, minute,second);
		return this;
	}

	public MyTime previousHour() {
		this.hour--;
		setTime(hour, minute,second);
		return this;
	}
	
}
