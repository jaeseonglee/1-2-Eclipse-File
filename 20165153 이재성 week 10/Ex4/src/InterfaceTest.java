import java.util.*;
@FunctionalInterface
interface FPlay{
	void play(String str); // �Ű������� ���� ���ڿ��� ���, "OOO�� ��� �մϴ�"
}
@FunctionalInterface
interface FStop{
	void stop(String str); //�Ű������� ���� ���ڿ� ���, "OOO�� �ߴ��մϴ�"
}
public class InterfaceTest {
	public static void main(String[] args) {
		int num1, num2;
		Scanner input = new Scanner(System.in);
		FPlay play = (String str) -> System.out.println(str+"�� ����մϴ�."); 
		FStop stop = (String str) -> System.out.println(str+"�� �ߴ��մϴ�.");
		while(true) {
			System.out.print("1: MP3  2: CDPlay  3: WindowMediaPlay  4: ���� ==> ");
			num1 = input.nextInt();
			if (num1 == 4) {
				break;
			}
			System.out.print("1: Play 2: Stop ==> ");
			num2 = input.nextInt();
			if(num1 == 1) {
				if(num2 ==1) play.play("MP3");
				else if (num2==2) stop.stop("MP3");
			}
			if(num1 == 2) {
				if(num2 ==1) play.play("CDPlay");
				else if (num2==2) stop.stop("CDPlay");
			}
			if(num1 == 3) {
				if(num2 ==1) play.play("WindowMediaPlay");
				else if (num2==2) stop.stop("WindowMediaPlay");
			}
		}
		
	}
}
