import java.util.ArrayList;

public class GraphicScene {

	public static void main(String[] args) {
		Square s1 = new Square("Green", 3.14);
		Triangle t1 = new Triangle("Purple", 5.6, 3.3, 7.3);
		Circle c1 = new Circle("Ligth Blue", 11.4);

		ArrayList<Figure> figures = new ArrayList<Figure>();
		
		figures.add(c1);
		figures.add(t1);
		figures.add(s1);
		
		System.out.println(figures);
	}

}
