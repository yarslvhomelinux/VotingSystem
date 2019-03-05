package repository;

import model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = true)
public interface RestaurantCrudRepository extends JpaRepository<Restaurant, Integer> {

    Restaurant save(Restaurant restaurant);

    List<Restaurant> findAll();

    List<Restaurant> findByName(String name);

    void delete(Restaurant restaurant);
}
