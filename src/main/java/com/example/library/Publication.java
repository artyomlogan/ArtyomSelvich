package com.example.library;

/**
 * Абстрактный базовый класс, представляющий печатное издание.
 * Используется для демонстрации механизма наследования.
 *
 * @author Student
 * @version 1.0
 */
public abstract class Publication {

    /** Название издания. */
    private final String title;

    /** Год написания (издания). */
    private final int year;

    /**
     * Конструктор создания печатного издания.
     *
     * @param title название издания
     * @param year  год написания
     */
    public Publication(String title, int year) {
        this.title = title;
        this.year = year;
    }

    /**
     * Возвращает название издания.
     *
     * @return название издания
     */
    public String getTitle() {
        return title;
    }

    /**
     * Возвращает год написания издания.
     *
     * @return год написания
     */
    public int getYear() {
        return year;
    }

    /**
     * Возвращает полную информацию об издании.
     *
     * @return строка с описанием издания
     */
    public abstract String getInfo();
}
