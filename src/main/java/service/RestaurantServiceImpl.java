package service;

import model.DailyMenu;
import model.MenuItem;
import model.Restaurant;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.DailyMenuCrudRepository;
import repository.MenuItemCrudRepository;
import repository.RestaurantCrudRepository;

import java.util.Collections;
import java.util.List;

@Service
public class RestaurantServiceImpl implements RestaurantService {

    private static final Logger log = Logger.getLogger(RestaurantServiceImpl.class);

    @Autowired
    private RestaurantCrudRepository restaurantRepository;

    @Autowired
    private DailyMenuCrudRepository dailyMenuCrudRepository;

    @Autowired
    private MenuItemCrudRepository menuItemCrudRepository;

    public void createRestaurant(Restaurant restaurant) {
        restaurantRepository.saveAndFlush(restaurant);
    }

    public void removeRestaurant(Restaurant restaurant) {
        restaurantRepository.delete(restaurant);
    }

    public List<Restaurant> getAll() {
        log.trace("Restaurant service -- get all");

        return restaurantRepository.findAll();
    }

    public List<DailyMenu> getTodayMenuForAllRestaurant() {
        return dailyMenuCrudRepository.getTodayMenuForAllRestaurant();
    }

    public DailyMenu getTodayMenuForSelectedRestaurant(Integer restaurantId) {
        return dailyMenuCrudRepository.getTodayMenuForSelectedRestaurant(restaurantId);
    }

    public void createDailyMenu(DailyMenu dailyMenu) {
        dailyMenuCrudRepository.save(dailyMenu);
    }

    public void removeDailyMenu(DailyMenu dailyMenu) {
        dailyMenuCrudRepository.delete(dailyMenu);
    }

    public void createMenuItem(MenuItem menuItem) {
        menuItemCrudRepository.save(menuItem);
    }

    public void removeMenuItem(MenuItem menuItem) {
        menuItemCrudRepository.delete(menuItem);
    }

    public void addMenuItemsToDailyMenu(List<MenuItem> menuItems, DailyMenu dailyMenu) {
        List<MenuItem> currentMenuItems = dailyMenu.getMenuItems();
        currentMenuItems.addAll(menuItems);
        dailyMenu.setMenuItems(currentMenuItems);
        dailyMenuCrudRepository.save(dailyMenu);
    }

    public void clearAllItemsFromDailyMenu(DailyMenu dailyMenu) {
        dailyMenu.setMenuItems(Collections.<MenuItem>emptyList());
        dailyMenuCrudRepository.save(dailyMenu);
    }
}
