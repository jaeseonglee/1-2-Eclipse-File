
public class PrinterTest {
	public static void main(String[] args) {
		// 객체 생성 
		Printer p1 = new Printer("프린터A","회사 F",200,"A");
		Inkjet_P p2 = new Inkjet_P("프린터B","회사 R",400,"B",1000);
		Laser_P p3 = new Laser_P("프린터C","회사 O",300,"B",30);
		// 객체 내용 출력 
		p1.print();
		p2.print();
		p3.print();
	}
}
