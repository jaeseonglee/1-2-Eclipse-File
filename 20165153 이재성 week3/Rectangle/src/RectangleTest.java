import java.util.*;
public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle();
		Scanner input = new Scanner(System.in);
		
		System.out.print("�簢���� ���θ� �Է����ּ��� : ");
		r.w = input.nextInt();
		System.out.print("�簢���� ���θ� �Է����ּ��� : ");
		r.h = input.nextInt();
		
		System.out.println("�Է��Ͻ� ���ο� ���ο� ���� �簢���� ���̴� "+r.area() +" �Դϴ�.");
		System.out.println("�Է��Ͻ� ���ο� ���ο� ���� �簢���� �ѷ��� "+r.perimeter()+" �Դϴ�.");

	}

}
