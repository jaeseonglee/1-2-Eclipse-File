import java.util.*;
public class InherTest {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Cal[] obj = new Cal[3];  //객체배열선언&생성
		for(int i=0; i<obj.length;i++){
			System.out.print( "\n1: Add, 2: Mod ->메뉴입력( " + (i+1) + " 번째) : ");
			int menu=in.nextInt();
			switch(menu){
			case 1:
				System.out.println("\n=== Add ===" );
				System.out.print("오퍼랜드 a, b를입력하세요 => ");
				obj[i] = new Add(in.nextInt(), in.nextInt());  //객체배열초기화
				break;
			case 2:
				System.out.println("\n=== Mod ===" );
				System.out.print("오퍼랜드 a, b를입력하세요 => ");
				obj[i] = new Mod(in.nextInt(), in.nextInt());  //객체배열초기화
				break;
			}
		}
		disPlay(obj);	//객체배열을매개변수로전달
	}
	
	public static void disPlay(Cal[] obj){
		for(Cal temp : obj)
			System.out.println(temp.toString());  //다형성
	}

	
}
