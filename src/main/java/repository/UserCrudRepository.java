package repository;

import model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = true)
public interface UserCrudRepository extends JpaRepository<User, Integer> {

    User save(User restaurant);

    List<User> findAll();

    List<User> findByName(String name);

    void delete(User user);
}
