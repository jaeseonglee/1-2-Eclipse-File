// 학번 : 20165153 이름 : 이재성 과제 1번
public class Ex2 {

	public static void main(String[] args) {// 프로그램 시작
		// TODO Auto-generated method stub
		int[][] arr = {
				{78,48,78,98} ,
				{99,92} ,
				{29,64,83} ,
				{34,78,92,56}//레기드 배열 생성 및 초기화
		};
		int sum; // 합 변수 생성
		double average; // 평균 변수 생성
		
		for(int[] temp : arr) {
			for(int d : temp) {
				System.out.printf("%d " , d);
			}
			System.out.println();
		} // 레기드 배열 출력
		for(int i=0; i<arr.length; i++) {
			sum=0;
			for (int n=0; n<arr[i].length; n++) {
				sum += arr[i][n];
			}
			average = (double) sum/arr[i].length;
			System.out.printf("%d 행의 합은 %d이고 평균은 %4.2f 입니다.",i,sum,average);
			System.out.println();
		}//각 행의 합과 평균 출력 
	}// 프로그램 종료 

}
