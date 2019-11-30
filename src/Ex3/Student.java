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
		System.out.println("学号为： "+id+" 名字为："+name+" 性别为："+gender+" 年龄为："+age+" 班级为："+cname+" 分数为："+score);
	}
}
