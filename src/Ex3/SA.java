package Ex3;

public class SA{
	public SA() {
		
	}
	public static int f(int a,int b) {//���Լ��
		
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
		//System.out.println("���Լ��Ϊ�� "+m);
		return m;
	}
}
