package core;

import java.util.ArrayList;
import java.util.List;

public class BookTester {
	
	public static void main(String[] args) {
		
		Book one = new Book(123, "", "best your age", 150);
		Book two = new Book(235,"Peither john","java  AND Pyhton",250);
		Book three = new Book(123,"Bandura","psychology",500);
		
		
		List<Book>theBooks= new ArrayList<>();
		theBooks.add(one);
		theBooks.add(two);
		theBooks.add(three);
		
		
		System.out.println(one.getAuthor());
		System.out.println(two.getAuthor());
		System.out.println(two.getTitle());

		Shelf.addBook(150,"Eric From","Freedom", 320);
		System.out.println(Shelf.getTheBooks());
		
		Book five= new Book(150, "Piaget","trust",200);
		
		Shelf.addBook(five);
		
		Shelf.clearBookShelf();
		
		System.out.println(Shelf.getTheBooks());
		
		
	}
	
	
}
