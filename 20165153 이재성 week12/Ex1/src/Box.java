
public class Box<T> {   //T�� ������ Ÿ���� �ǹ�, < >�ȿ� ǥ��, generic
    private T data;  //T Ÿ���� �ڷ������� ���� data �ʵ�
    public Box(T data){  //T Ÿ���� ���ĸŰ������� ���
    	this.data = data;
    }
    public void set(T data) {this.data = data;}
    public T get() {return data;}
	
}
