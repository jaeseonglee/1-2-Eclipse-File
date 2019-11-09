// ���� 1��
public abstract class Polygon {
	protected double data1;  // ���� �Ǵ� �غ�
	protected double data2;  // ���� �Ǵ� ����
	
	//�Ű������� �ʵ� �ʱ�ȭ �ϴ� ������ - ���� �ۼ�
	public Polygon(double data1, double data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
	
	abstract double areaPolygon(); // ���̸� ����ϴ� �߻� �޼ҵ� 
};

class Rectangle extends Polygon{
	//�Ű������� �ʵ� �ʱ�ȭ �ϴ� ������, ����Ŭ���� �ʵ� �ʱ�ȭ�� �Բ� - ���� �ۼ�
	public Rectangle(double data1, double data2) {
		super(data1,data2);
	}
	
	//�簢�� ���̸� ����Ͽ� ��ȯ�ϴ� areaPolygon() ������ - ���� �ۼ�
	public double areaPolygon() {
		return data1*data2 ;
	}
};

class Triangle extends Polygon {
	//�Ű������� �ʵ� �ʱ�ȭ �ϴ� ������, ����Ŭ���� �ʵ� �ʱ�ȭ�� �Բ� - ���� �ۼ�
	public Triangle (double data1, double data2) {
		super(data1,data2);
	}
	
	//�ﰢ�� ���̸� ����Ͽ� ��ȯ�ϴ� areaPolygon() ������ - ���� �ۼ� 
		public double areaPolygon() {
			return (data1* data2 ) /2.0;
		}
};

class Ladder extends Polygon {
	private double data3;  // �Ʒ��� 
	
	//�Ű������� �ʵ� �ʱ�ȭ �ϴ� ������, ����Ŭ���� �ʵ� �ʱ�ȭ�� �Բ� - ���� �ۼ�
	public Ladder (double data1, double data2, double data3) {
		super(data1,data2);
		this.data3 = data3;
	}
	
	//��ٸ��� ���̸� ����Ͽ� ��ȯ�ϴ� areaPolygon() ������ - ���� �ۼ� 
	public double areaPolygon() {
		return ( (data1 + data3) * data2 ) / 2.0;
	}
};



