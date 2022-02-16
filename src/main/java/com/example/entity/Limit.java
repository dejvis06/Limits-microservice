package com.example.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("limit")
@Data
@Builder
public class Limit {

    private int max;
    private int min;
}
