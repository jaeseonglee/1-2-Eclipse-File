import java.util.*;
public class RandomTest {
	public static void main(String[] args) {
		Random random = new Random();
        //int ���� ����, 1~100 ����
        for (int i = 0; i < 5; i++)
               System.out.print((random.nextInt(100) +1) + "\t");
       System.out.println();
        //double ���� ����, 0~1 ����
        for (int i = 0; i < 5; i++)
            System.out.printf("%.2f\t", random.nextDouble());  		
	}
}
