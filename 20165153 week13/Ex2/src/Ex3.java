import java.util.*;
public class Ex3 {
	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<String, Integer> ();
		Scanner in = new Scanner(System.in);
		System.out.println("몇개의 단어를 입력하시겠습니까? ");
		int num = in.nextInt();
		String [] str = new String[num];
		
		for(int i=0; i<str.length; i++) { 
			System.out.println(i+1+"번째 단어 입력 : ");
			str[i] = in.next();
		}
		
		System.out.print("입력된 단어 : ");
		for (int i=0; i<str.length; i++) {
			System.out.print(str[i]+", ");
		}
		for(String a : str){
	        Integer freq=m.get(a);  //key에 해당하는 value 반환
	        m.put(a, (freq==null) ? 1 : freq + 1);
	        }
		System.out.println();
		System.out.println(m.size()+"개 단어 검출");
		
		m.forEach((key,value)->{ 
			System.out.print(key + " = " + value+" ");
		});
	}
}
