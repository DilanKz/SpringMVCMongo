package org.example.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * `@authority Tharindu Dilan`
 * 9:22 AM
 * 2023-11-12 - 11 - 2023
 */

@Document(collection = "users")
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class User {
    @Id
    @Indexed(unique = true)
    private String id;

    private String firstName;
    private String lastName;
    private int age;
}
