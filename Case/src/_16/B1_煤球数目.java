package _16;

public class B1_煤球数目 {
	
	public static void main(String[] args) {
		int pre=1;
		int plus=2;
		long sum=1;
		for(int i=1;i<100;i++) {
			pre=pre+plus;//右侧数
			sum+=pre;//总和
			plus++;
		}
		System.out.println(sum);
	}
}
