package Case;

//import org.graalvm.compiler.debug.Assertions;

public class _2旋转数组的最小数字 {

	public static void main(String[] args) {
//		int[] arr= {5,1,2,3,4};
//		int res=min(arr);
//		Assertions.assertThat(res).isEqualTo(0);
	}
	static int min(int[] arr) {
		int begin = 0;
		int end =arr.length-1;
		//考虑没有旋转这种特殊的旋转
		if(arr[begin]<arr[end]) return arr[begin];
		
		//begin和end指向相邻元素，退出
		while(begin+1<end) {
			int mid = begin+((end-begin)>>1);
			//要么左侧有序，要么右侧有序
			if(arr[mid]>=arr[begin]) {//左侧有序
				begin=mid;
			}else {
				end=mid;
			}
		}
		return arr[end];
	}
}
