import java.util.*;
public class Ex {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Student std;

//Student 클래스 객체 obj선언 & 생성, 생성자 매개변수로 필드초기값 전달
		Student obj=new Student("김낙준", 90, 80); 

		System.out.println("이름과 두 과목 성적을 입력하세요 :");
		String name=in.next();
		int java=in.nextInt();
		int eng=in.nextInt();

		//표준 입력장치로 입력받은 값을 객체 생성 시 생성자 매개변수로 전달
		std=new Student(name, java, eng);
		System.out.println(obj); //객체 내용 출력
		System.out.println(std); //객체 내용 출력

	}
	
}
