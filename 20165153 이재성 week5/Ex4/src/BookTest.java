import java.util.*;
public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Book b1 = new Book("A"); 
		Book b2; // ��ü ���� 
		String id;  // ����ȣ ���� 
		int num;  // ���ڵ� ����
		int cnt;  // �Ǽ� ���� 
		System.out.print("����ȣ�� �Է����ּ��� : ");
		id = input.next();
		System.out.println("1:��ȭ\t2.�Ҽ�\t3.����");
		System.out.println("���ڵ带 �Է����ּ��� : ");
		num = input.nextInt();
		System.out.println("�Ǽ��� �Է����ּ��� : ");
		cnt = input.nextInt();
		b2 = new Book(id,num,cnt);
		System.out.println(b1.toString());
		System.out.println(b2);
		//-	��ü ������ ����ȣ, ���ڵ�, �Ǽ��� �Է� �޾� ������ �Ű������� ����
	}

}
