// ��ü �迭�� ����Ͽ� ó��
import java.util.*;
public class EmployeeTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		Employee [] obj = new Employee[4];
		
		for(int i=0; i<obj.length; i++) {
			System.out.print("\n�̸� �Է�: ");
			String name = key.nextLine();
			System.out.print("���� �Է�: ");
			int sal = key.nextInt();
			          key.nextLine();
			//����ڷκ����Է¹����������������ĸŰ�����������
			        //�����Ȱ�ü����������ü�迭 i��°������
			          obj[i] = new Employee(name,sal);
		}
		//��ü�迭�������
		for(Employee em : obj) {
			System.out.println(em);
		}
		//������ �������� ������ �� ��� - �����ۼ�
		ArraySort sort = new ArraySort();
		sort.dim_sort(obj);
		// �ʵ� count �� ��� - �����ۼ�
		System.out.println("��ü�� ���: "+obj[3].getCount());
		
		
		
	}
}
