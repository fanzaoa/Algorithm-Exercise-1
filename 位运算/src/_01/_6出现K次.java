package _01;

public class _6����K�� {

	public static void main(String[] args) {
		int[] arr = { 2, 2, 2, 9, 7, 7, 7, 3, 3, 3, 6, 6, 6, 0, 0, 0 };
		// �����±����
//		int[] helper = new int[arr.length];
//		for (int i = 0; i < arr.length; i++) {
//			helper[arr[i]]++;
//		}
//		for (int i = 0; i < arr.length; i++) {
//			if (helper[i] == 1)
//				System.out.println(i);
//		}
		int len = arr.length;
		char[][] kRadix = new char[len][];
		int k = 3;
		// ת��k�����ַ�����
		int maxlen = 0;
		// ����ÿ������
		for (int i = 0; i < len; i++) {
			// ��ÿ�����ֵ��������ַ�������ת��Ȼ��תΪ�ַ�����
			kRadix[i] = new StringBuilder(Integer.toString(arr[i], k)).reverse().toString().toCharArray();
			if (kRadix[i].length > maxlen)
				maxlen = kRadix[i].length;
		}
		// ����λ�ӷ�
		int[] resArr = new int[maxlen];
		for (int i = 0; i < len; i++) {
			// ����λ�ӷ�
			for (int j = 0; j < maxlen; j++) {
				if (j >= kRadix[i].length)
					resArr[j] += 0;
				else
					resArr[j] += (kRadix[i][j] - '0');
			}
		}
		int res = 0;
		for (int i = 0; i < maxlen; i++) {
			res += (resArr[i] % k) * (int) (Math.pow(k, i));// 8%3=2
		}
		System.out.println(res);
	}
}
