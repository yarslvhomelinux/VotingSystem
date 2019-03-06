import model.DailyMenu;
import model.Restaurant;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.RestaurantService;

@ContextConfiguration({
        "classpath:spring/spring-db.xml"
})
@RunWith(SpringJUnit4ClassRunner.class)
//@Sql(scripts = "classpath:db/population-test-db.sql")
public class RestaurantServiceTest {

    @Autowired
    protected RestaurantService restaurantService;

    @Test
    public void testFindAll() {
        for (Restaurant restaurant : restaurantService.getAll()) {
            System.out.println(restaurant.toString());
        }
    }

    @Test
    public void testGetTodayMenuForAllRestaurant() {
        for (DailyMenu dailyMenuant : restaurantService.getTodayMenuForAllRestaurant()) {
            System.out.println(dailyMenuant.toString());
        }
    }

    @Test
    public void testGetTodayMenuForSelectedRestaurant() {
        System.out.println(restaurantService.getTodayMenuForSelectedRestaurant(3).toString());
    }

}
