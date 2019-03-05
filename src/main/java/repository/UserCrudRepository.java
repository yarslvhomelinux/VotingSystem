package repository;

import model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = true)
public interface UserCrudRepository extends JpaRepository<User, Integer> {

    List<User> findByName(String name);
}
