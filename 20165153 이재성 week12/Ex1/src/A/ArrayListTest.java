package A;
import java.util.*;

public class ArrayListTest {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>(); //ArrayList ��ü ����
		list.add("MILK");    //ArrayList�� ���� �߰�
		list.add("BREAD");
		list.add("BUTTER");
		list.add(1, "APPLE");   // �ε��� 1�� ��APPLE"�� ����
		list.set(2, "GRAPE");   // �ε��� 2�� ���Ҹ� ��GRAPE"�� ��ü
		list.remove(3);       // �ε��� 3�� ���� ����
	
		for (int i = 0; i < list.size(); i++) // size()�� ���� ���� ��ȯ
			System.out.println(list.get(i)); // get()�� i��° ��ġ�� ���� ��ȯ
         	//for(String s:list)  // list�� ����� ���� ��� �� foreach ���
         	// System.out.println(s)
	}

}
