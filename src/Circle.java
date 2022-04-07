
public class Circle extends Figure {
	
	private double r;

	public Circle(String culoare, double r) {
		super(culoare);
		this.r = r;
	}

	public double perimetru() {
		return r * 3.1215;
	}

}
