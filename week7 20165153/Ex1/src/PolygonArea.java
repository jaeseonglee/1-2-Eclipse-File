import java.util.*;
public class PolygonArea { 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Polygon p;  // 객체 선언
		int menu;  
		double a,b,c;  // 가로 또는 밑변 , 세로 또는 높이 , 사다리꼴의 아랫변
		
		System.out.println("1:직사각형, 2: 삼각형, 3: 사다리꼴 -> 번호를 입력하세요 ");
		menu = input.nextInt();
		
		switch(menu) {
		   case 1 :
			   System.out.println("직사각형의 가로를 입력하세요:");
			   a=input.nextDouble();
			   System.out.println("직사각형의 세로를 입력하세요:");
			   b=input.nextDouble();
			   p = new Rectangle(a,b);
			   System.out.println("직사각형의 넓이는 "+p.areaPolygon());
			   break;
			   
		   case 2 :
			   System.out.println("삼각형의 밑변를 입력하세요:");
			   a=input.nextDouble();
			   System.out.println("삼각형의 높이를 입력하세요:");
			   b=input.nextDouble();
			   p = new Triangle(a,b);
			   System.out.println("삼각형의 넓이는 "+p.areaPolygon());
			   break;
			  
		   case 3 :
			   System.out.println("사다리꼴의 밑변를 입력하세요:");
			   c=input.nextDouble();
			   System.out.println("사다리꼴의 윗변를 입력하세요:");
			   a=input.nextDouble(); // 사다리꼴에선 윗변 
			   System.out.println("사다리꼴의 높이를 입력하세요:");
			   b=input.nextDouble();
			   p = new Ladder(a,b,c);
			   System.out.println("사다리꼴의 넓이는 "+p.areaPolygon());
			   break;   
		}
		
	}

}
