// 이 코드는 횟수를 입력하는 대신에 난수를 생성하였습니다...
import java.util.*;
class SharedResource {
	long nF1 = 1, nF2 = 1, nResult = 0;
	//임계영역, 밑줄 친 키워드를 삭제한 후 결과도 확인하여 제출
	public synchronized void changeShared(String szName) {
		nResult += nF1;
		try{
			Thread.sleep(10);  //시간 지연
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
		System.out.println("thd1 실행 횟수 : "+my_thread1.num);
		System.out.println("thd2 실행 횟수 : "+my_thread2.num);
		System.out.println("thd3 실행 횟수 : "+my_thread3.num);
	}

}
