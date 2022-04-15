package _15;
/*
 * 1+2+3+...+49=1225
 * 将两个不相邻的加号变成乘号，使得结果为2015
 * 1+2+3+...+10*11+12+...+27*28+...+49=2015
 */
public class B6_加法变乘法 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=46;i++)//需要给48*49留位置，i为第一个乘法左边的数
			for(int j=i+2;j<=48;j++)//i=1时，j需要从i+2开始
				if((i*(i+1))-(i+(i+1))+(j*(j+1))-((j+j+1))==2015-1225)
					System.out.println(i+" "+j);
	}

}
