// �й�: 20165153 �̸� : ���缺  ���� 1�� 
import java.util.*;
public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); 
		
		int x , y;
		System.out.print("������ġ�� x��ǥ�� �Է����ּ��� : "); //x��ǥ �Է¹ޱ�
		x = input.nextInt();
		System.out.print("������ġ�� y��ǥ�� �Է����ּ��� : "); //y��ǥ �Է¹ޱ�
		y = input.nextInt();
		
		boolean tile[][] = new boolean[20][20];
		int steps;

		tile[x][y] = true;
		for (steps = 0; steps < 10; steps++) {  // �̵������� �湮������ ������ continue�� ���� steps�� ���� �ʰ� �ݺ��� �ٽ� ����
			int direction = (int) (Math.random() * 4);
			if (direction == 0 && y > 0){
				if (tile[x][y-1] == true) {
					steps--;
					continue;
				}
				y--;                    
			}
			else if (direction == 1 && y < 19){
				if (tile[x][y+1] == true) {
					steps--;
					continue;
				}
				y++;
			}
			else if (direction == 2 && x > 0){
				if (tile[x-1][y] == true) {
					steps--;
					continue;
				}
				x--;
			}
			else if (x < 19){
				if(tile[x+1][y] == true) {
					steps--;
					continue;
				}
				x++;
			}
			tile[x][y] = true;

			System.out.println("----------------------------------------------------");
			for (int i = 0; i < 20; i++) {
				for (int j = 0; j < 20; j++) {
					if (tile[i][j] == true)
						System.out.printf("%3c", 'X');
					else
						System.out.printf("%3c", 'O');
				}
				System.out.println();
			}
			System.out.println("----------------------------------------------------");
		}
		System.out.println("��ü �̵� ���� = " + steps);
	}

}
