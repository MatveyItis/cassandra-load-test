package ru.itis.maletskov.cassandra.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.itis.maletskov.cassandra.api.BookService;

@RestController
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @PostMapping("/api/v0/book")
    public ResponseEntity<Void> saveBooks(@RequestParam("size") Integer batchSize) {
        bookService.saveBooks(batchSize);
        return ResponseEntity.ok().build();
    }
}
