package Ex3;

public class Testaddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address a=new Address();
		a.setName("杨康");
		a.setAdr("陕西科技大学12公寓");
		a.setNum("423423423");
		System.out.println("姓名："+a.getName()+"  地址： "+a.getAdr()+" 电话为： "+a.getNum());
	}

}
