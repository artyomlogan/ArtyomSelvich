package com.example.library;

/**
 * Класс, представляющий книгу в библиотеке.
 * Наследует базовые свойства от класса {@link Publication}.
 *
 * @author Student
 * @version 1.0
 */
public class Book extends Publication {

    /** Автор книги. */
    private final String author;

    /**
     * Создает новый объект книги.
     *
     * @param title  название книги
     * @param author автор книги
     * @param year   год написания книги
     */
    public Book(String title, String author, int year) {
        super(title, year);
        this.author = author;
    }

    /**
     * Возвращает автора книги.
     *
     * @return имя автора
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Возвращает всю информацию по книге (название, автор, год написания).
     *
     * @return форматированная строка с информацией о книге
     */
    @Override
    public String getInfo() {
        return String.format("Книга: \"%s\" | Автор: %s | Год написания: %d",
                getTitle(), author, getYear());
    }

    /**
     * Возвращает строковое представление объекта книги.
     *
     * @return полная информация о книге
     */
    @Override
    public String toString() {
        return getInfo();
    }
}
