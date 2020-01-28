package A;
import java.util.*;
public class SetTest1 {
	public static void main(String[] args) {
		Set<String> s1 = new HashSet<String>();
		Set<String> s2 = new HashSet<String>();
		s1.add("A"); s1.add("B");s1.add("C");
		s2.add("A"); s2.add("D");
		//s1을 가지고 새로운 집합 union 생성 - 원본 보관
		Set<String> union = new HashSet<String>(s1);
		          System.out.println("부분집합 : " +union.containsAll(s1));  //부분집합
		           union.addAll(s2);  //합집합
		Set<String> intersection = new HashSet<String>(s1);
		intersection.retainAll(s2);  //교집합
		System.out.println("합집합 " + union);
		System.out.println("교집합 " + intersection);

	}
}
