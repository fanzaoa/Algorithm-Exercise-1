package _15;

public class B7_牌型种数 {
	private static int ans;

	public static void main(String[] args) {
		f(0, 0);
		System.out.println(ans);
	}
	//**13堆牌，每堆4个，每堆可选0~4个，只要牌的总数为13即可
	//k:哪种牌；cnt：总共分配了几张牌
	private static void f(int k, int cnt) {
		// TODO Auto-generated method stub
		if (k > 13 || cnt > 13)
			return;
		if (k == 13 && cnt == 13) {
			ans++;
			return;
		}
		//cnt:每一种牌出现的次数，cnt逐步上升
		//cnt==13,牌型种数+1，返回
		for (int i = 0; i < 5; i++) {
			f(k + 1, cnt + i);
		}
	}
}
