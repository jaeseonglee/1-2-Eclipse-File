import java.util.*;
public class BookTest {
	public static void main(String[] args) {
		Book b;//Book 참조 변수 선언
		Scanner in = new Scanner(System.in);//입력을 위한 Scanner 객체 선언 및 생성
		LinkedList<Book> B = new LinkedList<Book>();  //LinkedList<Book> 객체 생성
		int num;
		String number,title,author;
		
		
	do {System.out.println("1: 저장   2:대출  3:검색   4:리스트출력  5. 종료");//메뉴를 선택
		System.out.print("메뉴를 선택해주세요 : ");
		num = in.nextInt();
		if(num == 1) { //1번 : 링크드 리스트에 저장- 필요한 자료는 입력을 받는다
			System.out.println("저장할 관리번호를 입력해주세요 : ");
			number = in.next();
			System.out.println("저장할 제목를 입력해주세요 : ");
			title = in.next();
			System.out.println("저장할 저자를 입력해주세요 : ");
			author = in.next();
			b = new Book(number,title,author);
			B.add(b);
		} if (num==2) {//2번 :대출하고자 하는 책 제목을 입력 받은 후 rentBook()메소드로 처리
			System.out.print("대출하고자 하는 책 제목을 입력해주세요 : ");
			title = in.next();
			for(int i =0; i< B.size(); i++) {
				B.get(i).rentBook(title);
			}
		} if (num==3) { //3번 :검색하고자 하는 책 제목을 입력 받은 후 객체 상태 출력
			System.out.print("검색하고자 하는 책 제목을 입력해주세요: ");
			title = in.next();
			for(int i =0; i< B.size(); i++) {
				System.out.println(B.get(i).toString());  
			}
		} if(num==4) { //4번 :링크드 리스트에 저장 된 모든 원소 출력
			System.out.print("링크드 리스트의 모든 원소 출력 : ");
			for (int i = 0; i < B.size(); i++)
		  		System.out.println(B.get(i));  //LinkedList 에 저장된 원소 출력
		} if (num==5) {//5번 : 반복문 종료
			break;
		}
	 } while(true);

	}
}
