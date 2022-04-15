package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
//split Integer.parseInt Collections
public class _4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int N = scanner.nextInt();
		scanner.nextLine();
		for(int i=0;i<N;i++) {
			String line = scanner.nextLine();
			String[] split = line.split(" ");
			for(int j=0;j<split.length;j++) {
				list.add(Integer.parseInt(split[j]));
			}
		}
		Collections.sort(list);
		int a = 0,b = 0;
		for(int i = 1;i<list.size();i++) {
			if(list.get(i)-list.get(i-1)==2)
				a = list.get(i)-1;
			if(list.get(i)-list.get(i-1)==0)
				b = list.get(i);
		}
		System.out.println(a+" "+b);
	}

}
