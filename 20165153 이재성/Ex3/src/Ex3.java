// ���� 3��
import java.util.*;
public class Ex3 {

	public static void main(String[] args) {// ���α׷� ����
		// TODO Auto-generated method stub
		String [] answer = {"�ϳ�","��","��","��","�ټ�","����","�ϰ�","����","��ȩ","��"}; 
		Scanner input = new Scanner(System.in); 
		int num; 
		
		while(true) {
			System.out.print("1���� 10������ ���� �Է� : ");
			num = input.nextInt();
			if( (num>0 && num<11) ) {
				System.out.println(answer[num-1]);
			}
		    else {
		    	System.out.println("���α׷� ���� ");
				break;
		    }
		}
	}// ���α׷� ���� 

}
