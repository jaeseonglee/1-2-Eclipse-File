import java.util.*;
public class PolygonArea { 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Polygon p;  // ��ü ����
		int menu;  
		double a,b,c;  // ���� �Ǵ� �غ� , ���� �Ǵ� ���� , ��ٸ����� �Ʒ���
		
		System.out.println("1:���簢��, 2: �ﰢ��, 3: ��ٸ��� -> ��ȣ�� �Է��ϼ��� ");
		menu = input.nextInt();
		
		switch(menu) {
		   case 1 :
			   System.out.println("���簢���� ���θ� �Է��ϼ���:");
			   a=input.nextDouble();
			   System.out.println("���簢���� ���θ� �Է��ϼ���:");
			   b=input.nextDouble();
			   p = new Rectangle(a,b);
			   System.out.println("���簢���� ���̴� "+p.areaPolygon());
			   break;
			   
		   case 2 :
			   System.out.println("�ﰢ���� �غ��� �Է��ϼ���:");
			   a=input.nextDouble();
			   System.out.println("�ﰢ���� ���̸� �Է��ϼ���:");
			   b=input.nextDouble();
			   p = new Triangle(a,b);
			   System.out.println("�ﰢ���� ���̴� "+p.areaPolygon());
			   break;
			  
		   case 3 :
			   System.out.println("��ٸ����� �غ��� �Է��ϼ���:");
			   c=input.nextDouble();
			   System.out.println("��ٸ����� ������ �Է��ϼ���:");
			   a=input.nextDouble(); // ��ٸ��ÿ��� ���� 
			   System.out.println("��ٸ����� ���̸� �Է��ϼ���:");
			   b=input.nextDouble();
			   p = new Ladder(a,b,c);
			   System.out.println("��ٸ����� ���̴� "+p.areaPolygon());
			   break;   
		}
		
	}

}
