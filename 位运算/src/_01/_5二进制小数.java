package _01;

public class _5������С�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double num=0.25;
		StringBuilder sb=new StringBuilder("0.");
		while(num>0) {
			//��2��Ų��
			double r=num*2;
			//�ж���������
			if(r>=1) {
				sb.append("1");
				//������������
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
