import java.io.*;
import java.util.*;

public class FileByteStream {
	public static void main(String[] args) throws IOException  {
		Scanner in = new Scanner(System.in);
		BufferedOutputStream writer = null;  //����Ʈ��¹��۽�Ʈ��
        BufferedInputStream reader = null;  //����Ʈ�Է¹��۽�Ʈ��
        int c;
        try {
        	writer = new BufferedOutputStream(new FileOutputStream("char.txt"));
        	System.out.println("�ѱ� �� �����ڸ� �Է����ּ��� : ");
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
        	
        	System.out.println("======���Ͽ�����ȵ��������");
        	while ((c =reader.read() ) != -1)   //read()���о�µ����͸������ι�ȯ
        		System.out.println((char)c);     //������������ؼ�������ȯ�ʿ�
        }  
        finally {
        	if (reader != null) {     reader.close();     }
           	}
    }
}
