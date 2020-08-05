
public class Rectangle<T extends Number> extends Object{
	
	private T length, width;
	
	public Rectangle(Color color, T length, T width) {
		super(color);
		this.length = length;
		this.width = width;
	}
	
	public void setLength(T length) {
		this.length = length;
	}
	
	public void setWidth(T width) {
		this.width = width;
	}
	
	public T getLength() {
		return this.length;
	}
	
	public T getWidth() {
		return this.width;
	}
	
	/*
	 * Override the inherited getArea() to provide the proper implementation
	 * for rectangle
	 */
	@Override
	public double getArea() {
		return this.length.doubleValue() * this.width.doubleValue();
	}

	/*
	 * Return a self-descriptive string
	 */
	@Override
	public String toString() {
		String info = "Rectangle info: length = " + this.length + 
									", width = " + this.width + 
									", " + super.toString();
		return info;
	}
	
}
