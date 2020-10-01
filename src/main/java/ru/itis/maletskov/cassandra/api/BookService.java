package ru.itis.maletskov.cassandra.api;

public interface BookService {

    /**
     * Метод для сохранения книг(рандомных)
     *
     * @param batchSize число книг
     */
    void saveBooks(Integer batchSize);
}
