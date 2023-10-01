package com.example.ElasticSearch.entity;

import java.util.UUID;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(indexName = "crud")
public class User {
    @Id
    private UUID id;
    private String firstName;
    private String lastName;
    private String email;
   
}
