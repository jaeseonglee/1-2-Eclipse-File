import java.util.Arrays;

class MyArray <T> {
	private T [] data;
	
	public MyArray( T [] data ){ // ���ĸŰ������� TŸ���� �迭�� �޾� �ʵ� �迭�� ������ �� ũ������� ����
		this.data =data;
		Arrays.sort(this.data);
	}
	public T firstEle() {		return data[0];	}
	public T lastEle() {		return data[data.length-1]; }	
	public void display() {
		System.out.println("===== �迭 ���� ��� =======");
		for( T s : data ) {
			System.out.print(s+" ");
		}
		System.out.println();
	}
	
}

public class MyArrayTest {
	public static void main(String[] args) {
		MyArray <Integer> m1 = new MyArray( new Integer[] { 5,3,9,5,2,78,45,91 } );
		MyArray <Double> m2 = new MyArray( new Double[] {2.3, 1.2, 67.3, 45.2, 4.2, 66.4} );
		
		m1.display();
		m2.display();
		System.out.println("���� ������ ���� = "+ m1.lastEle() );
		System.out.println("���� ù��° ���� = "+ m1.firstEle() );
		System.out.println("�Ǽ� ������ ���� = "+ m2.lastEle() );
		System.out.println("�Ǽ� ù��° ���� = "+ m2.firstEle() );
		
	}
}
