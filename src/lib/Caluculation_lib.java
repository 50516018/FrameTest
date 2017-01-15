package lib;

public class Caluculation_lib {
	
	private double m,n;

	public Caluculation_lib(double m, double n) {
		super();
		this.m = m;
		this.n = n;
	}
	public double getplus(){
		return m+n;
	}
	public double getMinus(){
		return m-n;
	}
	public double getSeki(){
		return m*n;
	}
	public double getSyou(){
		return m/n;
	}
}
