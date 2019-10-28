import java.util.*;
public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date da = new Date(); //객체 생성
		Scanner input = new Scanner(System.in);
		
		System.out.print("연도를 입력해주세요 : ");
		da.years =input.nextInt();
		System.out.print("월을 입력해주세요 : ");
		da.month = input.nextInt();
		System.out.print("일을 입력해주세요 : ");
		da.day = input.nextInt(); // 연도,월,일 입력받기
		
		System.out.println(da.display1());
		System.out.println(da.display2());
	}

}
