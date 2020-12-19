package Book;
import java.util.Scanner;

public class BookTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Book thisbook = new Book();
		System.out.print("Автор: ");
		thisbook.setauthor(scan.nextLine());
		System.out.print("Название книги: ");
		thisbook.setname(scan.nextLine());
		System.out.print("Год написания: ");
		thisbook.setyear(scan.nextInt());
		System.out.print("Размер в страницах: ");
		thisbook.setpages(scan.nextInt());
		System.out.println();
		System.out.print(thisbook.getauthor() + " ");
		System.out.println("'" + thisbook.getname() + "'");
		System.out.println("Год написания: " + thisbook.getyear());
		System.out.println("Объём " + thisbook.getpages() + " страниц");
	}
}
