import java.util.*;
public class ThreadCharNum {
	public static void main(String[] args) {
		int num = ((int) Math.random()*50)+1; //������ ����
		Thread t1 = new Thread(new NumThread(1,num));//���ڿ� ���ڸ� ����ϴ� ������ ��ü ���� ����
		Thread t2 = new Thread(new CharThread("word",num));//�̶� ������������ ���� �Ű������� ����
		t1.start();
		t2.start();//������ ����
		}

}
