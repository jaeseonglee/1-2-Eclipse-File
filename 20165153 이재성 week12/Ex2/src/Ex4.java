import java.util.*;
public class Ex4 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>(); //ArrayList 객체 생성
		String str;
		
		while (true) {
			System.out.print("문자 입력: ");
			str = in.nextLine();
			list.add(str);
			if ( str.equalsIgnoreCase("q")) {	
				break;
			}
		}
		System.out.println("ArrayList에 저장된 문자 출력 : ==");
		for( int i=0; i< list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		
	}	
}
