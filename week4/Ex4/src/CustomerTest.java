import java.util.*;
public class CustomerTest {
	public static void main(String[] args) {
		Customer c = new Customer(); // ��ü ���� �� ����
		Scanner input = new Scanner(System.in); 
		
		System.out.println("�̸��� �Է��ϼ��� : ");
		c.name = input.next();
		System.out.println("ī�� ���ݾ��� �Է��ϼ��� : ");
		c.money = input.nextInt(); // Ű����κ��� �̸��� ���ݾ� �Է¹ޱ�
		c.sort(); // ���ݾ׿� ���� �������ϴ� �޼ҵ�
		c.write(); // ��ü������ ����ϴ� �޼ҵ�
	}

}
