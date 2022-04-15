package test;

public class _9 {
	static int ans=0;
	public static void main(String[] args) {
		for(int i=1;i<99;i++) {
			int i1=i*i*i;
			int sum=zfc(i1);
			if(sum==i)
				ans++;
		}
		System.out.println(ans);
	}
	private static int zfc(int i1) {
		// TODO Auto-generated method stub
		String s=String.valueOf(i1);
		int sum=0;
		for(int i=0;i<s.length();i++) {
			sum+=s.charAt(i)-'0';
		}
		return sum;
	}
}
