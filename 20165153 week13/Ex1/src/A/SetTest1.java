package A;
import java.util.*;
public class SetTest1 {
	public static void main(String[] args) {
		Set<String> s1 = new HashSet<String>();
		Set<String> s2 = new HashSet<String>();
		s1.add("A"); s1.add("B");s1.add("C");
		s2.add("A"); s2.add("D");
		//s1�� ������ ���ο� ���� union ���� - ���� ����
		Set<String> union = new HashSet<String>(s1);
		          System.out.println("�κ����� : " +union.containsAll(s1));  //�κ�����
		           union.addAll(s2);  //������
		Set<String> intersection = new HashSet<String>(s1);
		intersection.retainAll(s2);  //������
		System.out.println("������ " + union);
		System.out.println("������ " + intersection);

	}
}
