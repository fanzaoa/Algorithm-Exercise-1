package _13;

import java.util.Calendar;//1970年以后可用这个API

public class B1_世纪末的星期 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar = Calendar.getInstance();
		for(int year=1999;year<10000;year+=100) {
			calendar.set(Calendar.YEAR, year);
			calendar.set(Calendar.MONTH, 11);//12月
			calendar.set(Calendar.DAY_OF_MONTH, 31);
			System.out.println(year+" "+calendar.get(Calendar.DAY_OF_WEEK));
			if(calendar.get(Calendar.DAY_OF_WEEK)==1) {
				System.out.println(year);
				break;
			}
		}
		test();
	}

	static void test() {
		Calendar calendar =Calendar.getInstance();
		for(int year=1999;year<=10000;year+=100) {
			calendar.set(Calendar.YEAR, year);
			calendar.set(Calendar.MONTH, 11);
			calendar.set(Calendar.DAY_OF_MONTH, 31);
			if(calendar.get(Calendar.DAY_OF_WEEK)==1) {
				System.out.println(year);
				break;
			}
		}
	}
}
