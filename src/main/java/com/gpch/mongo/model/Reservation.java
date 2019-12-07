package com.gpch.mongo.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document(collection = "reservations")
@Builder
public class Reservation {
    @Id
    private String id;
    private String name;
    private LocalDateTime date;
}
