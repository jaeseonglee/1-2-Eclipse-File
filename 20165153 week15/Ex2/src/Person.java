import java.io.*;
public class Person implements Serializable {
	private String name; //이름
	private String tel; //전화번호
		
	public Person(String name, String tel){
		this.name=name;
		this.tel=tel;
	}
	@Override
	public String toString() {
		return"Person [이름 = " + name + ",  전화번호 = " + tel + "]";
	}
}
