import java.util.*;
public class Array_EX_Test {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Dim array = null; //��ü ���������ʱ�ȭ	
        System.out.println("1: �������迭, 2:�Ǽ����迭  3. ������ �迭");
		int menu=in.nextInt();
		
		if(menu >= 4){
			messAge("�߸� �����ϼ̽��ϴ�.");
			messAge("�ٽ� �Է��ϼ���.");
			menu=in.nextInt();
		}
		//�ش� �޴��� ó���� �� �ִ� ��ü�� �����Ͽ� �������� array�� ����
		switch(menu){
			case 1: 
				array = new IntDim();//������ DimŸ���� ������ Intdim��ü ����
				break;
			case 2: 
				array = new DoubleDim();//������ DimŸ���� ������ Doubledim��ü ����
				break;
			case 3: 
				array = new CharDim();
				break;
		}
		messAge("�����ҹ迭ũ�⸦�Է��ϼ���");
		int size = in.nextInt();
		array.init(size);//������, array�� ����Ű�� ��ü�� �޼ҵ� ȣ���Ͽ� ����
		array.print();//������, array�� ����Ű�� ��ü�� �޼ҵ� ȣ���Ͽ� ����
		messAge("���α׷��������մϴ�");		
	 }
	
	public static void messAge(String ms){
		System.out.println(ms);
	}

}
