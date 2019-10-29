// 과제 2번
public class Menu {
	private String menu;  // 메뉴명
	private int danga;  // 단가 
	private int cnt;  // 개수
	private int price;  // 가격
	
	public Menu(String menu , int danga ,int cnt ) {
		this.menu = menu;
		this.danga =danga;
		this.cnt = cnt;
		this.price = danga * cnt;
	}
	
	public int getPrice() {//가격 필드 값을 반환하는 접근자 메소드 
		return price;
	}
	
	public String toString() {//객체 내용(메뉴,단가,개수,가격)을 문자열로 반환하는 toString()
		return "메뉴 : " + menu +", 단가 : " +danga +", 개수 : " + cnt +", 가격 : " + price;
	}
}
