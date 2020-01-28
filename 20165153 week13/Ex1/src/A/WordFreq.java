package A;
import java.util.*;
public class WordFreq {
	public static void main(String[] args) {
		Map<String, Integer> m=new HashMap<String, Integer>();
	     String[] sample = {"to", "be", "or", "not", "to", "be", "is", "a", "pro"};
	     //문자열에 포함된 빈도수 계산
	     for(String a : sample){
	        Integer freq=m.get(a);  //key에 해당하는 value 반환
	        m.put(a, (freq==null)?1:freq+1);
	        }
	      System.out.println(m.size() + " 단어가 있습니다");
	      System.out.println(m.containsKey("to"));  //해당 키 존재하면 true
	      System.out.println(m.isEmpty());  //해쉬 맵이 비어 있으면 true
	      
	      System.out.println(" >>>>>>  1: 람다식을 이용한 원소 출력 ");
	      m.forEach((key,value)->{ 
	   	    System.out.println("key = " + key + ", value = " + value);
	       });
	      
	      System.out.println(" >>>>>>  2: Map.Entry 인터페이스를 이용한 원소 출력 ");
	      for (Map.Entry<String, Integer> s : m.entrySet()) { // 모든 항목을 방문한다
	    	  String key = s.getKey();
	    	  Integer value = s.getValue();
	    	  System.out.println("key= " + key + ", value= " + value);
	  	}

	      System.out.println(" >>>>>>  3: toString()을 이용한 원소 출력 ");
	      System.out.println(m);

	}

}
