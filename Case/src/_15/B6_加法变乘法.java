package _15;
/*
 * 1+2+3+...+49=1225
 * �����������ڵļӺű�ɳ˺ţ�ʹ�ý��Ϊ2015
 * 1+2+3+...+10*11+12+...+27*28+...+49=2015
 */
public class B6_�ӷ���˷� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=46;i++)//��Ҫ��48*49��λ�ã�iΪ��һ���˷���ߵ���
			for(int j=i+2;j<=48;j++)//i=1ʱ��j��Ҫ��i+2��ʼ
				if((i*(i+1))-(i+(i+1))+(j*(j+1))-((j+j+1))==2015-1225)
					System.out.println(i+" "+j);
	}

}
