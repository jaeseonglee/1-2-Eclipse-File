// 과제 2~5번
import java.util.*;
public class Answer2 {
	public static void main(String[] args) {
		int num;
		int age;
		String name;
		Scanner key = new Scanner(System.in);
		Person [] obj = new Person[5];
		//부모 클래스 타입으로 객체 배열을 선언하고 생성한다. 배열크기는 5
		
		//1번을 입력하면 Customer 객체를 2번을 입력하면 Student객체를 
		//생성하여 배열에 저장한다. 단, 필요한 값은 입력을 받으며
		//이름과 나이, 학번, 점수를 입력할 때는 제시된 메소드를 사용한다.
		for(int i=0; i<obj.length; i++) {
			System.out.print("1: Customer 객체 생성 \t2: Student 객체 생성: ");
			num= key.nextInt();
			name = Answer2.input("이름: ", key);
			age = Answer2.digit("나이: ", key);
			
			if(num == 1) {
				System.out.print("고객구분: ");
				char ch = key.next().charAt(0);
				obj[i] = new Customer( name ,age,ch);
			} else if( num==2) {
				String number = Answer2.input("학번: ", key);
				int grade = Answer2.digit("점수: ", key);
				obj[i] = new Student(name ,age, number , grade);
			}
		}
		
		System.out.println("\n==== 객체 내용 출력 ====");
		for(Person obj2 : obj) {
			obj2.disPlay();
			System.out.println();
			if(obj2 instanceof Customer == true) {
				( (Customer) obj2).addPoint(500);
			}
		}
		//배열에 저장된 객체내용을 출력하면서 Customer 객체의 포인트를 500씩 
		//증가, 객체 내용 출력 시 foreach 구문을 사용할 것

		System.out.println("\n==== Customer 객체만 출력 ====");
		//배열에 저장 된 객체 중 Customer 객체만 출력
		for(Person obj3 : obj) {
			if(obj3 instanceof Customer == true) {
				( (Customer) obj3).disPlay();
				System.out.println();
			}
		}
		
	}
	 static String input(String str, Scanner key){
		System.out.print(str);
		return key.next();
	}
		
	static int digit(String str, Scanner key){
		System.out.print(str);
		return key.nextInt();
	}
}
