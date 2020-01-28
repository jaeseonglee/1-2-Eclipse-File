package A;
import java.util.*;
public class LinkedListTest {
	public static void main(String[] args){
	   	LinkedList<String> list = new LinkedList<String>();
	  	list.add("MILK");
	  	list.add("BREAD");
	  	list.add("BUTTER");
	  	list.add("BANANA");
	  	list.add(1, "APPLE");  // 인덱스 1에 “APPLE"을 삽입
	  	list.set(2, "GRAPE");  // 인덱스 2의 원소를 “GRAPE"로 대체
	  	list.remove(1);       // 인덱스 1의 원소를 삭제한다.
	  	for (int i = 0; i < list.size(); i++)
	  		System.out.println(list.get(i));  //LinkedList 에 저장된 원소 출력
	  	
	  	System.out.println("\n >>>>> Iterator 을 이용한 출력 ");
	  	Iterator<String> e=list.iterator();
	  	while(e.hasNext())
	  	{
	  		String str = e.next();
	  		System.out.println(str);
	  	}
	}	
}
