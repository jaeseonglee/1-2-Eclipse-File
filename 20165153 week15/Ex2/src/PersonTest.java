import java.io.*;
import java.util.*;

public class PersonTest {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectOutputStream out = null;   //객체를 파일로 저장
		ObjectInputStream in=null;//파일에 저장된 객체 read
		try {
			out = new ObjectOutputStream(new FileOutputStream("object.dat"));
			ArrayList <Person> list = new ArrayList<>();
			list.add(new Person("김씨", "010-1111-1111"));
			list.add(new Person("이씨", "010-2222-2222"));
			out.writeObject(list.get(0));  
	        out.writeObject(list.get(1));  //파일에 객체 저장
	        in = new ObjectInputStream(new FileInputStream("object.dat"));
	         while(true){
	        	 Person obj=(Person)in.readObject();  //파일에서 객체를 읽어옴
	        	 if(obj == null )
	        		 break;//파일에서 마지막 데이터를 읽으면 반복문 종료
	        	 System.out.println(obj); 
	        	 }  //파일에서 읽어 온 객체 출력
		}
		catch(Exception e){  }//EOFException 예외 처리를 위해 필요
	      finally {
	           if(out != null)   out.close(); 
	           if(in != null)    in.close();  
	      } 
	      System.out.println("프로그램 종료");
	}
}
