// 과제 4번 
public class Book {
	private String id;  //고객번호
	private String book;  // 도서종류
	private int cnt;  // 권수
	private int rental;  //  대여비
	private int money; // 대여금액
	
	public Book(String id) {//고객번호만 초기화 하고 나머지 필드는 모두 0으로 하는 생성자
		this.id = id;
		book = "0";
		cnt = 0;
		rental = 0;
		money = 0;
	}
	public Book(String id , int bookCode , int cnt) {
		//고객번호, 북코드, 권수만 매개변수로 받아 도서종류와 대여비, 대여금액(권수 * 대여비)을 계산하는 생성자
		this.id =id;
		this.cnt = cnt;
		if(bookCode == 1) {
			book = "만화";
			rental = 300;
			money = cnt * rental;
		} else if (bookCode == 2) {
			book = "소설";
			rental = 400;
			money = cnt * rental;
		} else if (bookCode == 3) {
			book = "잡지";
			rental = 500;
			money = cnt * rental;
		}	
	}
	public String toString() { // 객체상태를 반환하는 메소드 
		return "고객번호: " +id+ ", 도서종류: "+book+", 권수: "
				+cnt+", 대여비: " + rental+", 대여금액: " +money;
	}
}
