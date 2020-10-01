package ru.itis.maletskov.cassandra.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;
import ru.itis.maletskov.cassandra.api.BookService;
import ru.itis.maletskov.cassandra.entity.Book;
import ru.itis.maletskov.cassandra.repository.BookRepository;

@Slf4j
@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Override
    public void saveBooks(Integer batchSize) {
        List<Book> books = new ArrayList<>();
        for (int i = 0; i < batchSize; i++) {
            books.add(Book.builder()
                    .id(UUID.randomUUID())
                    .name(RandomStringUtils.random(10, true, false))
                    .build());
        }
        bookRepository.saveAll(books);
        log.info("Successfully saved {} random books", batchSize);
    }
}
