import model.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import repository.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@ContextConfiguration({
        "classpath:spring/spring-test-db.xml"
})
@RunWith(SpringJUnit4ClassRunner.class)
public class PopulateUtilsTest {

    @Autowired
    private RestaurantCrudRepository restaurantCrudRepository;
    @Autowired
    private DailyMenuCrudRepository dailyMenuCrudRepository;
    @Autowired
    private MenuItemCrudRepository menuItemCrudRepository;
    @Autowired
    private UserCrudRepository userCrudRepository;
    @Autowired
    private VoteCrudRepository voteCrudRepository;

    @Test
    public void createTestDBDataForRestaurant() {
        Restaurant restaurant = new Restaurant();
        restaurant.setName("ROZA PIK");

        List<DailyMenu> dailyMenuList = new ArrayList<DailyMenu>();
        DailyMenu dailyMenu = new DailyMenu();
        dailyMenu.setDate(new Date());
        dailyMenu.setRestaurant(restaurant);

        List<MenuItem> menuItemList = new ArrayList<MenuItem>();
        MenuItem menuItem = new MenuItem();
        menuItem.setDailyMenu(dailyMenu);
        menuItem.setDishName("pervoe");
        menuItem.setPrice(250);

        menuItemList.add(menuItem);

        dailyMenu.setMenuItems(menuItemList);
        dailyMenuList.add(dailyMenu);

        restaurant.setDailyMenuList(dailyMenuList);

        restaurantCrudRepository.saveAndFlush(restaurant);
        dailyMenuCrudRepository.saveAndFlush(dailyMenu);
        menuItemCrudRepository.saveAndFlush(menuItem);
    }

    @Test
    public void createTestDBDataForVote() {
        User user = new User();
        user.setName("Johnathan");
        user.setRole("admin");

        Vote vote = new Vote();
        vote.setDate(new Date());
        vote.setUser(user);

        userCrudRepository.save(user);
        voteCrudRepository.save(vote);
    }
}
