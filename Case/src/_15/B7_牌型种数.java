package _15;

public class B7_�������� {
	private static int ans;

	public static void main(String[] args) {
		f(0, 0);
		System.out.println(ans);
	}
	//**13���ƣ�ÿ��4����ÿ�ѿ�ѡ0~4����ֻҪ�Ƶ�����Ϊ13����
	//k:�����ƣ�cnt���ܹ������˼�����
	private static void f(int k, int cnt) {
		// TODO Auto-generated method stub
		if (k > 13 || cnt > 13)
			return;
		if (k == 13 && cnt == 13) {
			ans++;
			return;
		}
		//cnt:ÿһ���Ƴ��ֵĴ�����cnt������
		//cnt==13,��������+1������
		for (int i = 0; i < 5; i++) {
			f(k + 1, cnt + i);
		}
	}
}
