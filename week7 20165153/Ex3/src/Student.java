// 각 클래스는 생성자, 접근자, 변경자 메소드를 갖는다
public class Student {  // 대학생
	protected String name; // 모든 학생은 이름, 학번, 학과, 학년, 이수학점 수를 갖는다
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
	 public String getName() { return name; } // 이름 접근자
	 public void setName(String name) { this.name = name; } // 이름 설정자
	 public int getNumber() { return number; } // 학번 접근자 
	 public void setNumber(int number) { this.number = number; } // 학번 설정자
	 public String getMajor() { return major; } // 학과 접근자
	 public void setMajor(String major) { this.major = major; } // 학과 설정자
	 public int getLevel() {return level; } // 학년 접근자
	 public void setLevel(int level) {this.level = level; } // 학년 설정자
	 public int getGrade() {return grade; } // 이수학점 수 접근자
	 public void setGrade(int grade) { this.grade = grade; } // 이수학점 수 설정자
	 
	 // 각 클래스는 객체 내용을 반환하는 toString() 메소드를 갖는다
	 public String toString() {
		 return "\n이름 :"+name+ "\n학번:"+number+"\n학과:"+major+"\n학년:"+level+"\n이수학점:"+grade;	  
	 } 
	
}

class Undergraduate extends Student{ // 학부생
	private String clubName; // 학부생은 동아리명을 갖는다. 
	
	public Undergraduate(String name, int number, String major, int level, int grade, String clubName){
		super(name,number,major,level,grade);
		this.clubName = clubName;
	}
	public String getClubName() { return clubName; } // 동아리명 접근자
	public void setClubName() { this.clubName = clubName; } // 동아리명 설정자 
	
	public String toString() {
		 return super.toString()+"\n동아리명:"+clubName;	  
	}
}

class GraduateStudent extends Student{ // 대학원생
	private String assistant; 
	private double scholarship; //  대학원생은 조교유형과 장학금 비율을 갖는다. 조교유형은 교육조교와 연구조교가 있고, 장학금 비율은 0과1사이의 값
    
	public GraduateStudent(String name, int number, String major, int level, int grade, String assistant, double scholarship){
		super(name,number,major,level,grade);
		this.assistant = assistant;
		this.scholarship = scholarship;
	}
	public String getAssistant() { return assistant; } // 조교유형 접근자
	public void setAssistant(String assistant) { this.assistant = assistant; } // 조교유형 설정자
	public double getScholarship() { return scholarship; } // 장학금비율 접근자
	public void setScholarship(double scholarship) { this.scholarship = scholarship; } // 장학금비율 설정자
	
	public String toString() {
		 return super.toString()+"\n조교유형:"+assistant+"\n장학금비율:"+scholarship;	  
	 }
	
}
