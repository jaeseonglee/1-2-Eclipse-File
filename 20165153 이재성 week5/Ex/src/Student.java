
public class Student {
	//������� private �̸� Ŭ���� ���ο����� ����� �� �ִ�.
	private String name; //�̸� ����, ���� ���
	private int java, eng; //���� ����, ���� ���

	//��ü�� �ʱ�ȭ �ϴ� ������
	public Student(String name, int java, int eng){
		this.name= name; //�ʵ�� �Ű��������� ������ �ʵ�� �տ� this�� ���
		this.java=java;
		this.eng=eng;
	}

	//name�ʵ尪�� ��ȯ�ϴ� ������ �޼ҵ�
	public String getName(){ 
		return name;
	}

	//name�ʵ尪�� �����ϴ� ������ �޼ҵ�
	public void setName(String name){ 
		this.name= name;
	}

	public int hap(){ //���� ���� ����Ͽ� ��ȯ�ϴ� �޼ҵ�
		return java+eng;
	}

	public String toString(){ //��ü ����(�̸�, ������, ��)�� ���ڿ��� ��ȯ�ϴ� �޼ҵ�
	String str="�̸� : "+ name;
	str+= "\njava : "+ java+ "\teng : "+ eng;
	str+= "\n������ : "+ hap();
	return str;
	}
}
