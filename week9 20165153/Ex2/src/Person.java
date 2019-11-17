
public abstract class Person {
	protected String name;
	protected int age;
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	public void disPlay() {
		System.out.print("�̸�: "+name + "\t ����: "+age);
	}
};


class Customer extends Person {
	private String type;
	private int point;
	
	public Customer(String name, int age, char ch) {
		super(name, age);
		if(ch == 'g' || ch=='G') {
			type = "�Ϲ�";
			point = 500;
		} else if (ch == 'v' || ch=='V') {
			type = "���";
			point = 1000;
		} else if (ch == 's' || ch=='S') {
			type = "�ֿ��";
			point = 1500;
		}
	}
	public void disPlay() {
		super.disPlay();
		System.out.print(" ������ : "+type +"\t����Ʈ : "+point);
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
		System.out.print(" �й� : "+num +" \t�ڹټ��� : "+grade);
	}
}
