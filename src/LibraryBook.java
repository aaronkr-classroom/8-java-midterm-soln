public class LibraryBook implements Book {
	private String isbn;
	private String title;
	private String author;
	private int year;
	private boolean available;
	
	LibraryBook() {}
	
	LibraryBook(Book b) {
		this.isbn = b.getISBN();
		this.title = b.getTitle();
		this.author = b.getAuthor();
		this.year = b.getYear();
		this.available = true;
	}
	
	LibraryBook(String isbn, String title, String author, int year) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.year = year;
		this.available = true;
	}
	
	@Override
	public String getISBN() { return this.isbn; }
	public String getTitle() { return this.title; }
	public String getAuthor() { return this.author; }
	public int getYear() { return this.year; }
	public boolean isAvailable() { return this.available; }
	public void setAvailable(boolean available) {
		this.available = available;
	}
}
