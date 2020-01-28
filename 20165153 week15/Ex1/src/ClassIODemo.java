import java.io.*;

public class ClassIODemo {
public static void main(String[] args) throws IOException, ClassNotFoundException{
	ObjectOutputStream out = null;   //��ü�� ���Ϸ� ����
	ObjectInputStream in=null;//���Ͽ� ����� ��ü read
      try{
         out = new ObjectOutputStream(new FileOutputStream("object.dat"));
         PetRecord one = new PetRecord("�عٶ��", 7, 10.2);
         PetRecord two = new PetRecord("�ݰ��ʷ�", 4, 4.2);
         out.writeObject(one);  
         out.writeObject(two);  //���Ͽ� ��ü ����
         in = new ObjectInputStream(new FileInputStream("object.dat"));
         while(true){
         PetRecord obj=(PetRecord)in.readObject();  //���Ͽ��� ��ü�� �о��
         if(obj == null )
        	 break;//���Ͽ��� ������ �����͸� ������ �ݺ��� ����
         System.out.println(obj); }  //���Ͽ��� �о� �� ��ü ���
  	   } 
      catch(Exception e){  }//EOFException ���� ó���� ���� �ʿ�
      finally {
           if(out != null)   out.close(); 
           if(in != null)    in.close();  
      } 
      System.out.println("���α׷� ����"); 
	}
}
