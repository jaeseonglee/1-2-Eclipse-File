import java.io.*;
import java.util.*;

public class FileByteStream {
	public static void main(String[] args) throws IOException  {
		Scanner in = new Scanner(System.in);
		BufferedOutputStream writer = null;  //바이트출력버퍼스트림
        BufferedInputStream reader = null;  //바이트입력버퍼스트림
        int c;
        try {
        	writer = new BufferedOutputStream(new FileOutputStream("char.txt"));
        	System.out.println("한글 및 영문자를 입력해주세요 : ");
            String str = in.nextLine();
            for (int cnt = 0; cnt<str.length(); cnt++)
            	writer.write(str.charAt(cnt)); 
         	}
        finally {
        	if(writer != null)      
        		writer.close();
        	}     
        
        try{
        	reader =new BufferedInputStream (new FileInputStream("char.txt"));
        	
        	System.out.println("======파일에저장된데이터출력");
        	while ((c =reader.read() ) != -1)   //read()는읽어온데이터를정수로반환
        		System.out.println((char)c);     //문자출력을위해서는형변환필요
        }  
        finally {
        	if (reader != null) {     reader.close();     }
           	}
    }
}
