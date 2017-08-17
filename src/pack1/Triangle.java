package pack1;

public class Triangle extends TwoDShape {
	private String style;
	
	Triangle() {
		super();
		
		style = "none";
	}
	
	Triangle(double x) {
		super(x);
		
		style = "filled";
	}
	Triangle(String s, double w, double h) {
		super(w, h);
		
		style = s;
	}
	double area() {
		return getWidth() * getHeight() / 2;
	}
	
	void showStyle() {
		System.out.println("Triangle is " + style);
	}
}
