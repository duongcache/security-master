package springboot.com.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import springboot.com.security.model.User;
@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    User findByEmail(String email);
}
