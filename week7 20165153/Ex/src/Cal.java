
public abstract class Cal {//��Ŭ�������� ����Ǵ� �κ��� ����Ŭ������ ����, �߻�Ŭ����
	protected int a,b;  //������ ���� �ǿ�����
	
	public Cal( int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("����Ŭ���� ������");
	}
	//�߻�޼ҵ�޼ҵ� - ����Ŭ���������ݵ���������Ͽ����
	abstract int calculate(); 
	
	public String toString() {
		return "a= " + a +  ",  b =" + b;
	}
};

class Add extends Cal{//CalŬ��������ӹ޴¼���Ŭ���� Add
	public Add(int a, int b) {
		super(a,b);  //����Ŭ����������ȣ�� - �ʵ��ʱ�ȭ
	    System.out.println("Add ������");
	}
	public int calculate() { //����Ŭ������  calculate() �޼ҵ�������
		return a+b;
	}
	//����Ŭ���� toString()�޼ҵ带 ȣ���Ͽ� �ʵ峻�����
	public String toString() {
		return "[+] " +super.toString() + " => " +  calculate();
	}
}

class Mod extends Cal {  //CalŬ��������ӹ޴¼���Ŭ����Mod
	public Mod (int a, int b) {
		super(a,b);
		System.out.println("Mod ������");
	}
	int calculate() {  //����Ŭ������ calculate() ������
		return a%b;
	}
	public String toString() {
		return"[%] " +super.toString() + " => " +  calculate();
	}

}


