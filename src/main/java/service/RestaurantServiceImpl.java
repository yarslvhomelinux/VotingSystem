package service;

import model.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.RestaurantCrudRepository;

import java.util.List;

@Service
public class RestaurantServiceImpl implements RestaurantService {

    @Autowired
    private RestaurantCrudRepository restaurantRepository;

    public void createRestaurant(Restaurant restaurant) {
        restaurantRepository.saveAndFlush(restaurant);
    }

    public void remove(Restaurant restaurant) {
        restaurantRepository.delete(restaurant);
    }

    public List<Restaurant> getAll() {
        return restaurantRepository.findAll();
    }
}
