
public class Driver {

	public static void main(String[] args) {
		
		// Upcast
		Object o1 = new Rectangle(Color.GREEN, 10.0, 20);
		// Return Rectangle's toString()
		System.out.println(o1);
		// Return Rectangle's area, run Rectangle's getArea()
		System.out.println("Rectangle area is " + o1.getArea());
		
		// Upcast
		Object o2 = new Circle(Color.RED, 10.0);
		// Return Circle's toString()
		System.out.println(o2);
		// Return Circle's area, run Circle's getArea()
		System.out.println("Circle area is " + o2.getArea());
		
	}

}
