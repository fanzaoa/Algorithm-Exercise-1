package _14;

//import java.util.Arrays;

/**
 * 把abcd...s19个字符拼接106次，得到2014的串 删除奇数位置字母，一直重复直到剩1个字母
 * 
 * @author hp
 *
 */
public class B3_猜字母 {

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
