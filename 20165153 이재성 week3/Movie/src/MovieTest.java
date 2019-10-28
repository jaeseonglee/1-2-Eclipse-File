
public class MovieTest {
	public static void main(String [] args) {
		Movie a = new Movie();
		Movie b = new Movie();
		
		a.name="영화A";
		a.director="김 감독";
		a.grade= 8;
		a.year=2010;
		System.out.println(a.write());
				
		b.name="영화B";
		b.director="이 감독";
		b.grade=7;
		b.year=2013;
		System.out.println(b.write());
	}

}
