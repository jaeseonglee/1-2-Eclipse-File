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
            	System.out.print("���� �Է�(����:-1)");
            		var=key.nextInt();
            	if(var<0)  //������ �ԷµǸ� �Է� �ߴ�
            			break;
            	output.write(var); //�� ���ھ� ����
           }
           output.close(); //"output.txt"�� �о� ���� �۾��� ���� �ݾ���
           
           input = new FileReader("output.txt"); //�б� �۾��� ���� �ٽ� open
           System.out.println("======���Ͽ� ����� ������ ���");
           while ((var = input.read() ) != -1)   //�� ���ھ� �б�, read()�� �о� �� �����͸� int�� ��ȯ
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
