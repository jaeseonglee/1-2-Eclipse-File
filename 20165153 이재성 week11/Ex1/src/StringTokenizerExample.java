import java.util.*;
public class StringTokenizerExample {
	public static void main(String[] args) {
		StringTokenizer stok = new StringTokenizer("082-2-777-5566","-");
        System.out.println("��ū ���� : " + stok.countTokens());
        while (stok.hasMoreTokens()) {   //��ū�� �ִ� ���ȸ�  
            String str = stok.nextToken();  //��ū�� �����Ͽ�
            System.out.println(str);           //����� ��ū ���
        }  	
	}
}
