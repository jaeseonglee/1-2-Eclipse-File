import java.io.*;

public class FileByteStream {
	public static void main(String[] args) throws IOException {
		FileWriter output = null;
	    FileReader input = null;
	    ObjectInputStream in=null;//���Ͽ� ����� ��ü read
	    try {
	    	input = new FileReader("object.dat");
	    	int var;
	    	while ( (true) ) {
	    		Person obj=(Person)in.readObject();  //���Ͽ��� ��ü�� �о��
	        	 if(obj == null )
	        		 break;//���Ͽ��� ������ �����͸� ������ �ݺ��� ����
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
