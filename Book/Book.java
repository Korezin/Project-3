package Book;

public class Book {
	private String author;
	private String name;
	private int year;
	private int pages;
	
	public void setauthor(String author) {
		this.author = author;
	}
	public void setname(String name) {
		this.name = name;
	}
	public void setyear(int year) {
		this.year = year;
	}
	public void setpages(int pages) {
		this.pages = pages;
	}
	
	public String getauthor() {
		return author;
	}
	public String getname() {
		return name;
	}
	public int getyear() {
		return year;
	}
	public int getpages() {
		return pages;
	}
}
