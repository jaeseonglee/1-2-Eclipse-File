import java.io.*;

public class FileByteStream {
	public static void main(String[] args) throws IOException {
		FileWriter output = null;
	    FileReader input = null;
	    ObjectInputStream in=null;//파일에 저장된 객체 read
	    try {
	    	input = new FileReader("object.dat");
	    	int var;
	    	while ( (true) ) {
	    		Person obj=(Person)in.readObject();  //파일에서 객체를 읽어옴
	        	 if(obj == null )
	        		 break;//파일에서 마지막 데이터를 읽으면 반복문 종료
	        	 System.out.println(obj);
	    	}
	    } finally {
	    	if (output != null) 
	        	  output.close();
	          if (input != null)   
	        	   input.close();
	    }
//	    ArrayList<Person> list=new ArrayList<Person>();
//	    list = (ArrayList<Person>)input.readObject();

	}
}
