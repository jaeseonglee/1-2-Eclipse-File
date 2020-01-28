// �� �ڵ�� Ƚ���� �Է��ϴ� ��ſ� ������ �����Ͽ����ϴ�...
import java.util.*;
class SharedResource {
	long nF1 = 1, nF2 = 1, nResult = 0;
	//�Ӱ迵��, ���� ģ Ű���带 ������ �� ����� Ȯ���Ͽ� ����
	public synchronized void changeShared(String szName) {
		nResult += nF1;
		try{
			Thread.sleep(10);  //�ð� ����
			nF1++;
			System.out.println(szName +"(" +nF2++ +  "):" + nResult);
		}
		catch(InterruptedException e){}
	}
}

class MyThread extends Thread {
	SharedResource sharedResource;
	String szTName;
	int num = (int)(Math.random()*10)+1;
	
	public MyThread(String szName, SharedResource res) {
		super(szName);  
		szTName = szName; 
		sharedResource = res;
	}
	
	public void run() {
		for(int i = 0;i < num;i++)
			sharedResource.changeShared(szTName);
		}
}

public class NotSynchoTest {
	public static void main(String args[]) {
		SharedResource res = new SharedResource();
		MyThread my_thread1 = new MyThread("thd1", res);
		MyThread my_thread2 = new MyThread("thd2", res);
		MyThread my_thread3 = new MyThread("thd3", res);
		my_thread1.start();
		my_thread2.start();
		my_thread3.start();
		System.out.println("thd1 ���� Ƚ�� : "+my_thread1.num);
		System.out.println("thd2 ���� Ƚ�� : "+my_thread2.num);
		System.out.println("thd3 ���� Ƚ�� : "+my_thread3.num);
	}

}
