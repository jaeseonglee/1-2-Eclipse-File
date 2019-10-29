
public class Student {
	//접근제어가 private 이면 클래스 내부에서만 사용할 수 있다.
	private String name; //이름 저장, 전용 멤버
	private int java, eng; //과목 저장, 전용 멤버

	//객체를 초기화 하는 생성자
	public Student(String name, int java, int eng){
		this.name= name; //필드와 매개변수명이 같으면 필드명 앞에 this를 사용
		this.java=java;
		this.eng=eng;
	}

	//name필드값을 반환하는 접근자 메소드
	public String getName(){ 
		return name;
	}

	//name필드값을 변경하는 설정자 메소드
	public void setName(String name){ 
		this.name= name;
	}

	public int hap(){ //과목 합을 계산하여 반환하는 메소드
		return java+eng;
	}

	public String toString(){ //객체 내용(이름, 과목성적, 합)을 문자열로 반환하는 메소드
	String str="이름 : "+ name;
	str+= "\njava : "+ java+ "\teng : "+ eng;
	str+= "\n과목합 : "+ hap();
	return str;
	}
}
