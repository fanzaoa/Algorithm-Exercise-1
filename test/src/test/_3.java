package test;
/**
 * myNumbersΪ����
 * for(int i : myNumbers)
 * �ȼ���
 * for(int i = 0; i < myNumbers.size(); i++��{
    int j = myNumbers.get(i);
}
 * @author hp
 *
 */
public class _3 {
	public static void main(String[] args) {
		int[] a = {3,6,4};
		System.out.println(a[0]);
		for(int i : a) {
			System.out.println(i);
		}
	}
}
