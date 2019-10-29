// ���� 4�� 
public class Book {
	private String id;  //����ȣ
	private String book;  // ��������
	private int cnt;  // �Ǽ�
	private int rental;  //  �뿩��
	private int money; // �뿩�ݾ�
	
	public Book(String id) {//����ȣ�� �ʱ�ȭ �ϰ� ������ �ʵ�� ��� 0���� �ϴ� ������
		this.id = id;
		book = "0";
		cnt = 0;
		rental = 0;
		money = 0;
	}
	public Book(String id , int bookCode , int cnt) {
		//����ȣ, ���ڵ�, �Ǽ��� �Ű������� �޾� ���������� �뿩��, �뿩�ݾ�(�Ǽ� * �뿩��)�� ����ϴ� ������
		this.id =id;
		this.cnt = cnt;
		if(bookCode == 1) {
			book = "��ȭ";
			rental = 300;
			money = cnt * rental;
		} else if (bookCode == 2) {
			book = "�Ҽ�";
			rental = 400;
			money = cnt * rental;
		} else if (bookCode == 3) {
			book = "����";
			rental = 500;
			money = cnt * rental;
		}	
	}
	public String toString() { // ��ü���¸� ��ȯ�ϴ� �޼ҵ� 
		return "����ȣ: " +id+ ", ��������: "+book+", �Ǽ�: "
				+cnt+", �뿩��: " + rental+", �뿩�ݾ�: " +money;
	}
}
