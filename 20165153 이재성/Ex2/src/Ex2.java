// ���� 2��
import java.util.*;
public class Ex2 {
	public static void main (String[]args) {// ���α׷� ����
		int [] seats = new int[10];
		char[] array = {'A','B','C','D','E','F','G','H','I','J'}; // ���� �迭 ����
		
		while(true) {
			System.out.println("----------------------------");
			for (int i = 0; i < seats.length; i++)
				System.out.print(array[i] + " "); 
			System.out.println("\n----------------------------");
			for (int i = 0; i < seats.length; i++)
				System.out.print(seats[i] + " ");  
			System.out.println("\n----------------------------");

			System.out.print("���Ͻô� �¼���ȣ�� �Է��ϼ���(����� 1): ");
			Scanner scan = new Scanner(System.in);
			char s = scan.next().charAt(0); // Ű����κ��� ���ڷ� �Է¹ޱ�
			
			if (s == '1')
				break;
			switch (s) //switch ���� ���� ���ڷ� ���� �ý��� Ȯ��
			{   
			   case 'A':
				   if(seats[0] == 0) {
					   seats[0] = 1;
					   System.out.println("����Ǿ����ϴ�.");
				   }
				   else {
					   System.out.println("�̹� ����� �ڸ��Դϴ�.");
				   }
				   break;
			   case 'B':
				   if(seats[0] == 0) {
					   seats[0] = 1;
					   System.out.println("����Ǿ����ϴ�.");
				   }
				   else {
					   System.out.println("�̹� ����� �ڸ��Դϴ�.");
				   }
				   break;
			   case 'C':
				   if(seats[0] == 0) {
					   seats[0] = 1;
					   System.out.println("����Ǿ����ϴ�.");
				   }
				   else {
					   System.out.println("�̹� ����� �ڸ��Դϴ�.");
				   }
				   break;
			   case 'D':
				   if(seats[0] == 0) {
					   seats[0] = 1;
					   System.out.println("����Ǿ����ϴ�.");
				   }
				   else {
					   System.out.println("�̹� ����� �ڸ��Դϴ�.");
				   }
				   break;
			   case 'E':
				   if(seats[0] == 0) {
					   seats[0] = 1;
					   System.out.println("����Ǿ����ϴ�.");
				   }
				   else {
					   System.out.println("�̹� ����� �ڸ��Դϴ�.");
				   }
				   break;
			   case 'F':
				   if(seats[0] == 0) {
					   seats[0] = 1;
					   System.out.println("����Ǿ����ϴ�.");
				   }
				   else {
					   System.out.println("�̹� ����� �ڸ��Դϴ�.");
				   }
				   break;
			   case 'G':
				   if(seats[0] == 0) {
					   seats[0] = 1;
					   System.out.println("����Ǿ����ϴ�.");
				   }
				   else {
					   System.out.println("�̹� ����� �ڸ��Դϴ�.");
				   }
				   break;
			   case 'H':
				   if(seats[0] == 0) {
					   seats[0] = 1;
					   System.out.println("����Ǿ����ϴ�.");
				   }
				   else {
					   System.out.println("�̹� ����� �ڸ��Դϴ�.");
				   }
				   break;
			   case 'I':
				   if(seats[0] == 0) {
					   seats[0] = 1;
					   System.out.println("����Ǿ����ϴ�.");
				   }
				   else {
					   System.out.println("�̹� ����� �ڸ��Դϴ�.");
				   }
				   break;
			   case 'J':
				   if(seats[0] == 0) {
					   seats[0] = 1;
					   System.out.println("����Ǿ����ϴ�.");
				   }
				   else {
					   System.out.println("�̹� ����� �ڸ��Դϴ�.");
				   }
				   break;
			}
		}
	} // ���α׷� ���� 

}
