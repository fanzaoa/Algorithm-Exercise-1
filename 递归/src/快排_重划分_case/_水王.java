package ����_�ػ���_case;

public class _ˮ�� {

	public static void main(String[] args) {
		int[] a=new int[] {1,2,3,4,2,2};
		sort(a);
	}
	//��ͬ����������������O(N)
	public static void sort(int[] arr) {
		//��ѡ�����ȶ�λ��һ��Ԫ��
		int condit = arr[0];
		//���ֵĴ���
		int iTime=1;
		//ɨ������
		for(int i=1;i<arr.length;i++) {
			//��������Ϊ0��Ӧ�ð����ڵ�Ԫ����Ϊ��ѡֵ
			if(iTime==0) {
				condit=arr[i];
				iTime=1;
				continue;
			}
			//�����ͺ�ѡֵ��ͬ�ģ�������1
			if(arr[i]==condit) 
				iTime++;
			else
				iTime--;
		}
		System.out.println(condit);
	}
}
