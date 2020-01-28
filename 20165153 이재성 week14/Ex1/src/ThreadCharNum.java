import java.util.*;
public class ThreadCharNum {
	public static void main(String[] args) {
		int num = ((int) Math.random()*50)+1; //난수를 생성
		Thread t1 = new Thread(new NumThread(1,num));//숫자와 문자를 출력하는 스레드 객체 각각 생성
		Thread t2 = new Thread(new CharThread("word",num));//이때 난수를생성자 형식 매개변수로 전달
		t1.start();
		t2.start();//스레드 시작
		}

}
