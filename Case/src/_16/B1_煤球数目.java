package _16;

public class B1_ú����Ŀ {
	
	public static void main(String[] args) {
		int pre=1;
		int plus=2;
		long sum=1;
		for(int i=1;i<100;i++) {
			pre=pre+plus;//�Ҳ���
			sum+=pre;//�ܺ�
			plus++;
		}
		System.out.println(sum);
	}
}
