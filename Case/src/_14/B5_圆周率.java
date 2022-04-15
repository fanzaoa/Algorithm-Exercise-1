package _14;

public class B5_Ô²ÖÜÂÊ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 111;
		for(int n=10000;n>=0;n--) {
			int i=2*n+1;
			x=2+(i*i/x);
		}
		//x=2+1/x
		System.out.println(String.format("%.4f", 4/(x-1)));
	}

}
