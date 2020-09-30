package ru.itis.maletskov.cassandra.entity;

import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Data
@Table
@AllArgsConstructor
public class Book {

    @PrimaryKey
    private UUID id;

    private String name;
}
