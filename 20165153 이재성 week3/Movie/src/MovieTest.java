
public class MovieTest {
	public static void main(String [] args) {
		Movie a = new Movie();
		Movie b = new Movie();
		
		a.name="��ȭA";
		a.director="�� ����";
		a.grade= 8;
		a.year=2010;
		System.out.println(a.write());
				
		b.name="��ȭB";
		b.director="�� ����";
		b.grade=7;
		b.year=2013;
		System.out.println(b.write());
	}

}
