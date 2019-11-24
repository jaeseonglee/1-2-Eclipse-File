package mypackage;
import java.util.*;

public class Ex2 {
	public static void main(String[] args) {
		String str;
		Scanner input = new Scanner(System.in);
		System.out.println("문자열을 입력해주세요 : ");
		str = input.nextLine();
		String otherStr = str;
		
		StringTokenizer stok = new StringTokenizer(str);
		StringTokenizer stok1 = new StringTokenizer(otherStr);
		System.out.println("토큰 갯수 : " + stok.countTokens());
		String [] arr = new String[stok.countTokens()];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = stok.nextToken();
		}
		
		for(int i=0; i < arr.length-1; i++) {
			int max =i;
			for(int n=i+1; n < arr.length; n++) {
				if(arr[max].length() < arr[n].length()) {
					max=n;
				}
				String temp;
				temp = arr[max];
				arr[max] = arr[i];
				arr[i] = temp;
			}
		}
		
		while (stok1.hasMoreTokens()) {   
			String str1 = stok1.nextToken();  
			System.out.println(str1);           
		}  
        System.out.println("제일 긴 단어 출력 : "+ arr[0]);
	}	
}
