import java.util.*;
@FunctionalInterface
interface FPlay{
	void play(String str); // 매개변수로 받은 문자열을 출력, "OOO을 재생 합니다"
}
@FunctionalInterface
interface FStop{
	void stop(String str); //매개변수로 받은 문자열 출력, "OOO을 중단합니다"
}
public class InterfaceTest {
	public static void main(String[] args) {
		int num1, num2;
		Scanner input = new Scanner(System.in);
		FPlay play = (String str) -> System.out.println(str+"을 재생합니다."); 
		FStop stop = (String str) -> System.out.println(str+"을 중단합니다.");
		while(true) {
			System.out.print("1: MP3  2: CDPlay  3: WindowMediaPlay  4: 종료 ==> ");
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
