import java.util.*;
public class MenuTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Menu m;
		String [] menu = {"�ܹ���","������ġ","ġ�ƽ","��������"};//�޴� �׸� �ش��ϴ� ���ڿ��� �迭�� �ʱ�ȭ
		int [] danga = {2500,1000,1500,2000};//�޴� �� �ܰ��� ������ �迭�� �ʱ�ȭ
		int choice;  // �޴� ��ȣ
		int total=0;  // ��ü ���� ���� 
		
		while(true) {
			System.out.println("\n1.�ܹ���\t2.������ġ\t3.ġ�ƽ\t4.��������\t5.����");
			System.out.print("�ش� �޴��� �Է��ϼ��� : ");
			choice = input.nextInt();
			if(choice == 5) {
				break;
			}
			System.out.print("������ �����ϼ��� : ");
			int cnt = input.nextInt();
			m = new Menu(menu[choice-1],danga[choice-1],cnt); // Menu ��ü ���� 
			total += m.getPrice();
			System.out.println(m.toString()); // ��ü ���� ��� 
			System.out.println("�Ѱ���: "+ total);
			total =0;
		}
	}

}
