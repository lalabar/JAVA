package Ex3;

public class Animal {
	protected String type;
	protected String sound;
	public Animal(){
		
	}
	public Animal(String type,String sound){
		this.type=type;
		this.sound=sound;
	}
	public String toString() {	
		return type; 
	}
	public String sound() {
		return sound;
	}
}

