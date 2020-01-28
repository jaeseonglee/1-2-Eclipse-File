
public class CharThread implements Runnable{ //생성된 난수 만큼 문자 출력하는 스레드
	String str;
	int num;//출력할 문자와 횟수를 저장하기 위한 필드 선언
	public CharThread (String str, int num) {//매개변수로 문자와 횟수를 받아 필드 초기화하는 생성자
		this.str = str;
		this.num = num;
	}
	 public void run() {
		 for(int i =50; i> this.num; i--) {
				System.out.println(this.str +i+" ");
			}
			// 횟수만큼 문자를 출력
	 }

}
