package repository;

import model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = true)
public interface RestaurantCrudRepository extends JpaRepository<Restaurant, Integer> {

    List<Restaurant> findByName(String name);

    Restaurant findFirstById(Integer id);

    @Transactional
    @Modifying
    @Query("update Restaurant u set u.name = :name where u.id = :userId")
    void updateRestaurant(@Param("name") String name, @Param("userId") Integer userId);
}
