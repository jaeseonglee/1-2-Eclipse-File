import java.util.*;
public class Ex1 {
	public static void main(String[] args) {
		int [] arr = new int[4];
		int [] num = new int[4];
		int count = 0;
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("1ȸ�� ���� ��ȣ�� PC�� �Է��ϼ���");
		for(int i =0; i<arr.length; i++) {
			arr[i] = (random.nextInt(9000)+1000);
			System.out.print(arr[i] +" ");
		}
		System.out.println();
		System.out.println("===�޴������� ������ 16�ڸ� ���ڸ� �Է��ϼ���");
		for(int n=0; n< num.length; n++) {
			System.out.print( n+1 +" : ");
			num[n] = input.nextInt();
		}
		for(int j=0; j<arr.length; j++) {
			if( num[j] != arr[j] ){
				System.out.println(j+1+"��° ���ڸ� �߸� �Է��ϼ̽��ϴ�");
				count++;
			}
		}
		if(count == 0) {
			System.out.println("���ȹ�ȣ �Է� �Ϸ�");
		}
		System.out.println("���α׷� �Ϸ�");		
	}
}
