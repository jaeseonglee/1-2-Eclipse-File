
public class NumThread implements Runnable{//생성된 난수 만큼 숫자 출력하는 스레드
	int str;
	int num;//출력할 숫자와 횟수를 저장하기 위한 필드 선언
	public NumThread(int str ,int num) {//매개변수로 숫자와 횟수를 받아 필드 초기화하는 생성자
		this.str = str;
		this.num = num;
	}
	public void run() {
		for(int i =50; i> this.num; i--) {
			System.out.println(this.str +" ");
		}
		// 횟수만큼 숫자를 출력
	}

}
