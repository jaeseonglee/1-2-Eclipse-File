// �й�: 20165153 �̸�: ���缺 ����1��
import java.util.*;
public class Ex1 {
	public static void main(String [] args) {  // ���α׷� ����
		int [] count = new int[6];  // �迭 ����
		int [] array = {1,2,3,4,5,6};
		int cnt=0;
		
		for(int i=0; i<1000;i++){
			int num=(int)(Math.random() * 6) +1;  
			++count[num-1]; 
		}
		System.out.println("�ֻ��� ��: �� �� (��Ʈ��)");
		for(int d : count)
			System.out.printf("%d : %d\n", ++cnt, d);  
		
		System.out.println();
		System.out.println("�ֻ��� ��: �� �� (��Ʈ��)");
		for (int i=0; i<count.length-1; i++) {   // ���� ū���� ������ �����ϴ� ���� 
			int max=i;
			for(int n=i+1; n<count.length; n++) {
				if(count[max] < count[n] ) {
					max = n;
				}
			}
			int temp;
			temp = count[max];
			count[max] = count[i];
			count[i]= temp;
			
			int temp2;
			temp2 = array[max];
			array[max] = array[i];
			array[i]= temp2;	
		}
		cnt=0;
		for(int d : count) {
			System.out.printf("%d : %d\n", array[cnt++], d);
		}
	}//���α׷� ����

}
