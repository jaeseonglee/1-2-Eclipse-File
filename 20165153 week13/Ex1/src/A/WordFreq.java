package A;
import java.util.*;
public class WordFreq {
	public static void main(String[] args) {
		Map<String, Integer> m=new HashMap<String, Integer>();
	     String[] sample = {"to", "be", "or", "not", "to", "be", "is", "a", "pro"};
	     //���ڿ��� ���Ե� �󵵼� ���
	     for(String a : sample){
	        Integer freq=m.get(a);  //key�� �ش��ϴ� value ��ȯ
	        m.put(a, (freq==null)?1:freq+1);
	        }
	      System.out.println(m.size() + " �ܾ �ֽ��ϴ�");
	      System.out.println(m.containsKey("to"));  //�ش� Ű �����ϸ� true
	      System.out.println(m.isEmpty());  //�ؽ� ���� ��� ������ true
	      
	      System.out.println(" >>>>>>  1: ���ٽ��� �̿��� ���� ��� ");
	      m.forEach((key,value)->{ 
	   	    System.out.println("key = " + key + ", value = " + value);
	       });
	      
	      System.out.println(" >>>>>>  2: Map.Entry �������̽��� �̿��� ���� ��� ");
	      for (Map.Entry<String, Integer> s : m.entrySet()) { // ��� �׸��� �湮�Ѵ�
	    	  String key = s.getKey();
	    	  Integer value = s.getValue();
	    	  System.out.println("key= " + key + ", value= " + value);
	  	}

	      System.out.println(" >>>>>>  3: toString()�� �̿��� ���� ��� ");
	      System.out.println(m);

	}

}
