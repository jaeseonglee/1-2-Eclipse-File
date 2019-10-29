import java.util.*;
public class MethodOverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOver m = new MethodOver(); // 객체 생성
		Scanner input = new Scanner(System.in);
		int num;
		char word;
		
		System.out.print("코드값을 입력하세요 : ");
		num = input.nextInt();
		System.out.println("코드값 " +num + "는 문자 " +m.convert(num) +"입니다."); 
		System.out.print("문자를 입력하세요 : ");
		word = input.next().charAt(0);
		System.out.println("문자 " +word + "는 코드값 " +m.convert(word) + "입니다.");
		// 메소드 호출 및 오버로딩을 통한 문자와 코드값 출력 
	}

}
