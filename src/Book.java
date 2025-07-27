import java.util.Objects;

public class Book {
    private String nameBook;
    private Author authorBookName;
    private int yearBook;

    public Book(String nameBook, Author name, int year) {
        this.nameBook = nameBook;
        this.authorBookName = name;
        this.yearBook = year;
    }

    public String getNameBook() {
        return nameBook;
    }

    public Author getAuthorBookName() {
        return authorBookName;
    }

    public int getYearBook() {
        return yearBook;
    }

    public void setYearBook(int year) {
        this.yearBook = year;
    }

    @Override
    public String toString() {
        return "Название книги: " + nameBook + ", Автор: " + authorBookName.toString() + ", год издания: " + yearBook;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearBook == book.yearBook && Objects.equals(authorBookName, book.authorBookName) && nameBook.equals(book.nameBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, authorBookName.hashCode(), yearBook);
    }
}
