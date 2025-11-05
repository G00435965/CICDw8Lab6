package ie.atu.week7cicd;


import jakarta.persistence.*;
import lombok.*;

//@Entity tells Spring Boot that it represents a table in the database.
@Entity
@Table(name = "persons")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String employeeId;
    private String position;
    private String department;

}
