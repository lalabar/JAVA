package Ex3;

public class Testanimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pigeon a=new Pigeon("白鸽","咯咯咯");
		Speed s=new Speed(600);
		System.out.println(a.toString()+"的声音为： "+a.sound());
		System.out.println("速度为："+s.flySpeed());
		Giede b=new Giede("老鹰","呼呼呼");
		Speed v=new Speed(300);
		System.out.println(b.toString()+"的声音为： "+b.sound());
		System.out.println("速度为："+v.flySpeed());
	}

}
