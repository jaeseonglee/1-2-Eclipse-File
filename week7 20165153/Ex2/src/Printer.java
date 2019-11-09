// 과제2번 
public class Printer {
	protected String name;  // 모델명 
	protected String firm;  // 회사이름
	protected int page;  // 인쇄매수 
	protected String interfaceTypes; // 인터페이스 종류
	
	public Printer(String name, String firm, int page, String interfaceTypes) {
		this.name = name;
		this.firm = firm;
		this.page = page;
		this.interfaceTypes = interfaceTypes;	
	}
	public void print() { // 객체 내용 출력  
		System.out.println("모델명: "+name+" 회사이름: "+firm +" 인쇄매수: "+page+" 인터페이스 종류: "+interfaceTypes);
	}
}

class Inkjet_P extends Printer {
	private int ink; // 잉크 잔량
	
	public Inkjet_P(String name, String firm, int page, String interfaceTypes , int ink) {
		super(name,firm,page,interfaceTypes); 
		this.ink = ink;
	}
	
	public void print() { // 객체 내용 출력
		System.out.println("모델명: "+name+" 회사이름: "+firm +" 인쇄매수: "+page+" 인터페이스 종류: "+interfaceTypes+" 잉크 잔량: "+ink);
	}
}

class Laser_P extends Printer {
	private int toner; // 토너 잔량
	
	public Laser_P(String name, String firm, int page, String interfaceTypes , int toner) {
		super(name,firm,page,interfaceTypes);
		this.toner = toner;
	}
	
	public void print() { // 객체 내용 출력
		System.out.println("모델명: "+name+" 회사이름: "+firm +" 인쇄매수: "+page+" 인터페이스 종류: "+interfaceTypes+" 토너 잔량: "+toner);
	}
}







