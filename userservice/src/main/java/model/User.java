package model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="users")
@Data //generates getters and setters
public class User {


}
