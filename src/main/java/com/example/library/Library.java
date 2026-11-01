package com.example.library;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Класс, представляющий библиотеку.
 * Реализует композицию: содержит название библиотеки и коллекцию книг.
 *
 * @author Student
 * @version 1.0
 */
public class Library {

    /** Название библиотеки. */
    private final String name;

    /** Коллекция книг, хранящихся в библиотеке. */
    private final List<Book> books;

    /**
     * Создает новую библиотеку с указанным названием и пустой коллекцией книг.
     *
     * @param name название библиотеки
     */
    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    /**
     * Добавляет одну книгу в коллекцию библиотеки.
     *
     * @param book объект книги для добавления
     */
    public void addBook(Book book) {
        if (book != null) {
            books.add(book);
        }
    }

    /**
     * Возвращает название библиотеки.
     *
     * @return название библиотеки
     */
    public String getName() {
        return name;
    }

    /**
     * Возвращает неизменяемый список всех книг в библиотеке.
     *
     * @return коллекция книг
     */
    public List<Book> getBooks() {
        return Collections.unmodifiableList(books);
    }

    /**
     * Находит и возвращает все книги указанного автора в данной библиотеке.
     *
     * @param author имя автора для поиска
     * @return список найденных книг данного автора
     */
    public List<Book> getBooksByAuthor(String author) {
        return books.stream()
                .filter(book -> book.getAuthor().equalsIgnoreCase(author))
                .collect(Collectors.toList());
    }
}
