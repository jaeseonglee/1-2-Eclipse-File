// ���� 4�� 
import java.util.*;
public class Ex5 {
	public static void main(String [] args) { // ���α׷� ���� 
		Scanner input = new Scanner(System.in);
		int num; // Ű����κ��� �Է¹��� ���� 
		int sum = 0;  // ���� ����ϴ� ���� 
		int count = 0; // 1�� ���ʴ�� ���Ҷ� ����ϴ� ���� 
		System.out.print("�ϳ��� ���� �Է��ϼ��� : ");
		num = input.nextInt();
		
		while(true) {
			count += 1;
			sum += count;
			if (sum > num) {
				System.out.println("���α׷��� �����մϴ�. ");
				break;
			}
			System.out.println(count +": " + sum);
		}
	} // ���α׷� ���� 

}
