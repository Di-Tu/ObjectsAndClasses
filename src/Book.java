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
}
