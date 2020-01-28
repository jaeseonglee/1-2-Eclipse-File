import java.io.*;
public class FileTextStream2 {
	public static void main(String[] args) throws IOException {
		FileWriter output = null;
	    FileReader input = null;
	    
	    try {
	    	input = new FileReader("output.txt");
	    	output = new FileWriter("copy.txt");
	    	
	    	int var;
	    	while ( ( var = input.read()) != -1)  {
	    		output.write(var);
	    	}
	    } finally {
	    	if (output != null) 
	        	  output.close();
	          if (input != null)   
	        	   input.close();
	    }
	}
}
