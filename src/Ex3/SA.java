package Ex3;

public class SA{
	public SA() {
		
	}
	public static int f(int a,int b) {//最大公约数
		
		int m=a;
		int z=0;
		if(b==0) {
			m=a;
			return a;
		}		
		while(z!=0) {
			z=m%b;
			m=b;
			b=z;
		}
		//System.out.println("最大公约数为： "+m);
		return m;
	}
}
