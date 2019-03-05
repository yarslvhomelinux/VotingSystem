package service;

import model.DailyMenu;
import model.MenuItem;
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

    public void removeRestaurant(Restaurant restaurant) {

    }

    public void remove(Restaurant restaurant) {
        restaurantRepository.delete(restaurant);
    }

    public List<Restaurant> getAll() {
        return restaurantRepository.findAll();
    }

    public List<DailyMenu> getTodayMenuForAllRestaurant() {
        return null;
    }

    public DailyMenu getTodayMenuForSelectedRestaurant(Restaurant restaurant) {
        return null;
    }

    public void createDailyMenu(DailyMenu dailyMenu) {

    }

    public void removeDailyMenu(DailyMenu dailyMenu) {

    }

    public void createMenuItem(MenuItem menuItem) {

    }

    public void removeMenuItem(MenuItem menuItem) {

    }

    public void addMenuItemsToDailyMenu(List<MenuItem> menuItems, DailyMenu dailyMenu) {

    }

    public void clearAllItemsFromDailyMenu(DailyMenu dailyMenu) {

    }
}
