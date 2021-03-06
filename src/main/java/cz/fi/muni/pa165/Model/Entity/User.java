package cz.fi.muni.pa165.Model.Entity;

import cz.fi.muni.pa165.Model.Role;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class User {

    public User(String firstName, String lastName, Role role) {
        this.id = UUID.randomUUID();
        this.role = role;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Id
    private UUID id;

    private Role role;

    private String firstName;

    private String lastName;

    public UUID getId() {
        return id;
    }

    public Role getRole() {
        return role;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
