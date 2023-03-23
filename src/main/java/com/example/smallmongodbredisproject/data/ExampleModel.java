package com.example.smallmongodbredisproject.data;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Remember: Collections are the equivalent to Tables
 * Doucments are the equivalent to rows
 */

@Document(collection = "customers")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExampleModel {
    @Id
    private String id;
    private String name;
    private String email;
    private String phone;
}
