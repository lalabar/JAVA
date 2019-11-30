package Ex3;

public class SB extends SA{
	public SB() {
		
	}
	public static int f(int a,int b) {
		SA v=new SA();
		System.out.println((a*b)/v.f(a, b));
		int c = a*b;//最小公倍数
		if(a<b) {
			int r=0;
			r=a;
			a=b;
			b=r;
		}
		while(true) {
			int r=a%b;
			if(r==0) {
				c=c/b;
				//System.out.println("最小公倍数为： "+c);	
				break;
			}
		}
		return c;
	}
	
}
