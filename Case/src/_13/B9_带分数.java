package _13;
//100=3+69258/714
import java.util.Scanner;

public class B9_������ {

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
	
	//ȷ��ĳһ�����еĵ�kλ
	private static void f(int[] arr,int k) {
		if(k == 8)//ȫ��ȷ��
		{
			check(arr);
//			print(arr);
			return;
		}
		//ѡ����kλ
		for(int i = k;i<arr.length;i++) {
			//����iλ�͵�kλ����
			int t=arr[i];
			arr[i]=arr[k];
			arr[k]=t;
			
			//�ƽ���һ��ȥȷ��k+1λ
			f(arr,k+1);
			//����
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
	
	//ö�ټӺźͳ��ŵ�λ��
	private static void check(int[] arr) {
		// TODO Auto-generated method stub
		//+ǰ���ַ��������7
		for(int i = 1;i<=7;i++) {
			int num1=toInt(arr,0,i);//ǰ���һ������
			//break��������ǰѭ����Ҳ��������ѭ��������ִ���ˡ���continue������ǰ��������ѭ����ֱ�Ӽ���ִ���´�ѭ����
			if(num1>=N) continue;//�����ʱ+��ǰ�������Ѿ�������N,û��Ҫ������
			///ǰ����ַ���
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
