package _01;

public class _5二进制小数 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double num=0.25;
		StringBuilder sb=new StringBuilder("0.");
		while(num>0) {
			//乘2；挪整
			double r=num*2;
			//判断整数部分
			if(r>=1) {
				sb.append("1");
				//消除整数部分
				num=r-1;
			}else {
				sb.append("0");
				num=r;
			}
			if(sb.length()>34) {
				System.out.println("ERROR");
				return;
			}
		}
		System.out.println(sb.toString());
	}

}
