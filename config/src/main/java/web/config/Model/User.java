// User.java
package web.config.Model;

import javax.persistence.*;

@Entity
@Table(name = "users") // укажите нужное имя таблицы
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Геттеры и сеттеры
}
