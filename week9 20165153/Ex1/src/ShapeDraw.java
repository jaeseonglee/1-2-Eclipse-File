// week9 학번 : 20165153	이름: 이재성  과제 1번
public abstract class ShapeDraw {
	// 추상 메소드
	public abstract void draw(int x, char ch);
	// 그리는 행 크기와 출력할 문자를 x, ch로 받는다.
};

class Rectangle extends ShapeDraw {
	
	public void draw(int x, char ch) {
		for(int i=0; i< x; i++) {
			for(int n=0; n< x; n++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	} // 정사각형을 출력하는 메소드 오버라이딩
	
};


class Triangle extends ShapeDraw {
	
	public void draw(int x, char ch) {
		for(int i=0; i< x; i++) {
			for(int n=0; n< i+1; n++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	} // 직각 삼각형을 출력하는 메소드 오버라이딩
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
	} // 사다리꼴(평행 사변형)을 출력하는 메소드 오버라이딩
};