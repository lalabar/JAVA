package Ex3;

public class Student extends Person{
	String id;
	String cname;
	int score;
	public Student(String id,String name,String gender,int age,String cname,int score) {
		this.id=id;
		this.cname=cname;
		this.score=score;
		this.gender=gender;
		this.age=age;
		this.name=name;
	}
	public void display() {
		System.out.println("ѧ��Ϊ�� "+id+" ����Ϊ��"+name+" �Ա�Ϊ��"+gender+" ����Ϊ��"+age+" �༶Ϊ��"+cname+" ����Ϊ��"+score);
	}
}
