import java.util.*;
public class Ex4 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>(); //ArrayList ��ü ����
		String str;
		
		while (true) {
			System.out.print("���� �Է�: ");
			str = in.nextLine();
			list.add(str);
			if ( str.equalsIgnoreCase("q")) {	
				break;
			}
		}
		System.out.println("ArrayList�� ����� ���� ��� : ==");
		for( int i=0; i< list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		
	}	
}
