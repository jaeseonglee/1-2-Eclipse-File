import java.util.*;
public class TestDraw {
	public static void main(String[] args) {
		int num,x;
		char ch;
		ShapeDraw s;
		Scanner input = new Scanner(System.in);
		
		System.out.println("1. Rctengle \t2. Triangle \t3. Ladder \t4. Finish");
		System.out.print("�޴��� �����ϼ���: ");
		num = input.nextInt();		
		
		switch (num) {
		
		case 1 :
			System.out.print("�� ũ�⸦ �Է��ϼ���: ");
			x = input.nextInt();
			System.out.print("���ڸ� �Է��ϼ���: ");
			ch = input.next().charAt(0);
			s = new Rectangle();
			s.draw(x, ch);
			break;
			
		case 2 :
			System.out.print("�� ũ�⸦ �Է��ϼ���: ");
			x = input.nextInt();
			System.out.print("���ڸ� �Է��ϼ���: ");
			ch = input.next().charAt(0);
			s = new Triangle();
			s.draw(x, ch);
			break;
		
		case 3 :
			System.out.print("�� ũ�⸦ �Է��ϼ���: ");
			x = input.nextInt();
			System.out.print("���ڸ� �Է��ϼ���: ");
			ch = input.next().charAt(0);
			s = new Ladder();
			s.draw(x, ch);
		    break;
		
		case 4 :
			break;
		}
		
	}
}
