import java.io.*;
import java.util.*;

public class PersonTest {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectOutputStream out = null;   //��ü�� ���Ϸ� ����
		ObjectInputStream in=null;//���Ͽ� ����� ��ü read
		try {
			out = new ObjectOutputStream(new FileOutputStream("object.dat"));
			ArrayList <Person> list = new ArrayList<>();
			list.add(new Person("�达", "010-1111-1111"));
			list.add(new Person("�̾�", "010-2222-2222"));
			out.writeObject(list.get(0));  
	        out.writeObject(list.get(1));  //���Ͽ� ��ü ����
	        in = new ObjectInputStream(new FileInputStream("object.dat"));
	         while(true){
	        	 Person obj=(Person)in.readObject();  //���Ͽ��� ��ü�� �о��
	        	 if(obj == null )
	        		 break;//���Ͽ��� ������ �����͸� ������ �ݺ��� ����
	        	 System.out.println(obj); 
	        	 }  //���Ͽ��� �о� �� ��ü ���
		}
		catch(Exception e){  }//EOFException ���� ó���� ���� �ʿ�
	      finally {
	           if(out != null)   out.close(); 
	           if(in != null)    in.close();  
	      } 
	      System.out.println("���α׷� ����");
	}
}
