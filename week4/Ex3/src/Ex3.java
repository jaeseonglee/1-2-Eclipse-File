// ���� 2��
import java.util.*;
public class Ex3 {
	public static void main(String[] args) { // ���α׷� ����
		Scanner input= new Scanner(System.in);
		String[] arr1 = {"A","B","C","D","E"}; 
		int[][] arr = new int[5][10]; // 2�����迭 
		String word; 
		int num; // Ű����κ��� �Է¹޴� ���ڿ��� ����
		
		for(int i=0; i<arr.length; i++) {
			for(int n=0; n<arr[i].length; n++) {
				arr[i][n] = 0;
			}
		} // 2���� �迭�� 0���� �ʱ�ȭ
		
		while(true) {
			System.out.println("----------------���� ���� ���----------------");
			System.out.println("��: 1 2 3 4 5 6 7 8 9 10");
			for(int i=0; i<arr.length; i++) {
				System.out.print(arr1[i]+": ");
				for(int n=0; n<arr[i].length; n++) {
					System.out.print(arr[i][n] +" ");
				}
				System.out.println();
			}
			System.out.println("---------------------------------------------");
			System.out.print("���Ͻô� ���� �����ϼ��� : (����� q �Ǵ� Q) : ");
			word = input.next();
			if( ( word.equals("q") || word.equals("Q") ) ==true ) {
				break;  // q �Ǵ� Q�� �ԷµǸ� �ݺ��� ����
			}
			System.out.print("���Ͻô� ��ȣ�� �����ϼ��� : ");
			num = input.nextInt();
			for(int i=0; i<arr.length; i++) {
				for (int n=0; n<arr[i].length; n++){
					if( ( word.equals(arr1[i]) && num == n+1 ) == true ){
						arr[i][n] = 1;
					}
				}
			}
			System.out.println("����Ǿ����ϴ�.");	
			System.out.println();
		}
	}// ���α׷� ���� 

}
