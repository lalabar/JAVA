package Ex3;

public class Speed implements Flyable{
	double speed;
	public Speed() {
		
	}
	public Speed(double speed) {
		this.speed=speed;
	}
	public  double flySpeed() {
		return speed;
	}
}
