import java.util.*;
public class IntDim implements Dim{
	public int []arr;
	@Override
	public void print() {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	@Override
	public void init(int size) {
		arr = new int[size];
		for (int i=0; i<arr.length; i++) {
			arr[i] = (int)((Math.random()*100)+1);
		}
	}
}

class DoubleDim implements Dim{
	public double [] arr; 
	@Override
	public void print() {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	@Override
	public void init(int size) {
		arr = new double[size];
		for (int i=0; i<arr.length; i++) {
			arr[i] = (double) (Math.random()*10);
		}
	}
}

class CharDim implements Dim{
	public char [] arr;
	@Override
	public void print() {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	@Override
	public void init(int size) {
		arr = new char[size];
		for (int i=0; i<arr.length; i++) {
			arr[i] = (char) ((Math.random()*67)+32); 
		}
	}
}








