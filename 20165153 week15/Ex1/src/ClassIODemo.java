import java.io.*;

public class ClassIODemo {
public static void main(String[] args) throws IOException, ClassNotFoundException{
	ObjectOutputStream out = null;   //객체를 파일로 저장
	ObjectInputStream in=null;//파일에 저장된 객체 read
      try{
         out = new ObjectOutputStream(new FileOutputStream("object.dat"));
         PetRecord one = new PetRecord("해바라기", 7, 10.2);
         PetRecord two = new PetRecord("금강초롱", 4, 4.2);
         out.writeObject(one);  
         out.writeObject(two);  //파일에 객체 저장
         in = new ObjectInputStream(new FileInputStream("object.dat"));
         while(true){
         PetRecord obj=(PetRecord)in.readObject();  //파일에서 객체를 읽어옴
         if(obj == null )
        	 break;//파일에서 마지막 데이터를 읽으면 반복문 종료
         System.out.println(obj); }  //파일에서 읽어 온 객체 출력
  	   } 
      catch(Exception e){  }//EOFException 예외 처리를 위해 필요
      finally {
           if(out != null)   out.close(); 
           if(in != null)    in.close();  
      } 
      System.out.println("프로그램 종료"); 
	}
}
