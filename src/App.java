public class App {
    public static void main(String[] args) {
        System.out.println("Создание");
        Author oscarWilde = new Author("Oscar", "Wilde");
        Book thePictureOfDorianGray = new Book("The Picture of Dorian Gray", oscarWilde, 2024);
        System.out.println("Название книги: " + thePictureOfDorianGray.getNameBook() + ", Автор: " + thePictureOfDorianGray.getAuthorBookName().getName() + " " + thePictureOfDorianGray.getAuthorBookName().getSurname() + ", год: " + thePictureOfDorianGray.getYearBook());

        Author konstantinFedorov = new Author("Константин", "Федоров");
        Book freeShooter = new Book("Вольный стрелок", konstantinFedorov, 2021);
        System.out.println("Название книги: " + freeShooter.getNameBook() + ", Автор: " + freeShooter.getAuthorBookName().getName() + " " + freeShooter.getAuthorBookName().getSurname() + ", год: " + freeShooter.getYearBook());

        Author konstantinFedorov2 = new Author("Константин", "Федоров");
        Book freeShooter2 = new Book("Вольный стрелок", konstantinFedorov2, 2020);
        System.out.println("Название книги: " + freeShooter2.getNameBook() + ", Автор: " + freeShooter2.getAuthorBookName().getName() + " " + freeShooter2.getAuthorBookName().getSurname() + ", год: " + freeShooter2.getYearBook());

        System.out.println();
        System.out.println("Изменение");
        freeShooter.setYearBook(2020);
        System.out.println("Название книги: " + freeShooter.getNameBook() + ", Автор: " + freeShooter.getAuthorBookName().getName() + " " + freeShooter.getAuthorBookName().getSurname() + ", год: " + freeShooter.getYearBook());

        System.out.println();
        System.out.println("Вывод toString");
        System.out.println(konstantinFedorov.toString());
        System.out.println(freeShooter.toString());

        System.out.println();
        System.out.println("Сравнение книг");
        if (freeShooter.hashCode() != freeShooter2.hashCode()) {
            System.out.println("Книги разные");
        } else if (freeShooter.equals(freeShooter2)) {
            System.out.println("Одна и та же книга");
        } else System.out.println("Книги разные");

    }
}
