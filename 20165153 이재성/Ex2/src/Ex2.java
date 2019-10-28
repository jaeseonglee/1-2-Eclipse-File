// 과제 2번
import java.util.*;
public class Ex2 {
	public static void main (String[]args) {// 프로그램 시작
		int [] seats = new int[10];
		char[] array = {'A','B','C','D','E','F','G','H','I','J'}; // 문자 배열 생성
		
		while(true) {
			System.out.println("----------------------------");
			for (int i = 0; i < seats.length; i++)
				System.out.print(array[i] + " "); 
			System.out.println("\n----------------------------");
			for (int i = 0; i < seats.length; i++)
				System.out.print(seats[i] + " ");  
			System.out.println("\n----------------------------");

			System.out.print("원하시는 좌석번호를 입력하세요(종료는 1): ");
			Scanner scan = new Scanner(System.in);
			char s = scan.next().charAt(0); // 키보드로부터 문자로 입력받기
			
			if (s == '1')
				break;
			switch (s) //switch 문을 통해 문자로 예약 시스템 확인
			{   
			   case 'A':
				   if(seats[0] == 0) {
					   seats[0] = 1;
					   System.out.println("예약되었습니다.");
				   }
				   else {
					   System.out.println("이미 예약된 자리입니다.");
				   }
				   break;
			   case 'B':
				   if(seats[0] == 0) {
					   seats[0] = 1;
					   System.out.println("예약되었습니다.");
				   }
				   else {
					   System.out.println("이미 예약된 자리입니다.");
				   }
				   break;
			   case 'C':
				   if(seats[0] == 0) {
					   seats[0] = 1;
					   System.out.println("예약되었습니다.");
				   }
				   else {
					   System.out.println("이미 예약된 자리입니다.");
				   }
				   break;
			   case 'D':
				   if(seats[0] == 0) {
					   seats[0] = 1;
					   System.out.println("예약되었습니다.");
				   }
				   else {
					   System.out.println("이미 예약된 자리입니다.");
				   }
				   break;
			   case 'E':
				   if(seats[0] == 0) {
					   seats[0] = 1;
					   System.out.println("예약되었습니다.");
				   }
				   else {
					   System.out.println("이미 예약된 자리입니다.");
				   }
				   break;
			   case 'F':
				   if(seats[0] == 0) {
					   seats[0] = 1;
					   System.out.println("예약되었습니다.");
				   }
				   else {
					   System.out.println("이미 예약된 자리입니다.");
				   }
				   break;
			   case 'G':
				   if(seats[0] == 0) {
					   seats[0] = 1;
					   System.out.println("예약되었습니다.");
				   }
				   else {
					   System.out.println("이미 예약된 자리입니다.");
				   }
				   break;
			   case 'H':
				   if(seats[0] == 0) {
					   seats[0] = 1;
					   System.out.println("예약되었습니다.");
				   }
				   else {
					   System.out.println("이미 예약된 자리입니다.");
				   }
				   break;
			   case 'I':
				   if(seats[0] == 0) {
					   seats[0] = 1;
					   System.out.println("예약되었습니다.");
				   }
				   else {
					   System.out.println("이미 예약된 자리입니다.");
				   }
				   break;
			   case 'J':
				   if(seats[0] == 0) {
					   seats[0] = 1;
					   System.out.println("예약되었습니다.");
				   }
				   else {
					   System.out.println("이미 예약된 자리입니다.");
				   }
				   break;
			}
		}
	} // 프로그램 종료 

}
