
public class PrinterTest {
	public static void main(String[] args) {
		// ��ü ���� 
		Printer p1 = new Printer("������A","ȸ�� F",200,"A");
		Inkjet_P p2 = new Inkjet_P("������B","ȸ�� R",400,"B",1000);
		Laser_P p3 = new Laser_P("������C","ȸ�� O",300,"B",30);
		// ��ü ���� ��� 
		p1.print();
		p2.print();
		p3.print();
	}
}
