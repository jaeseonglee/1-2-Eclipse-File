import java.util.*;
public class Array_EX_Test {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Dim array = null; //객체 참조변수초기화	
        System.out.println("1: 정수형배열, 2:실수형배열  3. 문자형 배열");
		int menu=in.nextInt();
		
		if(menu >= 4){
			messAge("잘못 선택하셨습니다.");
			messAge("다시 입력하세요.");
			menu=in.nextInt();
		}
		//해당 메뉴를 처리할 수 있는 객체를 생성하여 참조변수 array에 저장
		switch(menu){
			case 1: 
				array = new IntDim();//다형성 Dim타입의 변수로 Intdim객체 저장
				break;
			case 2: 
				array = new DoubleDim();//다형성 Dim타입의 변수로 Doubledim객체 저장
				break;
			case 3: 
				array = new CharDim();
				break;
		}
		messAge("생성할배열크기를입력하세요");
		int size = in.nextInt();
		array.init(size);//다형성, array가 가리키는 객체의 메소드 호출하여 실행
		array.print();//다형성, array가 가리키는 객체의 메소드 호출하여 실행
		messAge("프로그램을종료합니다");		
	 }
	
	public static void messAge(String ms){
		System.out.println(ms);
	}

}
