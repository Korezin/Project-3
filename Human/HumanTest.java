package Human;
import java.util.Scanner;
public class HumanTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Human people = new Human();
		System.out.println("Ноги: ");
		System.out.print("Обхват: ");
		people.newleg.setgirth(scan.nextDouble());
		System.out.print("Длина: ");
		people.newleg.setlength(scan.nextDouble());
		System.out.println("Голова: ");
		System.out.print("Обхват: ");
		people.newhead.setgirth(scan.nextDouble());
		System.out.println("Руки: ");
		System.out.print("Обхват: ");
		people.newhand.setgirth(scan.nextDouble());
		System.out.print("Длина: ");
		people.newhand.setlength(scan.nextDouble());
		
		System.out.println("Длина ног: " + people.newleg.getgirth());
		System.out.println("Обхват ног: " + people.newleg.getlength());
		System.out.println("Обхват головы: " + people.newhead.getgirth());
		System.out.println("Длина рук: " + people.newhand.getlength());
		System.out.println("Обхват рук: " + people.newhand.getgirth());
	}
}
