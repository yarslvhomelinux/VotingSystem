package repository;

import model.DailyMenu;
import model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Transactional(readOnly = true)
public interface DailyMenuCrudRepository extends JpaRepository<DailyMenu, Integer> {

    List<DailyMenu> findByDate(String date);

    List<DailyMenu> findByRestaurant(Restaurant restaurant);

    List<DailyMenu> findByDateAndRestaurant(Date date, Restaurant restaurant);

    @Query("select d from DailyMenu d where d.date = current_date")
    List<DailyMenu> getTodayMenuForAllRestaurant();

    @Query("select d from DailyMenu d where d.restaurant.id = :restaurantId")
    DailyMenu getTodayMenuForSelectedRestaurant(@Param("restaurantId") Integer restaurantId);
}
