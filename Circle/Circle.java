package Circle;

public class Circle {
	private double radius;
	private double circuit;
	public void setradius(double radius) {
		this.radius = radius;
		this.circuit = 2.0 * Math.PI * radius;
	}
	public double getcircuit() {
		return circuit;
	}
	public double getradius() {
		return radius;
	}
}