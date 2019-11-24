import java.util.*;

class Student{
	String name;
	int d1, d2;
	
	public Student(String name, int d1, int d2){
		this.name=name;
		this.d1=d1;
		this.d2=d2;
	}
	
	public int hap(){
		return d1+d2;
	}
	
	public String toString(){
		return" [이름 : " + name + ",  성적합 : " + hap() +"]" ;
	}
}


public class StudentTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Student> list = new ArrayList<Student>();
		String str;
		Student s1 = new Student("컴공",80,80);
		Student s2 = new Student("한림",70,95);
		Student s3 = new Student("강원도",45,82);
		Student s4 = new Student("춘천시",76,96);
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		System.out.println("===== ArrayList에 저장된 객체 출력 ========");
		for (int i = 0; i < list.size(); i++) 
			System.out.println(list.get(i).toString() );
		
		System.out.println("===== 성적검색 ========");
		System.out.print("===== 학생이름입력 : ");
		str = in.nextLine();
		for (int i = 0; i < list.size(); i++) {
			if ( (str.equals(list.get(i).name)) == true ) {
				System.out.println(list.get(i));
			}
		}
	}
}
