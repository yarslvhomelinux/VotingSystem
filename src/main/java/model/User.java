package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "USERS")
public class User extends AbstractBaseEntity {

    public static final String ADMIN = "admin";
    public static final String USER = "user";

    @Column(name = "NAME_")
    protected String name;

    @Column(name = "ROLE")
    protected String role;

    public User() {
    }

    public User(Integer id, String name, String role) {
        super(id);
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
