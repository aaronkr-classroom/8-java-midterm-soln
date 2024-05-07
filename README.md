# 8���� JAVA �߰���� �Ǳ����

For this test, you will create a LibrarySystem class that utilizes a LibraryBook class which is based on a Book interface.
�� ���迡���� Book �������̽��� ������� �ϴ� LibraryBook Ŭ������ Ȱ���ϴ� LibrarySystem Ŭ������ ����ϴ�.

Use the files provided and the book's code to help.
������ ���ϰ� å�� �ڵ带 ����Ͽ� ������ ��������.

**����**

1. `Book.java` (�������̽�)
2. `LibraryBook.java` (Book ����)
3. `LibrarySystem.java` (LibraryBook ���)
4. `Main.java` (���� �Լ�)

## ���� ����

**`Book.java`**

Create a Book Interface and add the following function definitions.
Book �������̽��� ����� ���� �Լ� ���Ǹ� �߰��ϼ���.

```java
String getIsbn();
String getTitle();
String getAuthor();
int getYear();
boolean isAvailable();
void setAvailable(boolean available);
```

**`LibraryBook.java`**

Create a LibraryBook class that implements the Book interface. Add the following instance variables and methods.
Book �������̽��� �����ϴ� LibraryBook Ŭ������ ���弼��. ���� �ν��Ͻ� ������ �޼ҵ带 �߰��ϼ���.

```java
private String isbn;
private String title;
private String author;
private int year;
private boolean available;

public LibraryBook(Book book) {
    // ������
}

public LibraryBook(String isbn, String title, String author, int year) {
    // ������
}

@Override
public String getIsbn(); // return isbn
public String getTitle(); // return title
public String getAuthor(); // return author
public int getYear(); // return year
public boolean isAvailable(); // return available
public void setAvailable(boolean available);
```

**`LibrarySystem.java`**

Create a LibrarySystem class that contains a list of LibraryBook objects. Add the following instance variables and methods.
LibraryBook ��ü ����� �����ϴ� LibrarySystem Ŭ������ ���弼��. ���� �ν��Ͻ� ������ �޼ҵ带 �߰��ϼ���.

Use the 'Java Master' Book Market code to help you.
'Java Master' Book Market �ڵ带 ����Ͽ� ������ ��������.

```java
private Book[] booklist;
private static int bookCount = 0;
private static final int NUM_BOOK = 10;

public LibrarySystem() {
    this.booklist = new Book[NUM_BOOK]; // ������
}

public void addBook(Book book) {
    // å �߰�
    // ������ ���� Cart.java�� insertBook(Book book)�� �����ϼ���
}

public void removeBook(String title) {
    // å ����
    // ������ �ڵ带 ����ϼ���
}

public void borrowBook(String title) {
    // å ����
    // borrowBook �޼ҵ带 �ϼ��ϼ���
}

public void returnBook(String title) {
    // å �ݳ�
    // borrowBook �޼ҵ带 �����Ͽ� returnBook �޼ҵ带 ���� �ۼ��ϼ���
}

public void displayBooks() {
    // å ��� ��� (å�̸�, ����, ���ǳ⵵, ���Ⱑ�ɿ��� ���)

    /* 
    Expected output:
    "ISBN1234 | JSP �� ���α׷��� | �۹̿� | 2018 | Available"
    "ISBN1235 | �ȵ���̵� ���α׷��� | ���糲 | 2022 | Out"
    ...
    */

    // ������ ���� Cart.java�� printBookList()�� �����ϼ���
}
```

**`Main.java`**

Test your code with the provided `Main.java` file.
������ `Main.java` ���Ϸ� �ڵ带 �׽�Ʈ�ϼ���.