
public class Employee {
	//�ʵ� ����(������) : �̸�(String, name), �޿�(int, salary), ����(long, pay), ��ü��(int, count, static) - �����ۼ�
	private String name; //�̸�
	private int salary; // �޿�
	private long pay; // ����
	private static int count; // ��ü ��
	
	//������-�Ű������� ���� ��(�̸�,�޿�)�� �ʵ尪���� �ʱ�ȭ, ��ü���� 1����, ������ �޿� * 12�� ����Ͽ� �ʱ�ȭ - �����ۼ�
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
		pay = salary * 12;
		++count;
	}
	//��ü��(count) �ʵ忡 ���� ������ �޼ҵ�(static) - �����ۼ�
	public static int getCount() {
		return count;
	}
	//����(pay)���忡 ���� ������ �޼ҵ� - �����ۼ�
	public long getPay() {
		return pay;
	}
	public String toString(){
		return"�̸�: " + name +"\t����: " + salary +"\t����: " + pay;
	} 

	
	
}
