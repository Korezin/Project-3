package Circle;
import java.util.Scanner;
public class CircleTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Circle okrugnost = new Circle();
		System.out.print("Окружность с радиусом ");
		okrugnost.setradius(scan.nextDouble());
		System.out.println("R = " + okrugnost.getradius());
		System.out.println("L = " + okrugnost.getcircuit());
	}
}
