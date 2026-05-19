package Constructors;

class Book
{
	 String title;
	String author;
	 double price;

	public Book()
	{
		this.title = "Unknown";
		this.author = "Unknown";
		this.price = 0.0;
	}

	public Book(String title, String author)
	{
		this.title = title;
		this.author = author;
		this.price = 0.0;
	}

	public Book(String title, String author, double price)
	{
		this.title = title;
		this.author = author;
		this.price = price;
	}

}

public class ConstructorOverloading {

	public static void main(String[] args) {

		Book book1 = new Book();
        System.out.println("Book1 Title: " + book1.title);
        System.out.println("Book1 Author: " + book1.author);
        System.out.println("Book1 Price: " + book1.price);

        Book book2 = new Book("Amatka", "Karin Tidbeck");
        System.out.println("Book2 Title: " + book2.title);
        System.out.println("Book2 Author: " + book2.author);
        System.out.println("Book2 Price: " + book2.price);

        Book book3 = new Book("Altered Carbon", "Richard K. Morgan", 18.99);
        System.out.println("Book3 Title: " + book3.title);
        System.out.println("Book3 Author: " + book3.author);
        System.out.println("Book3 Price: " + book3.price);

	}

}
