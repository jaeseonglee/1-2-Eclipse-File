import java.io.*;
public class Person implements Serializable {
	private String name; //�̸�
	private String tel; //��ȭ��ȣ
		
	public Person(String name, String tel){
		this.name=name;
		this.tel=tel;
	}
	@Override
	public String toString() {
		return"Person [�̸� = " + name + ",  ��ȭ��ȣ = " + tel + "]";
	}
}
