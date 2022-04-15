package 递归;

public class _4汉诺塔 {//从上到下为3，2，1

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printHanoiTower(3, "A", "B", "C");
	}

	/**
	 * 将N个盘子从source移动到target的路径的打印
	 * @param N 初始的N个从小到大的盘子，N是最大编号
	 * @param from 原始柱子
	 * @param to 辅助的柱子
	 * @param help 目标柱子
	 */
	static void printHanoiTower(int N,String from,String to,String help) {
		//考虑结束
		if(N == 1) {
			System.out.println("move" + N + "from" + from + "to" + to);
			return;
		}
		//考虑第二步
		printHanoiTower(N-1, from, help, to);//先把前N-1个盘子挪到辅助空间上去
		System.out.println("move"+N+"from"+from+"to"+to);//N可以顺利到达target
		printHanoiTower(N-1, help, to, from);//让N-1从辅助空间回到源空间上去
	}
}