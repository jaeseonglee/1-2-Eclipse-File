import java.io.*; //Serializable �������̽��� �����ϱ� ���� �ʿ�
public class PetRecord implements Serializable{
   String name; //�̸�
   int age; //����
   double weight;//������
   public PetRecord(String name, int age, double weight){
       this.name = name;
       this.age = age;
       this.weight = weight;
       }
   
   public String toString(){
	   return "Name = " + name + "\n" + "Age = " + age + "\n" + "Weight = " + weight;
   	}
	
}
