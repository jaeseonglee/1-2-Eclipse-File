import java.util.*;
public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		double[][] dt = { {3.4, 5.6} , {2.3, 6.7} }; 
		char[][] ch;
		int row,col;
		
		System.out.println("��ũ�⸦ �Է��ϼ��� : ");
		row = key.nextInt();
		System.out.println("��ũ�⸦ �Է��ϼ��� : ");
		col = key.nextInt();
		
		ch = new char[row][col];
		for(int i=0; i<ch.length; i++) {
			for(int n =0; n<ch[i].length; n++) {
				System.out.print(i+"�� "+ n+"���� �Է��ϼ��� : ");
				ch[i][n] = key.next().charAt(0);
			}
		}
		for(char[] temp : ch) {
			for(char d : temp) {
				System.out.printf("%c " , d);
			}
			System.out.println();
		}
	}

}
