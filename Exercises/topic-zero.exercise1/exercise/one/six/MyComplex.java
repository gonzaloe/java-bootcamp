package exercise.one.six;

public class MyComplex {
	private double real;
	private double imag;
	
	public MyComplex(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public void setImag(double imag) {
		this.imag = imag;
	}

	public double getReal() {
		return real;
	}

	public double getImag() {
		return imag;
	}
	
	public void setValue(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}
	
	public String toString() {
		return "(" + real + " + " + imag + "i)";
	}
	
	public boolean isReal() {
		if(imag == 0) {
			return true;
		}
		else
			return false;
	}
	
	public boolean isImaginary() {
		if(real == 0) {
			return true;
		}
		else
			return false;
	}
	
	public boolean equals(double real, double imag) {
		if((this.real == real) && (this.imag == imag)){
			return true;
		}
		else 
			return false;
	}
	
	public boolean equals(MyComplex another) {
		if((this.real == another.getReal()) && (this.imag == another.getImag())){
			return true;
		}
		else 
			return false;
	}
	
	public double magnitude(){
		double magnitude = 0;
		magnitude = Math.sqrt(Math.pow(real,2.0) + Math.pow(imag, 2.0));
		return magnitude;
	}
	
	public double argumentInRadians() {
		double arg = 0;
		arg = Math.atan2(imag, real);
		return arg;
	}
	
	public int argumentInDegrees() {
		int arg = 0;
		arg = (int) Math.sqrt((Math.pow(real,2.0)+Math.pow(imag,2.0)));
		return arg;
	}
	
	public MyComplex conjugate() {
		return new MyComplex(real, -imag);
	}
	
	public MyComplex add(MyComplex another) {
		double real = 0;
		double imag = 0;
		real = this.real + another.getReal();
		imag = this.imag + another.getImag();
		return new MyComplex(real, imag);
	}
	
	public MyComplex subtract(MyComplex another) {
		double real = 0;
		double imag = 0;
		real = this.real - another.getReal();
		imag = this.imag - another.getImag();
		return new MyComplex(real, imag);
	}
	
	public MyComplex multiplyWith(MyComplex another) {
		real = (this.real*another.getReal())-(this.imag*another.getImag());
		imag = (this.real*another.getImag())+(this.imag*another.getReal());
		return this;
	}
	
	public MyComplex divideBy(MyComplex another) {
		real = ((this.real* another.real)+(this.imag*another.imag))/(Math.pow(another.imag, 2.0)+Math.pow(another.real, 2.0));
		imag = ((this.imag*another.real)-(this.real*another.imag))/(Math.pow(another.real,2.0)+Math.pow(another.imag,2.0));
		return this;
	}
	
}
