import java.util.*;
public class MenuTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Menu m;
		String [] menu = {"햄버거","샌드위치","치즈스틱","포테이토"};//메뉴 항목에 해당하는 문자열을 배열로 초기화
		int [] danga = {2500,1000,1500,2000};//메뉴 별 단가를 정수형 배열로 초기화
		int choice;  // 메뉴 번호
		int total=0;  // 전체 구입 가격 
		
		while(true) {
			System.out.println("\n1.햄버거\t2.샌드위치\t3.치즈스틱\t4.포테이토\t5.종료");
			System.out.print("해당 메뉴를 입력하세요 : ");
			choice = input.nextInt();
			if(choice == 5) {
				break;
			}
			System.out.print("개수를 선택하세요 : ");
			int cnt = input.nextInt();
			m = new Menu(menu[choice-1],danga[choice-1],cnt); // Menu 객체 생성 
			total += m.getPrice();
			System.out.println(m.toString()); // 객체 내용 출력 
			System.out.println("총가격: "+ total);
			total =0;
		}
	}

}
