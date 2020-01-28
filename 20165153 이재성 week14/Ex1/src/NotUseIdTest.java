import java.util.*;
public class NotUseIdTest {
	public static void NotUseId (String str) throws Ex2{
		if (str.length() < 8 ||  !(str.charAt(0) >'A' && str.charAt(0) <'z' ) ) {
			throw new Ex2(str +"는  사용할 수 없는 아이디");
		} else {
			System.out.println(str + "는 사용 가능한 아이디 입니다.");
		}
	}
	
	public static void main(String[] args) {
		try {
			Scanner key = new Scanner(System.in);
			String str;
			System.out.println("아이디를 입력하세요");
			str = key.nextLine();
			NotUseId(str);
		} catch (Ex2 e) {
			System.out.println(e.getMessage());
		} 
	}
}
