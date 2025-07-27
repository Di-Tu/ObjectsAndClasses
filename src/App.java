public class App {
    public static void main(String[] args) {
        Author oscarWilde = new Author("Oscar", "Wilde");
        Book thePictureOfDorianGray = new Book("The Picture of Dorian Gray", oscarWilde, 2024);
        System.out.println("Название книги: " + thePictureOfDorianGray.getNameBook() + ", Автор: " + thePictureOfDorianGray.getAuthorBookName().getName() + " " + thePictureOfDorianGray.getAuthorBookName().getSurname() + ", год: " + thePictureOfDorianGray.getYearBook());

        Author konstantinFedorov = new Author("Константин", "Федоров");
        Book freeShooter = new Book("Вольный стрелок", konstantinFedorov, 2021);
        System.out.println("Название книги: " + freeShooter.getNameBook() + ", Автор: " + freeShooter.getAuthorBookName().getName() + " " + freeShooter.getAuthorBookName().getSurname() + ", год: " + freeShooter.getYearBook());

        freeShooter.setYearBook(2020);
        System.out.println("Название книги: " + freeShooter.getNameBook() + ", Автор: " + freeShooter.getAuthorBookName().getName() + " " + freeShooter.getAuthorBookName().getSurname() + ", год: " + freeShooter.getYearBook());
    }
}
