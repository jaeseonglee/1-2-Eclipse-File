// 과제 3번
public class Movie {
	public String name , director ; // 영화이름, 감독
	public int grade, year; // 평점, 연도
	
	public String write() {
		return "영화이름 : " + name+", 감독 : " +director +", 평점 : "+grade+"점, 발표된 연도 : " +year+"년";
	}
}
