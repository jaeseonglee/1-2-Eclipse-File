// 과제 1번
public abstract class Polygon {
	protected double data1;  // 가로 또는 밑변
	protected double data2;  // 세로 또는 높이
	
	//매개변수로 필드 초기화 하는 생성자 - 본인 작성
	public Polygon(double data1, double data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
	
	abstract double areaPolygon(); // 넓이를 계산하는 추상 메소드 
};

class Rectangle extends Polygon{
	//매개변수로 필드 초기화 하는 생성자, 수퍼클래스 필드 초기화도 함께 - 본인 작성
	public Rectangle(double data1, double data2) {
		super(data1,data2);
	}
	
	//사각형 넓이를 계산하여 반환하는 areaPolygon() 재정의 - 본인 작성
	public double areaPolygon() {
		return data1*data2 ;
	}
};

class Triangle extends Polygon {
	//매개변수로 필드 초기화 하는 생성자, 수퍼클래스 필드 초기화도 함께 - 본인 작성
	public Triangle (double data1, double data2) {
		super(data1,data2);
	}
	
	//삼각형 넓이를 계산하여 반환하는 areaPolygon() 재정의 - 본인 작성 
		public double areaPolygon() {
			return (data1* data2 ) /2.0;
		}
};

class Ladder extends Polygon {
	private double data3;  // 아랫변 
	
	//매개변수로 필드 초기화 하는 생성자, 수퍼클래스 필드 초기화도 함께 - 본인 작성
	public Ladder (double data1, double data2, double data3) {
		super(data1,data2);
		this.data3 = data3;
	}
	
	//사다리꼴 넓이를 계산하여 반환하는 areaPolygon() 재정의 - 본인 작성 
	public double areaPolygon() {
		return ( (data1 + data3) * data2 ) / 2.0;
	}
};



