package service;

import model.Restaurant;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RestaurantService {

    void createRestaurant(Restaurant restaurant);

    void remove(Restaurant restaurant);

    List<Restaurant> getAll();
}
