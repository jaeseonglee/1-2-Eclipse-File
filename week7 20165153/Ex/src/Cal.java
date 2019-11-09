
public abstract class Cal {//각클래스에서 공통되는 부분을 수퍼클래스로 정의, 추상클래스
	protected int a,b;  //연산을 위한 피연산자
	
	public Cal( int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("수퍼클래스 생성자");
	}
	//추상메소드메소드 - 서브클래스에서반드시재정의하여사용
	abstract int calculate(); 
	
	public String toString() {
		return "a= " + a +  ",  b =" + b;
	}
};

class Add extends Cal{//Cal클래스를상속받는서브클래스 Add
	public Add(int a, int b) {
		super(a,b);  //수퍼클래스생성자호출 - 필드초기화
	    System.out.println("Add 생성자");
	}
	public int calculate() { //수퍼클래스의  calculate() 메소드재정의
		return a+b;
	}
	//수퍼클래스 toString()메소드를 호출하여 필드내용출력
	public String toString() {
		return "[+] " +super.toString() + " => " +  calculate();
	}
}

class Mod extends Cal {  //Cal클래스를상속받는서브클래스Mod
	public Mod (int a, int b) {
		super(a,b);
		System.out.println("Mod 생성자");
	}
	int calculate() {  //수퍼클래스의 calculate() 재정의
		return a%b;
	}
	public String toString() {
		return"[%] " +super.toString() + " => " +  calculate();
	}

}


