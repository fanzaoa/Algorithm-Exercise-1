package Case;

public class _3特殊有序数组中查找 {

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
				//不属于数组,例:"abc"
				if(indexOfMid>end)
					return -1;
			}
			if(arr[indexOfMid].compareTo(p)>0) {
				end = indexOfMid-1;
				/**
				 * Java compareTo() 方法
				 * 返回值是整型，它是先比较对应字符的大小(ASCII码顺序)，
				 * 如果第一个字符和参数的第一个字符不等，结束比较，返回他们之间的长度差值，
				 * 如果第一个字符和参数的第一个字符相等，则以第二个字符和参数的第二个字符做比较，
				 * 以此类推,直至比较的字符或被比较的字符有一方结束
				 */
			}else if(arr[indexOfMid].compareTo(p)<0) {//arr[indexOfMid]字符串与p字符串比较,返回ASCII码差值
				begin = indexOfMid+1;
			}else {
				return indexOfMid;
			}
		}
		return -1;
	}
}
