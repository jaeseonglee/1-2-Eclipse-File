// ���� 4��
import java.util.*;
public class Ex4 {

	public static void main(String[] args) { // ���α׷� ���� 
		// TODO Auto-generated method stub
		String[] list = { "Clubs","Diamonds","Hearts","Spades","Jack","Queen","King","Ace","Green","Window" };
		int [] array = new int[10];
		for (int n=0; n<array.length; n++) {
			array[n] = (int)(Math.random()*49001)+1000; // 1000���� 50000������ ������ �ʱ�ȭ
		}
		Scanner input = new Scanner(System.in);
		String id;
		int count=100;
		
		System.out.println("***** �� ī�� ���� �˻� *****");
		
		while(true) {
			System.out.print("ID�� �Է��ϼ��� : ");
			id = input.next();
			for (int i=0; i<list.length; i++) {//�Է��� ID�� �迭�� ID��� ��ġ�ϴ��� Ȯ�� 
				if(list[i].equalsIgnoreCase(id) == true) { 
					count = i;
					break;
				} 
			}
			if(count != 100) {
				System.out.println("**  ī�� ������ "+array[count] + " �Դϴ�.");
				break;
			}
			else{
				System.out.println("** �ش� ID�� �����ϴ�.");
			}
		} 
	} // ���α׷� ���� 

}
