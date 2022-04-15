package _16;

public class B2_ÉúÈÕÀ¯Öò {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=100;i++) {
			for(int j=i;j<=100;j++) {
				if((i+j)*(j-i+1)/2==236)
					System.out.println(i+" "+j);
			}
		}
	}

}
