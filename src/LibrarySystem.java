public class LibrarySystem {
	private Book[] booklist;
	private static int bookCount = 0;
	private static final int NUM_BOOK = 10;
	
	public LibrarySystem() {
		this.booklist = new Book[NUM_BOOK];
	}
	
	public void addBook(Book book) {
		if ( bookCount < NUM_BOOK ) {
			booklist[bookCount++] = new LibraryBook(book);
			System.out.println("Added '" + book.getTitle() + "' to the Library.");
		} else {
			System.out.println("Library is full. Cannot add more books.");
		}
	}
	
	public void removeBook(String title) {
		for ( int i = 0; i < bookCount; i++ ) {
			if ( booklist[i].getTitle().equals(title)) {
				// Shift all elements to the left starting from the found book
				for ( int j = i; j < bookCount - 1; j++ ) {
					booklist[j] = booklist[j+1];
				}
				// Set the last element to null and decrement bookCount
				booklist[--bookCount] = null;
				System.out.println("Removed '" + title + "' from the Library.");
				return; // Exit method after removing the book
			}
		}
		// If not found, print a message.
		System.out.println("# Error: Could not find '" + title + "' in the Library!");
	}
	
	public void borrowBook(String title) {
		for ( int i = 0; i < bookCount; i++ ) {
			if ( booklist[i].getTitle().equals(title) ) {
				if ( booklist[i].isAvailable() ) {
					booklist[i].setAvailable(false);
					System.out.println("Borrowed '" + title + "' from the Library.");
				} else {
					System.out.println("'" + title + "' is not available to borrow!");
				}
				return; // Exit method after processing the book
			}
		}
		// If not found, print a message.
		System.out.println("# Error: Could not find '" + title + "' in the Library!");
	}
	
	public void returnBook(String title) {
		for ( int i = 0; i < bookCount; i++ ) {
			if ( booklist[i].getTitle().equals(title) ) {
				if (!booklist[i].isAvailable() ) {
					booklist[i].setAvailable(true);
					System.out.println("Returned '" + title + "' to the Library.");
				} else {
					System.out.println("'" + title + "' is not checked out!");
				}
				return; // Exit method after processing the book
			}
		}
		// If not found, print a message.
		System.out.println("# Error: Could not find '" + title + "' in the Library!");
	}
	
	public void displayAllBooks() {
		System.out.println("\nList of ALL books:");
		for ( int i = 0; i < bookCount; i++ ) {
			System.out.print(booklist[i].getTitle() + "\t| ");
			System.out.print(booklist[i].getAuthor() + "\t| ");
			System.out.print(booklist[i].getYear() + "\t| ");
			  
			if (booklist[i].isAvailable()) {
			    System.out.print("Available");
			} else {
			    System.out.print("Out");
			}
			System.out.println("");
		}
		System.out.println("");
	}
	
	public void displayAllAvailableBooks() {
		System.out.println("\nList of AVAILABLE books:");
		for ( int i = 0; i < bookCount; i++ ) {
			if (booklist[i].isAvailable()) {
				System.out.print(booklist[i].getTitle() + "\t| ");
				System.out.print(booklist[i].getAuthor() + "\t| ");
				System.out.print(booklist[i].getYear() + "\t| ");
			} else {
				continue;
			}
			System.out.println("");
		}
		System.out.println("");
	}
	
	public void displayAllCheckedOutBooks() {
		System.out.println("\nList of Checked OUT books:");
		for ( int i = 0; i < bookCount; i++ ) {
			if (!booklist[i].isAvailable()) {
				System.out.print(booklist[i].getTitle() + "\t| ");
				System.out.print(booklist[i].getAuthor() + "\t| ");
				System.out.print(booklist[i].getYear() + "\t| ");
			} else {
				continue;
			}
			System.out.println("");
		}
		System.out.println("");
	}

}
