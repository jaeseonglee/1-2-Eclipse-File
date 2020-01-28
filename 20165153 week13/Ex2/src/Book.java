
public class Book {
	private String number;    //관리번호
	private String title;       //제목
	private String author;     //저자
	private boolean status;   // 대출 상태(대출 중-> true, 대출가능 -> false)
	
	//생성자 - 본인작성
	// 형식 매개변수로 필드 초기화 , 필드 status는 false로 할 것
	public Book(String number, String title, String author) {
		this.number = number;
		this.title = title; 
		this.author = author;
		this.status = false; 
	} 
	
	// toString() 메소드 - 본인작성
	//- 객체 상태를 문자열로 반환(관리번호, 제목, 저자, 대출상태
	public String toString() {
		return "관리번호 : " +number + " 제목 : " + title+" 저자 : " +author+" 대출상태 : "+status;
	}
	//void rentBook() 메소드 - 본인작성
	//- status 필드값이 false이면 true로 변경한 후 “대출완료” 출력
	//- ture 이면 “대출 불가(대출 중)” 출력
	public void rentBook(String title) {
		if (this.title.equals(title)) {
			if (this.status == false) {
				this.status = true;
				System.out.println("대출완료");
			} else {
				System.out.println("대출 불가(대출 중)");
			}
		}
	}

}
