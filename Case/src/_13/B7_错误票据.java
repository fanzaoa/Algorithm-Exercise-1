package _13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
//split Integer.parseInt Collections
public class B7_错误票据 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();//数组集合长度不确定时需要用到list泛型
		int N = sc.nextInt();
		sc.nextLine();// 吃掉整数后面的换行符
		for (int i = 0; i < N; i++) {
			/**
			 * nextLine() 1.以Enter为结束符,也就是说 nextLine()方法返回的是输入回车之前的所有字符。 2.可以获取空白
			 * https://www.runoob.com/java/java-scanner-class.html
			 */
			String line = sc.nextLine();
			/**
			 * split() 方法根据匹配给定的正则表达式来拆分字符串。
			 * https://www.runoob.com/java/java-string-split.html
			 */
			String[] split = line.split(" ");
			for (int j = 0; j < split.length; j++) {
				/**
				 * parseInt(String s): 返回用十进制参数表示的整数值。
				 * https://www.runoob.com/java/number-parseint.html
				 */
				list.add(Integer.parseInt(split[j]));// 输出集合，从split数组变成list数组
				/**
				 * vowels.add("A"); // [A] vowels.add("E"); // [A, E] 
				 * vowels.add("U"); // [A, E, U] System.out.println(vowels); // [A, E, U]
				 * https://www.journaldev.com/33297/java-list-add-addall-methods
				 */
			}
		}
//		System.out.println(list.size());//Java List.size()方法：返回列表中元素的个数
		Collections.sort(list);// 对于集合排序用Collections,对于数组排序用Arrays
		int a=0;//接收断号的
		int b=0;//接收重号的
		for(int i = 1;i<list.size();i++) {
			if(list.get(i)-list.get(i-1)==2) {//出现断号
				a = list.get(i)-1;
			}
			if(list.get(i).equals(list.get(i-1)))//equals()判断是否等于,已排序
				b = list.get(i);
		}
		System.out.println(a+" "+b);
	}
}
