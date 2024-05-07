
public class Main {

	public static void main(String[] args) {
		// Create a new LibrarySystem object
		LibrarySystem ls = new LibrarySystem();
		
		// Create a new book
		Book book1 = new LibraryBook("ISBN1234", "JSP 웹 프로그래밍", "송미영", 2018);
		Book book2 = new LibraryBook("ISBN1235", "안드로이드 프로그래밍", "우재남", 2022);
		Book book3 = new LibraryBook("ISBN1236", "스크래치 프로그래밍", "고광일", 2019);
		Book book4 = new LibraryBook("ISBN1237", "JAVA 마스터", "송미영", 2023);

		// Add the book to the library system
		ls.addBook(book1);
		ls.addBook(book2);
		ls.addBook(book3);
		ls.addBook(book4);
		
		// Display all available books
		ls.displayAllBooks();
		
		// Remove a book
		ls.removeBook("스크래치 프로그래밍");
		
		// Borrow some books
		ls.borrowBook("JAVA 마스터");
		ls.borrowBook("안드로이드 프로그래밍");
		
		// Display all available books
		ls.displayAllAvailableBooks();
		ls.displayAllCheckedOutBooks();
		
		// Return one book
		ls.returnBook("안드로이드 프로그래밍");
		ls.displayAllBooks();
		
		// Display rental transaction history
		// ls.displayRentalHistory(); // Too complicated for midterm. Need another List or array.
	}

}
