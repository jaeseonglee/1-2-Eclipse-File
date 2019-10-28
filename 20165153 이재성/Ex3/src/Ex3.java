// 과제 3번
import java.util.*;
public class Ex3 {

	public static void main(String[] args) {// 프로그램 시작
		// TODO Auto-generated method stub
		String [] answer = {"하나","둘","셋","넷","다섯","여섯","일곱","여덟","아홉","열"}; 
		Scanner input = new Scanner(System.in); 
		int num; 
		
		while(true) {
			System.out.print("1에서 10사이의 정수 입력 : ");
			num = input.nextInt();
			if( (num>0 && num<11) ) {
				System.out.println(answer[num-1]);
			}
		    else {
		    	System.out.println("프로그램 종료 ");
				break;
		    }
		}
	}// 프로그램 종료 

}
