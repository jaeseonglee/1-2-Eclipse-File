// ����2�� 
public class Printer {
	protected String name;  // �𵨸� 
	protected String firm;  // ȸ���̸�
	protected int page;  // �μ�ż� 
	protected String interfaceTypes; // �������̽� ����
	
	public Printer(String name, String firm, int page, String interfaceTypes) {
		this.name = name;
		this.firm = firm;
		this.page = page;
		this.interfaceTypes = interfaceTypes;	
	}
	public void print() { // ��ü ���� ���  
		System.out.println("�𵨸�: "+name+" ȸ���̸�: "+firm +" �μ�ż�: "+page+" �������̽� ����: "+interfaceTypes);
	}
}

class Inkjet_P extends Printer {
	private int ink; // ��ũ �ܷ�
	
	public Inkjet_P(String name, String firm, int page, String interfaceTypes , int ink) {
		super(name,firm,page,interfaceTypes); 
		this.ink = ink;
	}
	
	public void print() { // ��ü ���� ���
		System.out.println("�𵨸�: "+name+" ȸ���̸�: "+firm +" �μ�ż�: "+page+" �������̽� ����: "+interfaceTypes+" ��ũ �ܷ�: "+ink);
	}
}

class Laser_P extends Printer {
	private int toner; // ��� �ܷ�
	
	public Laser_P(String name, String firm, int page, String interfaceTypes , int toner) {
		super(name,firm,page,interfaceTypes);
		this.toner = toner;
	}
	
	public void print() { // ��ü ���� ���
		System.out.println("�𵨸�: "+name+" ȸ���̸�: "+firm +" �μ�ż�: "+page+" �������̽� ����: "+interfaceTypes+" ��� �ܷ�: "+toner);
	}
}







