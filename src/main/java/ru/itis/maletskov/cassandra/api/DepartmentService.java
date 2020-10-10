package ru.itis.maletskov.cassandra.api;

public interface DepartmentService {

    /**
     * Метод для сохранения департаментов(рандомных)
     *
     * @param batchSize число департаментов
     */
    void saveDepartments(Integer batchSize);
}
