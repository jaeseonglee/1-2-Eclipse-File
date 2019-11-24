package A;
import java.util.*;

public class ArrayListTest {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>(); //ArrayList 객체 생성
		list.add("MILK");    //ArrayList에 원소 추가
		list.add("BREAD");
		list.add("BUTTER");
		list.add(1, "APPLE");   // 인덱스 1에 “APPLE"을 삽입
		list.set(2, "GRAPE");   // 인덱스 2의 원소를 “GRAPE"로 대체
		list.remove(3);       // 인덱스 3의 원소 제거
	
		for (int i = 0; i < list.size(); i++) // size()는 원소 개수 반환
			System.out.println(list.get(i)); // get()는 i번째 위치의 원소 반환
         	//for(String s:list)  // list에 저장된 원소 출력 시 foreach 사용
         	// System.out.println(s)
	}

}
