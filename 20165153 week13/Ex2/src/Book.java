
public class Book {
	private String number;    //������ȣ
	private String title;       //����
	private String author;     //����
	private boolean status;   // ���� ����(���� ��-> true, ���Ⱑ�� -> false)
	
	//������ - �����ۼ�
	// ���� �Ű������� �ʵ� �ʱ�ȭ , �ʵ� status�� false�� �� ��
	public Book(String number, String title, String author) {
		this.number = number;
		this.title = title; 
		this.author = author;
		this.status = false; 
	} 
	
	// toString() �޼ҵ� - �����ۼ�
	//- ��ü ���¸� ���ڿ��� ��ȯ(������ȣ, ����, ����, �������
	public String toString() {
		return "������ȣ : " +number + " ���� : " + title+" ���� : " +author+" ������� : "+status;
	}
	//void rentBook() �޼ҵ� - �����ۼ�
	//- status �ʵ尪�� false�̸� true�� ������ �� ������Ϸᡱ ���
	//- ture �̸� ������ �Ұ�(���� ��)�� ���
	public void rentBook(String title) {
		if (this.title.equals(title)) {
			if (this.status == false) {
				this.status = true;
				System.out.println("����Ϸ�");
			} else {
				System.out.println("���� �Ұ�(���� ��)");
			}
		}
	}

}
