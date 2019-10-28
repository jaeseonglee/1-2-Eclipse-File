// 과제 2번
import java.util.*;
public class Ex3 {
	public static void main(String[] args) { // 프로그램 시작
		Scanner input= new Scanner(System.in);
		String[] arr1 = {"A","B","C","D","E"}; 
		int[][] arr = new int[5][10]; // 2차원배열 
		String word; 
		int num; // 키보드로부터 입력받는 문자열과 숫자
		
		for(int i=0; i<arr.length; i++) {
			for(int n=0; n<arr[i].length; n++) {
				arr[i][n] = 0;
			}
		} // 2차원 배열을 0으로 초기화
		
		while(true) {
			System.out.println("----------------예약 내용 출력----------------");
			System.out.println("열: 1 2 3 4 5 6 7 8 9 10");
			for(int i=0; i<arr.length; i++) {
				System.out.print(arr1[i]+": ");
				for(int n=0; n<arr[i].length; n++) {
					System.out.print(arr[i][n] +" ");
				}
				System.out.println();
			}
			System.out.println("---------------------------------------------");
			System.out.print("원하시는 열을 선택하세요 : (종료는 q 또는 Q) : ");
			word = input.next();
			if( ( word.equals("q") || word.equals("Q") ) ==true ) {
				break;  // q 또는 Q가 입력되면 반복문 종료
			}
			System.out.print("원하시는 번호를 선택하세요 : ");
			num = input.nextInt();
			for(int i=0; i<arr.length; i++) {
				for (int n=0; n<arr[i].length; n++){
					if( ( word.equals(arr1[i]) && num == n+1 ) == true ){
						arr[i][n] = 1;
					}
				}
			}
			System.out.println("예약되었습니다.");	
			System.out.println();
		}
	}// 프로그램 종료 

}
