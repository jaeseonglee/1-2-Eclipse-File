// ���� 3�� 
public class Customer {
	String name; // �̸�
	int money; // ī�� ��� �ݾ�
	String grade; // ������
	
	void write() {
		System.out.println("�̸�: "+name+" ���ݾ�: " +money+" ������: "+grade);
	} // ��ü ���� ��� 
	
	void sort() {
		if( (money >= 0) && (money <5000 ) == true ) {
			grade = "�Ϲ�";
		}
		else if( (money >= 5000) && (money <10000 ) == true ) {
			grade = "���";
		}
		else if( (money >= 10000) == true ) {
			grade = "�ֿ��";
		}
	} // ��� �ݾ׿� ���� ������ �ʱ�ȭ
}
