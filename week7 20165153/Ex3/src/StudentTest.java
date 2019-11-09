
public class StudentTest {
	public static void main(String[] args) {
		// 객체 생성
		Student s1 = new Student("김씨 ", 20161111,"computer",1,15);
		Undergraduate s2 = new Undergraduate("김씨 ", 20161111,"computer",1,15, "재밌는 동아리");
		GraduateStudent s3 = new GraduateStudent("김씨 ", 20161111,"computer",1,15,"교육조교",0.63);
		
		// 설정자를 통한 객체의 내용 변경 
		s1.setNumber(20162222); 
		s2.setName("이씨");
		s3.setLevel(4);
		s1.setGrade(18);
		s2.setLevel(3);
		s2.setMajor("math");
		s3.setName("최씨");
		s3.setNumber(20143333);
		s3.setGrade(11);
		// 객체 내용 출력 
		System.out.println("수퍼클래스 출력 "+s1.toString());
		System.out.println("\n서브클래스 출력(Undergraduate) "+s2.toString());
		System.out.println("\n서브클래스 출력(GraduateStudent)"+s3);
	}

}
