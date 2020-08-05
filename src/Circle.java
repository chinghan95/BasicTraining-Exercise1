
public class Circle<T extends Number> extends Object{
	
	private T radius;

	public Circle(Color color, T radius) {
		super(color);
		this.radius = radius;
	}
	
	public T getRadius() {
		return this.radius;
	}
	
	public void setRadius(T radius) {
		this.radius = radius;
	}
	/*
	 * Override the inherited getArea() to provide the proper implementation
	 * for circle
	 */
	@Override
	public double getArea() {
		return Math.pow(this.radius.doubleValue(),2) * Math.PI;
	}

	/*
	 * Return a self-descriptive string
	 */
	@Override
	public String toString() {
		String info = "Rectangle info: radius = " + this.radius + 
						", " + super.toString();
		return info;
	}
	
}
