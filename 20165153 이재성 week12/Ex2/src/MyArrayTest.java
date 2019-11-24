import java.util.Arrays;

class MyArray <T> {
	private T [] data;
	
	public MyArray( T [] data ){ // 형식매개변수로 T타입의 배열을 받아 필드 배열에 저장한 후 크기순으로 정렬
		this.data =data;
		Arrays.sort(this.data);
	}
	public T firstEle() {		return data[0];	}
	public T lastEle() {		return data[data.length-1]; }	
	public void display() {
		System.out.println("===== 배열 원소 출력 =======");
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
		System.out.println("정수 마지막 원소 = "+ m1.lastEle() );
		System.out.println("정수 첫번째 원소 = "+ m1.firstEle() );
		System.out.println("실수 마지막 원소 = "+ m2.lastEle() );
		System.out.println("실수 첫번째 원소 = "+ m2.firstEle() );
		
	}
}
