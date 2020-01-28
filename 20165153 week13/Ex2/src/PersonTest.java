import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.*;

class Person{
	private String name; //이름
	private String num; //전화번호
	
	public Person(String name, String num){
		this.name=name;
		this.num=num;	
	}
	public String toString(){
		return" [이름 : " + name + ",  전화번호 : " + num +"]" ;
	}
}

public class PersonTest {
	public static void main(String[] args) {
		Map<String, Person> m = new HashMap<String, Person> ();
		Scanner in = new Scanner(System.in);
		String [] str = {"20161111","20162222","20163333"};
		m.put(str[0], new Person("김씨 ","100"));
		m.put(str[1], new Person("이씨 ","111"));
		m.put(str[2], new Person("박씨" ,"333"));

//		 - id를 입력하면 해당 Person 데이터 출력.단,Map.Entry 인터페이스를이용한원소출력
		System.out.println("id를 입력하세요 : ");
		String word = in.next();	
		for(int i=0; i<m.size(); i++) {
			if(str[i].equals(word) ) {
				System.out.println(m.get(str[i]).toString());
			}
		}
		
		for (Entry<String, Person> s : m.entrySet()) { 
	    	  String key = s.getKey();
	    	  Person value = s.getValue();
	    	  System.out.println("key= " + key + ", value= " + value);
		}  
	}
}
