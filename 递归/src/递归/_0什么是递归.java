package �ݹ�;

public class _0ʲô�ǵݹ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f(10);
		int a = f1(10);//�����Ҫ����һ������
		System.out.println(a);
		f2(1,10);
		//һ�������ʽ
		int res = f3(new int[] {1,2,3,4,5},0);
		System.out.println(res);
		//��һ��
		System.out.println(reverse("abcd",3));
	}

	// ע����ѭ��
	static void f(int i) {
		if (i == 0)
			return;
		f(i - 1);// ��������
	}

	/**
	 * f1(n):��n�Ľ׳�-->f1(n-1)��n-1�Ľ׳� 
	 * ���ظ���n*(n-1)�Ľ׳ˣ���n-1�Ľ׳���ԭ������ظ�����ģ��С�� --������ 
	 * �ұ仯���仯����Ӧ����Ϊ���� 
	 * �ұ߽磺����
	 * */
	static int f1(int n) {
		if (n == 1)
			return 1;
		return n * f1(n - 1);
	}
	
	//��ӡi-j
	static void f2(int i,int j) {
		if(i>j)
			return;
		System.out.println(i);
		//��Ҳ��֪��Ϊɶ������f2(i+1,j)���治�����
		f2(i+1,j);
	}
	
	/**
	 * ��arr������Ԫ�����
	 */
	static int f3(int[] arr,int begin) {
		if(begin==arr.length-1) {
			return arr[begin];
		}
		/**������begin
		 * return arr[0]+f3(arr);
		 * arr�޷��仯
		 */
		return arr[begin]+f3(arr,begin+1);
	}
	
	/**
	 * ��ת�ַ���
	 * ����һ������
	 */
	static String reverse(String src,int end) {
		if(end==0) {
			//charAt() �������ڷ���ָ�����������ַ���������ΧΪ�� 0 �� length() - 1��
			return ""+src.charAt(0);
		}
		return src.charAt(end)+reverse(src,end-1);
	}
}
