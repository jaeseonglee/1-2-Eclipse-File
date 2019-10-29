import java.util.*;
public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Book b1 = new Book("A"); 
		Book b2; // 객체 생성 
		String id;  // 고객번호 변수 
		int num;  // 북코드 변수
		int cnt;  // 권수 변수 
		System.out.print("고객번호를 입력해주세요 : ");
		id = input.next();
		System.out.println("1:만화\t2.소설\t3.잡지");
		System.out.println("북코드를 입력해주세요 : ");
		num = input.nextInt();
		System.out.println("권수를 입력해주세요 : ");
		cnt = input.nextInt();
		b2 = new Book(id,num,cnt);
		System.out.println(b1.toString());
		System.out.println(b2);
		//-	객체 생성시 고객번호, 북코드, 권수를 입력 받아 생성자 매개변수로 전달
	}

}
