package ru.itis.maletskov.cassandra.repository;

import java.util.UUID;
import org.springframework.data.cassandra.repository.CassandraRepository;
import ru.itis.maletskov.cassandra.entity.Book;

public interface BookRepository extends CassandraRepository<Book, UUID> {
}
