
public class StudentTest {
	public static void main(String[] args) {
		// ��ü ����
		Student s1 = new Student("�达 ", 20161111,"computer",1,15);
		Undergraduate s2 = new Undergraduate("�达 ", 20161111,"computer",1,15, "��մ� ���Ƹ�");
		GraduateStudent s3 = new GraduateStudent("�达 ", 20161111,"computer",1,15,"��������",0.63);
		
		// �����ڸ� ���� ��ü�� ���� ���� 
		s1.setNumber(20162222); 
		s2.setName("�̾�");
		s3.setLevel(4);
		s1.setGrade(18);
		s2.setLevel(3);
		s2.setMajor("math");
		s3.setName("�־�");
		s3.setNumber(20143333);
		s3.setGrade(11);
		// ��ü ���� ��� 
		System.out.println("����Ŭ���� ��� "+s1.toString());
		System.out.println("\n����Ŭ���� ���(Undergraduate) "+s2.toString());
		System.out.println("\n����Ŭ���� ���(GraduateStudent)"+s3);
	}

}
