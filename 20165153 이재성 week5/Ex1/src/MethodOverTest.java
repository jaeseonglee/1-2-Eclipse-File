import java.util.*;
public class MethodOverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOver m = new MethodOver(); // ��ü ����
		Scanner input = new Scanner(System.in);
		int num;
		char word;
		
		System.out.print("�ڵ尪�� �Է��ϼ��� : ");
		num = input.nextInt();
		System.out.println("�ڵ尪 " +num + "�� ���� " +m.convert(num) +"�Դϴ�."); 
		System.out.print("���ڸ� �Է��ϼ��� : ");
		word = input.next().charAt(0);
		System.out.println("���� " +word + "�� �ڵ尪 " +m.convert(word) + "�Դϴ�.");
		// �޼ҵ� ȣ�� �� �����ε��� ���� ���ڿ� �ڵ尪 ��� 
	}

}
