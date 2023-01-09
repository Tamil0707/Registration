package in.logindemo.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="users")
@Data
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private   String login;
    private String password;
    private String email;
    private int age;
    private String gender;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return Objects.equals(id, users.id) &&
                Objects.equals(login, users.login) &&
                Objects.equals(password, users.password) &&
                Objects.equals(email, users.email) &&
                Objects.equals(age, users.age) &&
                Objects.equals(gender, users.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, login, password, email,age,gender);
    }

}
