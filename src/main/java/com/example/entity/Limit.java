package com.example.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("limit")
@Data
public class Limit {

    private int max;
    private int min;

    public Limit(int max, int min) {
        this.max = max;
        this.min = min;
    }
}
