// ���� 2��
public class Menu {
	private String menu;  // �޴���
	private int danga;  // �ܰ� 
	private int cnt;  // ����
	private int price;  // ����
	
	public Menu(String menu , int danga ,int cnt ) {
		this.menu = menu;
		this.danga =danga;
		this.cnt = cnt;
		this.price = danga * cnt;
	}
	
	public int getPrice() {//���� �ʵ� ���� ��ȯ�ϴ� ������ �޼ҵ� 
		return price;
	}
	
	public String toString() {//��ü ����(�޴�,�ܰ�,����,����)�� ���ڿ��� ��ȯ�ϴ� toString()
		return "�޴� : " + menu +", �ܰ� : " +danga +", ���� : " + cnt +", ���� : " + price;
	}
}
