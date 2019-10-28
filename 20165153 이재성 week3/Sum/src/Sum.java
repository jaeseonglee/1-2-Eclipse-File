//°úÁ¦ 5¹ø 
public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr1 = { {12,3,8} , {5,7,6} , {2,4,5}}; 
		int [][] arr2 = { {5,3,8} , {11,6,1} , {2,9,3}};
		
		for (int i =0; i<arr1.length; i++) {
			for (int n=0; n<arr1[i].length; n++) {
				arr1[i][n] += arr2[i][n];
				System.out.print(arr1[i][n]+" ");
			}
			System.out.println();
		}
		
		

	}

}
