import java.util.*;
public class Ex {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Student std;

//Student Ŭ���� ��ü obj���� & ����, ������ �Ű������� �ʵ��ʱⰪ ����
		Student obj=new Student("�賫��", 90, 80); 

		System.out.println("�̸��� �� ���� ������ �Է��ϼ��� :");
		String name=in.next();
		int java=in.nextInt();
		int eng=in.nextInt();

		//ǥ�� �Է���ġ�� �Է¹��� ���� ��ü ���� �� ������ �Ű������� ����
		std=new Student(name, java, eng);
		System.out.println(obj); //��ü ���� ���
		System.out.println(std); //��ü ���� ���

	}
	
}
