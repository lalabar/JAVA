package Ex3;

public class Testanimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pigeon a=new Pigeon("�׸�","������");
		Speed s=new Speed(600);
		System.out.println(a.toString()+"������Ϊ�� "+a.sound());
		System.out.println("�ٶ�Ϊ��"+s.flySpeed());
		Giede b=new Giede("��ӥ","������");
		Speed v=new Speed(300);
		System.out.println(b.toString()+"������Ϊ�� "+b.sound());
		System.out.println("�ٶ�Ϊ��"+v.flySpeed());
	}

}
