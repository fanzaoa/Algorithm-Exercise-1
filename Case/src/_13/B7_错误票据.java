package _13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
//split Integer.parseInt Collections
public class B7_����Ʊ�� {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();//���鼯�ϳ��Ȳ�ȷ��ʱ��Ҫ�õ�list����
		int N = sc.nextInt();
		sc.nextLine();// �Ե���������Ļ��з�
		for (int i = 0; i < N; i++) {
			/**
			 * nextLine() 1.��EnterΪ������,Ҳ����˵ nextLine()�������ص�������س�֮ǰ�������ַ��� 2.���Ի�ȡ�հ�
			 * https://www.runoob.com/java/java-scanner-class.html
			 */
			String line = sc.nextLine();
			/**
			 * split() ��������ƥ�������������ʽ������ַ�����
			 * https://www.runoob.com/java/java-string-split.html
			 */
			String[] split = line.split(" ");
			for (int j = 0; j < split.length; j++) {
				/**
				 * parseInt(String s): ������ʮ���Ʋ�����ʾ������ֵ��
				 * https://www.runoob.com/java/number-parseint.html
				 */
				list.add(Integer.parseInt(split[j]));// ������ϣ���split������list����
				/**
				 * vowels.add("A"); // [A] vowels.add("E"); // [A, E] 
				 * vowels.add("U"); // [A, E, U] System.out.println(vowels); // [A, E, U]
				 * https://www.journaldev.com/33297/java-list-add-addall-methods
				 */
			}
		}
//		System.out.println(list.size());//Java List.size()�����������б���Ԫ�صĸ���
		Collections.sort(list);// ���ڼ���������Collections,��������������Arrays
		int a=0;//���նϺŵ�
		int b=0;//�����غŵ�
		for(int i = 1;i<list.size();i++) {
			if(list.get(i)-list.get(i-1)==2) {//���ֶϺ�
				a = list.get(i)-1;
			}
			if(list.get(i).equals(list.get(i-1)))//equals()�ж��Ƿ����,������
				b = list.get(i);
		}
		System.out.println(a+" "+b);
	}
}
