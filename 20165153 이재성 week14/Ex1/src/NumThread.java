
public class NumThread implements Runnable{//������ ���� ��ŭ ���� ����ϴ� ������
	int str;
	int num;//����� ���ڿ� Ƚ���� �����ϱ� ���� �ʵ� ����
	public NumThread(int str ,int num) {//�Ű������� ���ڿ� Ƚ���� �޾� �ʵ� �ʱ�ȭ�ϴ� ������
		this.str = str;
		this.num = num;
	}
	public void run() {
		for(int i =50; i> this.num; i--) {
			System.out.println(this.str +" ");
		}
		// Ƚ����ŭ ���ڸ� ���
	}

}
