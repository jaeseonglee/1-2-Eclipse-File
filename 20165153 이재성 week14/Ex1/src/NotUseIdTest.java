import java.util.*;
public class NotUseIdTest {
	public static void NotUseId (String str) throws Ex2{
		if (str.length() < 8 ||  !(str.charAt(0) >'A' && str.charAt(0) <'z' ) ) {
			throw new Ex2(str +"��  ����� �� ���� ���̵�");
		} else {
			System.out.println(str + "�� ��� ������ ���̵� �Դϴ�.");
		}
	}
	
	public static void main(String[] args) {
		try {
			Scanner key = new Scanner(System.in);
			String str;
			System.out.println("���̵� �Է��ϼ���");
			str = key.nextLine();
			NotUseId(str);
		} catch (Ex2 e) {
			System.out.println(e.getMessage());
		} 
	}
}
