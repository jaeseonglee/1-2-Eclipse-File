// 과제 4번 
import java.util.*;
public class Ex5 {
	public static void main(String [] args) { // 프로그램 시작 
		Scanner input = new Scanner(System.in);
		int num; // 키보드로부터 입력받을 변수 
		int sum = 0;  // 합을 계산하는 변수 
		int count = 0; // 1씩 차례대로 더할때 사용하는 변수 
		System.out.print("하나의 수를 입력하세요 : ");
		num = input.nextInt();
		
		while(true) {
			count += 1;
			sum += count;
			if (sum > num) {
				System.out.println("프로그램을 종료합니다. ");
				break;
			}
			System.out.println(count +": " + sum);
		}
	} // 프로그램 종료 

}
