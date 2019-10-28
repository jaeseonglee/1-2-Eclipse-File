// 과제 3번 
public class Customer {
	String name; // 이름
	int money; // 카드 사용 금액
	String grade; // 고객구분
	
	void write() {
		System.out.println("이름: "+name+" 사용금액: " +money+" 고객구분: "+grade);
	} // 객체 내용 출력 
	
	void sort() {
		if( (money >= 0) && (money <5000 ) == true ) {
			grade = "일반";
		}
		else if( (money >= 5000) && (money <10000 ) == true ) {
			grade = "우수";
		}
		else if( (money >= 10000) == true ) {
			grade = "최우수";
		}
	} // 사용 금액에 따른 고객구분 초기화
}
