
public class BoxTest {
	public static void main(String[] args){
	// ���̾� ��� ������ ȣ�� �� Ÿ�� �μ� ���� ���� SE7 �������� ����
    Box<String> sg=new Box<>("Generic"); // ���ڿ��� �����ϴ� Box Ŭ������ ��ü ����
	Box<Integer> ig=new Box<Integer>(340); //������ �����ϴ� Box Ŭ������ ��ü
	System.out.println("<String>" + sg.get());
	System.out.println("<Integer>" + ig.get()); }
}
