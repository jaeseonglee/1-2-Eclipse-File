import java.util.*;
public class InherTest {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Cal[] obj = new Cal[3];  //��ü�迭����&����
		for(int i=0; i<obj.length;i++){
			System.out.print( "\n1: Add, 2: Mod ->�޴��Է�( " + (i+1) + " ��°) : ");
			int menu=in.nextInt();
			switch(menu){
			case 1:
				System.out.println("\n=== Add ===" );
				System.out.print("���۷��� a, b���Է��ϼ��� => ");
				obj[i] = new Add(in.nextInt(), in.nextInt());  //��ü�迭�ʱ�ȭ
				break;
			case 2:
				System.out.println("\n=== Mod ===" );
				System.out.print("���۷��� a, b���Է��ϼ��� => ");
				obj[i] = new Mod(in.nextInt(), in.nextInt());  //��ü�迭�ʱ�ȭ
				break;
			}
		}
		disPlay(obj);	//��ü�迭���Ű�����������
	}
	
	public static void disPlay(Cal[] obj){
		for(Cal temp : obj)
			System.out.println(temp.toString());  //������
	}

	
}
