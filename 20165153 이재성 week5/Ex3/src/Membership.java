// ���� 3�� 
public class Membership {
	private String name; // �̸�
	private String num;  // ��ȭ��ȣ
	private int age;  // ����
	private char member;  // ȸ������
	private int benefit;  // ��������
	private int point;  // ����Ʈ
	
	public Membership(String name,String num,int age,char member,int point) {
		this.name = name;
		this.num = num;
		this.age  = age;
		this.member = member;
		this.point = point;
	}
	
	public int rateProc(){ // ȸ�����а� ����Ʈ�� ���� ���������� �����ϴ� �޼ҵ� 
		if (member == 'v' ) {
			if(point >= 1000) {
				benefit = 6;
			} else {
				benefit = 7;
			}	
		}
		if (member == 'g' ){
			if(point >=2000) {
				benefit = 8;
			} else{
				benefit = 9;
			}
		}
		return benefit;
	}
	
	public String memberType() { // ȸ�������ϴ� �޼ҵ� 
		if (member == 'v') {
			return "VIPȸ��";
		} else {
			return "�Ϲ� ȸ��";
		}
	}
	
	public void display() {// �� ������ ����ϴ� �޼ҵ�
		System.out.println("�̸� : "+name +", ��ȭ��ȣ : "+num +", ���� : "+age+ 
				", ����Ʈ : "+point+", �������� : " +rateProc()+", ȸ������ : "+memberType());
	}
}
