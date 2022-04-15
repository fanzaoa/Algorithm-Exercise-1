package _13;
//100=3+69258/714
import java.util.Scanner;

public class B9_带分数 {

	static int ans;
	private static int N;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		int[] arr = {1,2,3,4,5,6,7,8,9};
		f(arr,0);
		System.out.println(ans);
	}
	
	//确认某一个排列的第k位
	private static void f(int[] arr,int k) {
		if(k == 8)//全部确认
		{
			check(arr);
//			print(arr);
			return;
		}
		//选定第k位
		for(int i = k;i<arr.length;i++) {
			//将第i位和第k位交换
			int t=arr[i];
			arr[i]=arr[k];
			arr[k]=t;
			
			//移交下一层去确认k+1位
			f(arr,k+1);
			//回溯
			t=arr[i];
			arr[i]=arr[k];
			arr[k]=t;
		}
	}

//	private static void print(int[] arr) {
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]);
//		}
//		System.out.println();
//	}
	
	//枚举加号和除号的位置
	private static void check(int[] arr) {
		// TODO Auto-generated method stub
		//+前的字符数最多是7
		for(int i = 1;i<=7;i++) {
			int num1=toInt(arr,0,i);//前面的一段整数
			//break会跳出当前循环，也就是整个循环都不会执行了。而continue则是提前结束本次循环，直接继续执行下次循环。
			if(num1>=N) continue;//如果此时+号前的数额已经超过了N,没必要验算了
			///前面的字符数
			for(int j=1;j<=8-i;j++) {
				int num2=toInt(arr,i,j);
				int num3=toInt(arr,i+j,9-i-j);
				if(num2%num3==0&&num1+num2/num3==N) {
					ans++;
				}
			}
		}
	}

	private static int toInt(int[] arr, int pos, int len) {
		// TODO Auto-generated method stub
		int t=1;
		int ans=0;
		for(int i=pos+len-1;i>=pos;i--) {
			ans+=arr[i]*t;
			t*=10;
		}
		return ans;
	}

}
