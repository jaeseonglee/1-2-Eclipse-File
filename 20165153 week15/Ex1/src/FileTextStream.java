import java.util.*;
import java.io.*;	

public class FileTextStream {
	public static void main(String[] args) throws IOException  {
		Scanner key=new Scanner(System.in);
	    FileWriter output = null;
	    FileReader input = null;
	    
	    int var;
        try{
           output = new FileWriter("output.txt");
           while(true){
            	System.out.print("숫자 입력(종료:-1)");
            		var=key.nextInt();
            	if(var<0)  //음수가 입력되면 입력 중단
            			break;
            	output.write(var); //한 문자씩 쓰기
           }
           output.close(); //"output.txt"을 읽어 오는 작업을 위해 닫아줌
           
           input = new FileReader("output.txt"); //읽기 작업을 위해 다시 open
           System.out.println("======파일에 저장된 데이터 출력");
           while ((var = input.read() ) != -1)   //한 문자씩 읽기, read()는 읽어 온 데이터를 int로 반환
        	   System.out.println(var);
        }
        finally {
          if (output != null) 
        	  output.close();
          if (input != null)   
        	   input.close(); 
        }
    }
}
