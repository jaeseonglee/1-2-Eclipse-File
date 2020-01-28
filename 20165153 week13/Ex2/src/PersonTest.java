import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.*;

class Person{
	private String name; //�̸�
	private String num; //��ȭ��ȣ
	
	public Person(String name, String num){
		this.name=name;
		this.num=num;	
	}
	public String toString(){
		return" [�̸� : " + name + ",  ��ȭ��ȣ : " + num +"]" ;
	}
}

public class PersonTest {
	public static void main(String[] args) {
		Map<String, Person> m = new HashMap<String, Person> ();
		Scanner in = new Scanner(System.in);
		String [] str = {"20161111","20162222","20163333"};
		m.put(str[0], new Person("�达 ","100"));
		m.put(str[1], new Person("�̾� ","111"));
		m.put(str[2], new Person("�ھ�" ,"333"));

//		 - id�� �Է��ϸ� �ش� Person ������ ���.��,Map.Entry �������̽����̿��ѿ������
		System.out.println("id�� �Է��ϼ��� : ");
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
