// week9 �й� : 20165153	�̸�: ���缺  ���� 1��
public abstract class ShapeDraw {
	// �߻� �޼ҵ�
	public abstract void draw(int x, char ch);
	// �׸��� �� ũ��� ����� ���ڸ� x, ch�� �޴´�.
};

class Rectangle extends ShapeDraw {
	
	public void draw(int x, char ch) {
		for(int i=0; i< x; i++) {
			for(int n=0; n< x; n++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	} // ���簢���� ����ϴ� �޼ҵ� �������̵�
	
};


class Triangle extends ShapeDraw {
	
	public void draw(int x, char ch) {
		for(int i=0; i< x; i++) {
			for(int n=0; n< i+1; n++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	} // ���� �ﰢ���� ����ϴ� �޼ҵ� �������̵�
};

class Ladder extends ShapeDraw {
	
	public void draw(int x, char ch) {
		for(int i=0; i<x; i++) {
			for (int n=0; n<x; n++){
				System.out.print(ch);
			}
			System.out.println();
			for (int j=0; j<i+1; j++){
				System.out.print(" ");
			}
		}
	} // ��ٸ���(���� �纯��)�� ����ϴ� �޼ҵ� �������̵�
};