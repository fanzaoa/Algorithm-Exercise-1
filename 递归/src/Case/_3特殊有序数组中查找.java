package Case;

public class _3�������������в��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"a","","ac","","ad","b","","ba"};
		int res = indexOf(arr, "b");
		System.out.println(res);
	}

	static int indexOf(String[] arr,String p) {
		int begin = 0;
		int end = arr.length - 1;
		while(begin<=end) {
			int indexOfMid = begin+(end-begin)/2;
			while(arr[indexOfMid].equals("")) {
				indexOfMid++;
				//����������,��:"abc"
				if(indexOfMid>end)
					return -1;
			}
			if(arr[indexOfMid].compareTo(p)>0) {
				end = indexOfMid-1;
				/**
				 * Java compareTo() ����
				 * ����ֵ�����ͣ������ȱȽ϶�Ӧ�ַ��Ĵ�С(ASCII��˳��)��
				 * �����һ���ַ��Ͳ����ĵ�һ���ַ����ȣ������Ƚϣ���������֮��ĳ��Ȳ�ֵ��
				 * �����һ���ַ��Ͳ����ĵ�һ���ַ���ȣ����Եڶ����ַ��Ͳ����ĵڶ����ַ����Ƚϣ�
				 * �Դ�����,ֱ���Ƚϵ��ַ��򱻱Ƚϵ��ַ���һ������
				 */
			}else if(arr[indexOfMid].compareTo(p)<0) {//arr[indexOfMid]�ַ�����p�ַ����Ƚ�,����ASCII���ֵ
				begin = indexOfMid+1;
			}else {
				return indexOfMid;
			}
		}
		return -1;
	}
}
