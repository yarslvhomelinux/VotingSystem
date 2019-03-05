package repository;

import model.DailyMenu;
import model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Transactional(readOnly = true)
public interface DailyMenuCrudRepository extends JpaRepository<DailyMenu, Integer> {

    DailyMenu save(DailyMenu dailyMenu);

    List<DailyMenu> findAll();

    List<DailyMenu> findByDate(String date);

    List<DailyMenu> findByRestaurant(Restaurant restaurant);

    List<DailyMenu> findByDateAndRestaurant(Date date, Restaurant restaurant);

    void delete(DailyMenu dailyMenu);
}
