package ����_�ػ���_case;

import java.util.Arrays;

public class _��С����id {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] { 1, 4, 3, 6, 8 };
		System.out.println(find(a));
		System.out.println(find1(a));
		System.out.println(find2(a));
		System.out.println(find3(a, 0, a.length-1));
	}

//O(n^2) �����ⷨ����1��ʼ����̽��ÿ����Ȼ���Ƿ���������
	public static int find(int[] arr) {
		int i = 1;
		while (true) {
			if (indexOf(arr, i) == -1)//
				return i;
			i++;
		}
	}
//k��arr����Ƚϣ���������ʱ����id
	public static int indexOf(int[] arr, int k) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == k)
				return i;
		}
		return -1;
	}

	// O(NlogN)
	public static int find1(int[] arr) {
		/**
		 * ��eclipse��ѡ��Ҫ�鿴���ࡢ������
		 * ���²����� �Ҽ�����References����Workspace 
		 * ����ʹ�ÿ�ݼ���Ctrl+Shift+G
		 */
		// ��һ�����������Ԫ�ؽ������򣬲����ǰ���С�����˳��
		Arrays.sort(arr);
		int i = 0;
		while (i < arr.length) {// ����λ����С����Ȼ��
			if (i + 1 != arr[i])//
				return i + 1;
			i++;
		}
		return i + 1;//arr[arr.length-1]�ڵ�Ԫ��û���������arr.length+1
	}
	/**
	 * �Ľ�1��
	 * �½���Ϊn+1������helper����ʼֵȫΪfalse,ɨ��ԭ�����е�Ԫ�أ�С��n��helper[arr[i]]��¼Ϊtrue
	 * �����ɨ��helper,���ص�һ��Ϊfalse��Ԫ�ص��±꣬ע���е������ڼ������� O(n)�����˷ѿռ�
	 */
	public static int find2(int[] arr) {
		int n=arr.length;
		int[] helper=new int[n+1];
		for(int i=0;i<n;i++) {
			if(arr[i]<n+1)
				helper[arr[i]]=1;
		}
		for(int i=1;i<=n;i++) {
			if(helper[i]==0)
				return i;
		}
		return n+1;
	}
	public static int find3(int[] arr,int p,int r) {
		if(p>r)
			return p+1;
		int mid=p+((r-p)>>1);
		int q = _2���������е�kС����_��һ�����.quickSort(arr, p, r, mid-p+1);
		int z=mid+1;
		if(q==z) return find3(arr,mid+1,r);
		else return find3(arr, p, mid-1);
	}
}
