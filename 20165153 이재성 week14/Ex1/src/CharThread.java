
public class CharThread implements Runnable{ //������ ���� ��ŭ ���� ����ϴ� ������
	String str;
	int num;//����� ���ڿ� Ƚ���� �����ϱ� ���� �ʵ� ����
	public CharThread (String str, int num) {//�Ű������� ���ڿ� Ƚ���� �޾� �ʵ� �ʱ�ȭ�ϴ� ������
		this.str = str;
		this.num = num;
	}
	 public void run() {
		 for(int i =50; i> this.num; i--) {
				System.out.println(this.str +i+" ");
			}
			// Ƚ����ŭ ���ڸ� ���
	 }

}
