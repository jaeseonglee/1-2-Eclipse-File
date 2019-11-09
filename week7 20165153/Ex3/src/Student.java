// �� Ŭ������ ������, ������, ������ �޼ҵ带 ���´�
public class Student {  // ���л�
	protected String name; // ��� �л��� �̸�, �й�, �а�, �г�, �̼����� ���� ���´�
	protected int number;
	protected String major;
	protected int level;
	protected int grade;
	
	public Student(String name, int number, String major, int level, int grade) {
		this.name = name;
		this.number = number;
		this.major = major;
		this.level = level;
		this.grade = grade;
	}
	 public String getName() { return name; } // �̸� ������
	 public void setName(String name) { this.name = name; } // �̸� ������
	 public int getNumber() { return number; } // �й� ������ 
	 public void setNumber(int number) { this.number = number; } // �й� ������
	 public String getMajor() { return major; } // �а� ������
	 public void setMajor(String major) { this.major = major; } // �а� ������
	 public int getLevel() {return level; } // �г� ������
	 public void setLevel(int level) {this.level = level; } // �г� ������
	 public int getGrade() {return grade; } // �̼����� �� ������
	 public void setGrade(int grade) { this.grade = grade; } // �̼����� �� ������
	 
	 // �� Ŭ������ ��ü ������ ��ȯ�ϴ� toString() �޼ҵ带 ���´�
	 public String toString() {
		 return "\n�̸� :"+name+ "\n�й�:"+number+"\n�а�:"+major+"\n�г�:"+level+"\n�̼�����:"+grade;	  
	 } 
	
}

class Undergraduate extends Student{ // �кλ�
	private String clubName; // �кλ��� ���Ƹ����� ���´�. 
	
	public Undergraduate(String name, int number, String major, int level, int grade, String clubName){
		super(name,number,major,level,grade);
		this.clubName = clubName;
	}
	public String getClubName() { return clubName; } // ���Ƹ��� ������
	public void setClubName() { this.clubName = clubName; } // ���Ƹ��� ������ 
	
	public String toString() {
		 return super.toString()+"\n���Ƹ���:"+clubName;	  
	}
}

class GraduateStudent extends Student{ // ���п���
	private String assistant; 
	private double scholarship; //  ���п����� ���������� ���б� ������ ���´�. ���������� ���������� ���������� �ְ�, ���б� ������ 0��1������ ��
    
	public GraduateStudent(String name, int number, String major, int level, int grade, String assistant, double scholarship){
		super(name,number,major,level,grade);
		this.assistant = assistant;
		this.scholarship = scholarship;
	}
	public String getAssistant() { return assistant; } // �������� ������
	public void setAssistant(String assistant) { this.assistant = assistant; } // �������� ������
	public double getScholarship() { return scholarship; } // ���бݺ��� ������
	public void setScholarship(double scholarship) { this.scholarship = scholarship; } // ���бݺ��� ������
	
	public String toString() {
		 return super.toString()+"\n��������:"+assistant+"\n���бݺ���:"+scholarship;	  
	 }
	
}
