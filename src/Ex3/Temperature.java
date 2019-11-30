package Ex3;

public class Temperature {
	private double Fahrenheit;
	private double Celsius;	
	public double getFahrenheit() {
		return Fahrenheit;
	}
	public void setFahrenheit(double degree) {
		Fahrenheit = degree;
		Celsius = (Fahrenheit - 32) * 5.0/9.0;
	}
	public double getCelsius() {
		return Celsius;
	}
	public void setCelsius(double degree) {
		Celsius = degree;
		Fahrenheit = ((9.0/5.0)*Celsius)+32;
	}
}
