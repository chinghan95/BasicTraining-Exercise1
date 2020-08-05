
abstract public class Object {
	
	private Color color;
	
	public Object (Color color) {
		this.color = color;
	}
	
	public Color getColor() {
		return this.color;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}

	@Override
	public String toString() {
		String info = "color = " + this.color;
		return info;
	}
	
	abstract public double getArea();
	
}
