package A;
import java.util.*;
public class LinkedListTest {
	public static void main(String[] args){
	   	LinkedList<String> list = new LinkedList<String>();
	  	list.add("MILK");
	  	list.add("BREAD");
	  	list.add("BUTTER");
	  	list.add("BANANA");
	  	list.add(1, "APPLE");  // �ε��� 1�� ��APPLE"�� ����
	  	list.set(2, "GRAPE");  // �ε��� 2�� ���Ҹ� ��GRAPE"�� ��ü
	  	list.remove(1);       // �ε��� 1�� ���Ҹ� �����Ѵ�.
	  	for (int i = 0; i < list.size(); i++)
	  		System.out.println(list.get(i));  //LinkedList �� ����� ���� ���
	  	
	  	System.out.println("\n >>>>> Iterator �� �̿��� ��� ");
	  	Iterator<String> e=list.iterator();
	  	while(e.hasNext())
	  	{
	  		String str = e.next();
	  		System.out.println(str);
	  	}
	}	
}
