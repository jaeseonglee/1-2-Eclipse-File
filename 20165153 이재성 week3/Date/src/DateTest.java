import java.util.*;
public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date da = new Date(); //��ü ����
		Scanner input = new Scanner(System.in);
		
		System.out.print("������ �Է����ּ��� : ");
		da.years =input.nextInt();
		System.out.print("���� �Է����ּ��� : ");
		da.month = input.nextInt();
		System.out.print("���� �Է����ּ��� : ");
		da.day = input.nextInt(); // ����,��,�� �Է¹ޱ�
		
		System.out.println(da.display1());
		System.out.println(da.display2());
	}

}
