package ru.itis.maletskov.cassandra.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;
import ru.itis.maletskov.cassandra.entity.Department;
import ru.itis.maletskov.cassandra.entity.IdAndDeptNameKey;

public interface DepartmentRepository extends CassandraRepository<Department, IdAndDeptNameKey> {
}
