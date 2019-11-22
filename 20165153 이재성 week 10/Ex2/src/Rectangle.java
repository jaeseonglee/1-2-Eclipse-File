interface GraphicsObject{
	int getArea();
	void draw();
}


public class Rectangle implements GraphicsObject{
	private int lenght;
	private int width;
	
	public int getArea() {
		return lenght * width; 
	}
	public void draw() {
		for (int i=0; i<lenght; i++) {
			for(int n=0; n<width; n++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	void setDimensions (int l, int w) {
		this.lenght = l;
		this.width = w;
	}
}
