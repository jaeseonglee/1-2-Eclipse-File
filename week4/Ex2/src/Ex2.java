// �й� : 20165153 �̸� : ���缺 ���� 1��
public class Ex2 {

	public static void main(String[] args) {// ���α׷� ����
		// TODO Auto-generated method stub
		int[][] arr = {
				{78,48,78,98} ,
				{99,92} ,
				{29,64,83} ,
				{34,78,92,56}//����� �迭 ���� �� �ʱ�ȭ
		};
		int sum; // �� ���� ����
		double average; // ��� ���� ����
		
		for(int[] temp : arr) {
			for(int d : temp) {
				System.out.printf("%d " , d);
			}
			System.out.println();
		} // ����� �迭 ���
		for(int i=0; i<arr.length; i++) {
			sum=0;
			for (int n=0; n<arr[i].length; n++) {
				sum += arr[i][n];
			}
			average = (double) sum/arr[i].length;
			System.out.printf("%d ���� ���� %d�̰� ����� %4.2f �Դϴ�.",i,sum,average);
			System.out.println();
		}//�� ���� �հ� ��� ��� 
	}// ���α׷� ���� 

}
