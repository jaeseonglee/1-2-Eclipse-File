
public class Employee {
	//필드 선언(전용멤버) : 이름(String, name), 급여(int, salary), 연봉(long, pay), 객체수(int, count, static) - 본인작성
	private String name; //이름
	private int salary; // 급여
	private long pay; // 연봉
	private static int count; // 객체 수
	
	//생성자-매개변수로 받은 값(이름,급여)을 필드값으로 초기화, 객체수를 1증가, 연봉은 급여 * 12로 계산하여 초기화 - 본인작성
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
		pay = salary * 12;
		++count;
	}
	//객체수(count) 필드에 대한 접근자 메소드(static) - 본인작성
	public static int getCount() {
		return count;
	}
	//연봉(pay)핃드에 대한 접근자 메소드 - 본인작성
	public long getPay() {
		return pay;
	}
	public String toString(){
		return"이름: " + name +"\t월급: " + salary +"\t연봉: " + pay;
	} 

	
	
}
