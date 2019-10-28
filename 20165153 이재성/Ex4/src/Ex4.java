// 과제 4번
import java.util.*;
public class Ex4 {

	public static void main(String[] args) { // 프로그램 시작 
		// TODO Auto-generated method stub
		String[] list = { "Clubs","Diamonds","Hearts","Spades","Jack","Queen","King","Ace","Green","Window" };
		int [] array = new int[10];
		for (int n=0; n<array.length; n++) {
			array[n] = (int)(Math.random()*49001)+1000; // 1000부터 50000까지의 난수로 초기화
		}
		Scanner input = new Scanner(System.in);
		String id;
		int count=100;
		
		System.out.println("***** 고객 카드 사용액 검색 *****");
		
		while(true) {
			System.out.print("ID를 입력하세요 : ");
			id = input.next();
			for (int i=0; i<list.length; i++) {//입력한 ID와 배열의 ID들과 일치하는지 확인 
				if(list[i].equalsIgnoreCase(id) == true) { 
					count = i;
					break;
				} 
			}
			if(count != 100) {
				System.out.println("**  카드 사용액은 "+array[count] + " 입니다.");
				break;
			}
			else{
				System.out.println("** 해당 ID가 없습니다.");
			}
		} 
	} // 프로그램 종료 

}
