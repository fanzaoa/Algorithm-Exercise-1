package Case;

//import org.graalvm.compiler.debug.Assertions;

public class _2��ת�������С���� {

	public static void main(String[] args) {
//		int[] arr= {5,1,2,3,4};
//		int res=min(arr);
//		Assertions.assertThat(res).isEqualTo(0);
	}
	static int min(int[] arr) {
		int begin = 0;
		int end =arr.length-1;
		//����û����ת�����������ת
		if(arr[begin]<arr[end]) return arr[begin];
		
		//begin��endָ������Ԫ�أ��˳�
		while(begin+1<end) {
			int mid = begin+((end-begin)>>1);
			//Ҫô�������Ҫô�Ҳ�����
			if(arr[mid]>=arr[begin]) {//�������
				begin=mid;
			}else {
				end=mid;
			}
		}
		return arr[end];
	}
}
