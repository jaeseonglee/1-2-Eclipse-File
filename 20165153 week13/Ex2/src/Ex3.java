import java.util.*;
public class Ex3 {
	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<String, Integer> ();
		Scanner in = new Scanner(System.in);
		System.out.println("��� �ܾ �Է��Ͻðڽ��ϱ�? ");
		int num = in.nextInt();
		String [] str = new String[num];
		
		for(int i=0; i<str.length; i++) { 
			System.out.println(i+1+"��° �ܾ� �Է� : ");
			str[i] = in.next();
		}
		
		System.out.print("�Էµ� �ܾ� : ");
		for (int i=0; i<str.length; i++) {
			System.out.print(str[i]+", ");
		}
		for(String a : str){
	        Integer freq=m.get(a);  //key�� �ش��ϴ� value ��ȯ
	        m.put(a, (freq==null) ? 1 : freq + 1);
	        }
		System.out.println();
		System.out.println(m.size()+"�� �ܾ� ����");
		
		m.forEach((key,value)->{ 
			System.out.print(key + " = " + value+" ");
		});
	}
}
