import java.util.*;
public class BookTest {
	public static void main(String[] args) {
		Book b;//Book ���� ���� ����
		Scanner in = new Scanner(System.in);//�Է��� ���� Scanner ��ü ���� �� ����
		LinkedList<Book> B = new LinkedList<Book>();  //LinkedList<Book> ��ü ����
		int num;
		String number,title,author;
		
		
	do {System.out.println("1: ����   2:����  3:�˻�   4:����Ʈ���  5. ����");//�޴��� ����
		System.out.print("�޴��� �������ּ��� : ");
		num = in.nextInt();
		if(num == 1) { //1�� : ��ũ�� ����Ʈ�� ����- �ʿ��� �ڷ�� �Է��� �޴´�
			System.out.println("������ ������ȣ�� �Է����ּ��� : ");
			number = in.next();
			System.out.println("������ ���� �Է����ּ��� : ");
			title = in.next();
			System.out.println("������ ���ڸ� �Է����ּ��� : ");
			author = in.next();
			b = new Book(number,title,author);
			B.add(b);
		} if (num==2) {//2�� :�����ϰ��� �ϴ� å ������ �Է� ���� �� rentBook()�޼ҵ�� ó��
			System.out.print("�����ϰ��� �ϴ� å ������ �Է����ּ��� : ");
			title = in.next();
			for(int i =0; i< B.size(); i++) {
				B.get(i).rentBook(title);
			}
		} if (num==3) { //3�� :�˻��ϰ��� �ϴ� å ������ �Է� ���� �� ��ü ���� ���
			System.out.print("�˻��ϰ��� �ϴ� å ������ �Է����ּ���: ");
			title = in.next();
			for(int i =0; i< B.size(); i++) {
				System.out.println(B.get(i).toString());  
			}
		} if(num==4) { //4�� :��ũ�� ����Ʈ�� ���� �� ��� ���� ���
			System.out.print("��ũ�� ����Ʈ�� ��� ���� ��� : ");
			for (int i = 0; i < B.size(); i++)
		  		System.out.println(B.get(i));  //LinkedList �� ����� ���� ���
		} if (num==5) {//5�� : �ݺ��� ����
			break;
		}
	 } while(true);

	}
}
