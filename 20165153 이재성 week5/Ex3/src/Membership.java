// 과제 3번 
public class Membership {
	private String name; // 이름
	private String num;  // 전화번호
	private int age;  // 나이
	private char member;  // 회워구분
	private int benefit;  // 대출이율
	private int point;  // 포인트
	
	public Membership(String name,String num,int age,char member,int point) {
		this.name = name;
		this.num = num;
		this.age  = age;
		this.member = member;
		this.point = point;
	}
	
	public int rateProc(){ // 회원구분과 포인트에 따라 대출이율을 결정하는 메소드 
		if (member == 'v' ) {
			if(point >= 1000) {
				benefit = 6;
			} else {
				benefit = 7;
			}	
		}
		if (member == 'g' ){
			if(point >=2000) {
				benefit = 8;
			} else{
				benefit = 9;
			}
		}
		return benefit;
	}
	
	public String memberType() { // 회원구분하는 메소드 
		if (member == 'v') {
			return "VIP회원";
		} else {
			return "일반 회원";
		}
	}
	
	public void display() {// 고객 정보를 출력하는 메소드
		System.out.println("이름 : "+name +", 전화번호 : "+num +", 나이 : "+age+ 
				", 포인트 : "+point+", 대출이율 : " +rateProc()+", 회원구분 : "+memberType());
	}
}
