public interface Book {
	String getISBN();
	String getTitle();
	String getAuthor();
	int getYear();
	boolean isAvailable();
	void setAvailable(boolean available);
}
