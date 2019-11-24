import java.util.*;
public class Ex1 {
	public static void main(String[] args) {
		int [] arr = new int[4];
		int [] num = new int[4];
		int count = 0;
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("1회용 보안 번호를 PC에 입력하세요");
		for(int i =0; i<arr.length; i++) {
			arr[i] = (random.nextInt(9000)+1000);
			System.out.print(arr[i] +" ");
		}
		System.out.println();
		System.out.println("===휴대폰에서 생성된 16자리 숫자를 입력하세요");
		for(int n=0; n< num.length; n++) {
			System.out.print( n+1 +" : ");
			num[n] = input.nextInt();
		}
		for(int j=0; j<arr.length; j++) {
			if( num[j] != arr[j] ){
				System.out.println(j+1+"번째 숫자를 잘못 입력하셨습니다");
				count++;
			}
		}
		if(count == 0) {
			System.out.println("보안번호 입력 완료");
		}
		System.out.println("프로그램 완료");		
	}
}
