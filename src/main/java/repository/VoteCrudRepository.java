package repository;

import model.User;
import model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Transactional(readOnly = true)
public interface VoteCrudRepository extends JpaRepository<Vote, Integer> {

    List<Vote> findByDate(String date);

    List<Vote> findByDateAndUser(Date date, User user);
}
