import java.util.*;
public class Lotto {
	public static void main(String[] args) {
		LinkedHashSet<Integer> s = new LinkedHashSet<Integer	>();
		
		for (int i=0; i< 6; i++) {
			int num = (int)(Math.random()*45)+1;
			if (!s.add(num)){  
				i--;
				System.out.println("중복된 단어==> " + num);
				continue;
			}
			s.add(num);
		}
		System.out.println(s);
	}
}
