package �ݹ�;

public class _4��ŵ�� {//���ϵ���Ϊ3��2��1

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printHanoiTower(3, "A", "B", "C");
	}

	/**
	 * ��N�����Ӵ�source�ƶ���target��·���Ĵ�ӡ
	 * @param N ��ʼ��N����С��������ӣ�N�������
	 * @param from ԭʼ����
	 * @param to ����������
	 * @param help Ŀ������
	 */
	static void printHanoiTower(int N,String from,String to,String help) {
		//���ǽ���
		if(N == 1) {
			System.out.println("move" + N + "from" + from + "to" + to);
			return;
		}
		//���ǵڶ���
		printHanoiTower(N-1, from, help, to);//�Ȱ�ǰN-1������Ų�������ռ���ȥ
		System.out.println("move"+N+"from"+from+"to"+to);//N����˳������target
		printHanoiTower(N-1, help, to, from);//��N-1�Ӹ����ռ�ص�Դ�ռ���ȥ
	}
}