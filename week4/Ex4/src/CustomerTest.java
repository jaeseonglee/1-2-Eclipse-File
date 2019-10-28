import java.util.*;
public class CustomerTest {
	public static void main(String[] args) {
		Customer c = new Customer(); // 객체 생성 및 선언
		Scanner input = new Scanner(System.in); 
		
		System.out.println("이름을 입력하세요 : ");
		c.name = input.next();
		System.out.println("카드 사용금액을 입력하세요 : ");
		c.money = input.nextInt(); // 키보드로부터 이름과 사용금액 입력받기
		c.sort(); // 사용금액에 따른 고객구분하는 메소드
		c.write(); // 객체내용을 출력하는 메소드
	}

}
