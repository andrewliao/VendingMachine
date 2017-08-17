package pack1;

public class TwoDShape {
	private double width;
	private double height;
	
	TwoDShape() {
		width = height = 0.0;
	}
	
	TwoDShape(double x) {
		width = height = x;
	}
	TwoDShape(double w, double h) {
		width = w;
		height = h;
	}
	
	void showDim() {
		System.out.println("Width and height are " + width + " and " + height);
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeigth(double height) {
		this.height = height;
	}
}
