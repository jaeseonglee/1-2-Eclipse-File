import java.io.*; //Serializable 인터페이스를 구현하기 위해 필요
public class PetRecord implements Serializable{
   String name; //이름
   int age; //나이
   double weight;//몸무게
   public PetRecord(String name, int age, double weight){
       this.name = name;
       this.age = age;
       this.weight = weight;
       }
   
   public String toString(){
	   return "Name = " + name + "\n" + "Age = " + age + "\n" + "Weight = " + weight;
   	}
	
}
