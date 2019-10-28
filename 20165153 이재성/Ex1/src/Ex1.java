// 학번: 20165153 이름: 이재성 과제1번
import java.util.*;
public class Ex1 {
	public static void main(String [] args) {  // 프로그램 시작
		int [] count = new int[6];  // 배열 선언
		int [] array = {1,2,3,4,5,6};
		int cnt=0;
		
		for(int i=0; i<1000;i++){
			int num=(int)(Math.random() * 6) +1;  
			++count[num-1]; 
		}
		System.out.println("주사위 면: 빈도 수 (소트전)");
		for(int d : count)
			System.out.printf("%d : %d\n", ++cnt, d);  
		
		System.out.println();
		System.out.println("주사위 면: 빈도 수 (소트후)");
		for (int i=0; i<count.length-1; i++) {   // 가장 큰값이 앞으로 오게하는 정렬 
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
	}//프로그램 종료

}
