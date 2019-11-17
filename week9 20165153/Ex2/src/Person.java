
public abstract class Person {
	protected String name;
	protected int age;
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	public void disPlay() {
		System.out.print("이름: "+name + "\t 나이: "+age);
	}
};


class Customer extends Person {
	private String type;
	private int point;
	
	public Customer(String name, int age, char ch) {
		super(name, age);
		if(ch == 'g' || ch=='G') {
			type = "일반";
			point = 500;
		} else if (ch == 'v' || ch=='V') {
			type = "우수";
			point = 1000;
		} else if (ch == 's' || ch=='S') {
			type = "최우수";
			point = 1500;
		}
	}
	public void disPlay() {
		super.disPlay();
		System.out.print(" 고객구분 : "+type +"\t포인트 : "+point);
	}
	public void addPoint(int num) {
		point += num;
	}
}; 


class Student extends Person {
	private String num;
	private int grade;
	
	public Student(String name, int age, String num, int grade) {
		super(name, age);
		this.num = num;
		this.grade = grade;
	}
	public void disPlay() {
		super.disPlay();
		System.out.print(" 학번 : "+num +" \t자바성적 : "+grade);
	}
}
