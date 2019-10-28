import java.util.*;
public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle();
		Scanner input = new Scanner(System.in);
		
		System.out.print("사각형의 가로를 입력해주세요 : ");
		r.w = input.nextInt();
		System.out.print("사각형의 세로를 입력해주세요 : ");
		r.h = input.nextInt();
		
		System.out.println("입력하신 가로와 세로에 대한 사각형의 넓이는 "+r.area() +" 입니다.");
		System.out.println("입력하신 가로와 세로에 대한 사각형의 둘레는 "+r.perimeter()+" 입니다.");

	}

}
