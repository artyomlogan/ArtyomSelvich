package com.example.library;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

/**
 * Главный класс консольного приложения для демонстрации работы
 * иерархии классов учета книг в библиотеках (Вариант 8).
 *
 * @author Student
 * @version 1.0
 */
public class App {

    /**
     * Точка входа в приложение.
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        Library centralLibrary = new Library("Центральная городская библиотека");
        centralLibrary.addBook(new Book("Война и мир", "Лев Толстой", 1869));
        centralLibrary.addBook(new Book("Анна Каренина", "Лев Толстой", 1877));
        centralLibrary.addBook(new Book("Преступление и наказание", "Федор Достоевский", 1866));
        centralLibrary.addBook(new Book("Мастер и Маргарита", "Михаил Булгаков", 1940));

        Library universityLibrary = new Library("Научная библиотека университета");
        universityLibrary.addBook(new Book("Воскресение", "Лев Толстой", 1899));
        universityLibrary.addBook(new Book("Идиот", "Федор Достоевский", 1869));
        universityLibrary.addBook(new Book("Собачье сердце", "Михаил Булгаков", 1925));
        universityLibrary.addBook(new Book("Отцы и дети", "Иван Тургенев", 1862));

        Library districtLibrary = new Library("Районная библиотека №8");
        districtLibrary.addBook(new Book("Детство", "Лев Толстой", 1852));
        districtLibrary.addBook(new Book("Евгений Онегин", "Александр Пушкин", 1833));
        districtLibrary.addBook(new Book("Капитанская дочка", "Александр Пушкин", 1836));

        List<Library> libraries = Arrays.asList(centralLibrary, universityLibrary, districtLibrary);

        System.out.println("==========================================================");
        System.out.println("ПОЛНАЯ ИНФОРМАЦИЯ О КНИГАХ ВО ВСЕХ БИБЛИОТЕКАХ:");
        System.out.println("==========================================================");
        for (Library library : libraries) {
            System.out.println("\nБиблиотека: " + library.getName());
            for (Book book : library.getBooks()) {
                System.out.println("  - " + book.getInfo());
            }
        }

        String targetAuthor = "Лев Толстой";
        System.out.println("\n==========================================================");
        System.out.println("ПОИСК КНИГ АВТОРА \"" + targetAuthor + "\" В КАЖДОЙ БИБЛИОТЕКЕ:");
        System.out.println("==========================================================");
        for (Library library : libraries) {
            System.out.println("\nБиблиотека: " + library.getName());
            List<Book> authorBooks = library.getBooksByAuthor(targetAuthor);
            if (authorBooks.isEmpty()) {
                System.out.println("  Книг данного автора не найдено.");
            } else {
                for (Book book : authorBooks) {
                    System.out.println("  - " + book.getInfo());
                }
            }
        }
    }
}
