package com.example.springmongodb.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Book")
public @Data class Book {
    public int getId() {
        return id;
    }

    @Id
    private int id;
    private String bookName;
    private String authorName;
}
