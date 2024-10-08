package web.config.Repository;

// UserRepository.java
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import web.config.Model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}

