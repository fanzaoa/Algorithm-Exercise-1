package _14;

//import java.util.Arrays;

/**
 * ��abcd...s19���ַ�ƴ��106�Σ��õ�2014�Ĵ� ɾ������λ����ĸ��һֱ�ظ�ֱ��ʣ1����ĸ
 * 
 * @author hp
 *
 */
public class B3_����ĸ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr = new char[2014];
		int ans = 0;
		for (int j = 0; j < 106; j++) {
			for (int i = 0; i < 19; i++) {
				arr[ans++] = (char) ('a' + i);
			}
		}
//		for (int i = 0; i < 2014; i++) {
//			System.out.print(arr[i] + " ");
//		}
		int len = 2014;
		while (len != 1) {
			int k = 0;
			for (int i = 1; i < len; i += 2) {
				arr[k] = arr[i];
				k++;
			}
			len = k;
//			arr[len]='\0';
//			System.out.println(Arrays.toString(arr));
		}
		System.out.println(arr[0]);
	}

}
