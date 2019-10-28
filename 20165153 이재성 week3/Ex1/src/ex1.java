// 학번: 20165153 이름 : 이재성  과제 1번 
import java.util.*;
public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); 
		
		int x , y;
		System.out.print("시작위치의 x좌표를 입력해주세요 : "); //x좌표 입력받기
		x = input.nextInt();
		System.out.print("시작위치의 y좌표를 입력해주세요 : "); //y좌표 입력받기
		y = input.nextInt();
		
		boolean tile[][] = new boolean[20][20];
		int steps;

		tile[x][y] = true;
		for (steps = 0; steps < 10; steps++) {  // 이동했을때 방문한적이 있으면 continue를 통해 steps를 세지 않고 반복문 다시 시작
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
		System.out.println("전체 이동 수는 = " + steps);
	}

}
