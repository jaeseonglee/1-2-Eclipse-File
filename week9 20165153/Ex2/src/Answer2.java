// ���� 2~5��
import java.util.*;
public class Answer2 {
	public static void main(String[] args) {
		int num;
		int age;
		String name;
		Scanner key = new Scanner(System.in);
		Person [] obj = new Person[5];
		//�θ� Ŭ���� Ÿ������ ��ü �迭�� �����ϰ� �����Ѵ�. �迭ũ��� 5
		
		//1���� �Է��ϸ� Customer ��ü�� 2���� �Է��ϸ� Student��ü�� 
		//�����Ͽ� �迭�� �����Ѵ�. ��, �ʿ��� ���� �Է��� ������
		//�̸��� ����, �й�, ������ �Է��� ���� ���õ� �޼ҵ带 ����Ѵ�.
		for(int i=0; i<obj.length; i++) {
			System.out.print("1: Customer ��ü ���� \t2: Student ��ü ����: ");
			num= key.nextInt();
			name = Answer2.input("�̸�: ", key);
			age = Answer2.digit("����: ", key);
			
			if(num == 1) {
				System.out.print("������: ");
				char ch = key.next().charAt(0);
				obj[i] = new Customer( name ,age,ch);
			} else if( num==2) {
				String number = Answer2.input("�й�: ", key);
				int grade = Answer2.digit("����: ", key);
				obj[i] = new Student(name ,age, number , grade);
			}
		}
		
		System.out.println("\n==== ��ü ���� ��� ====");
		for(Person obj2 : obj) {
			obj2.disPlay();
			System.out.println();
			if(obj2 instanceof Customer == true) {
				( (Customer) obj2).addPoint(500);
			}
		}
		//�迭�� ����� ��ü������ ����ϸ鼭 Customer ��ü�� ����Ʈ�� 500�� 
		//����, ��ü ���� ��� �� foreach ������ ����� ��

		System.out.println("\n==== Customer ��ü�� ��� ====");
		//�迭�� ���� �� ��ü �� Customer ��ü�� ���
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
