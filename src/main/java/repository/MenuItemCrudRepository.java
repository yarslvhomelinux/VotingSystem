package repository;

import model.DailyMenu;
import model.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = true)
public interface MenuItemCrudRepository extends JpaRepository<MenuItem, Integer> {

    List<MenuItem> findByDishName(String dishName);

    List<MenuItem> findByDailyMenu(DailyMenu dailyMenu);
}
