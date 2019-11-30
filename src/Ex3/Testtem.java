 package Ex3;

public class Testtem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Temperature a=new Temperature();
		a.setCelsius(10);
		System.out.println("摄氏温度为： "+a.getFahrenheit());
		a.setFahrenheit(20);
		System.out.println("华氏温度为： "+a.getCelsius());
	}

}
