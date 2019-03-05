import model.DailyMenu;
import model.MenuItem;
import model.Restaurant;
import org.hibernate.Session;
import org.springframework.context.support.GenericXmlApplicationContext;
import service.HibernateSessionFactory;
import service.RestaurantService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //testInitialData();
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/spring-db.xml"); //move from src.main.java to src.main.resources
        ctx.refresh();

        RestaurantService service = ctx.getBean(RestaurantService.class);
        List<Restaurant> contacts = service.getAll();
        printAll(contacts);
    }

    private static void printAll(List<Restaurant> restaurants) {
        System.out.println("printAll: ");
        for (Restaurant restaurant : restaurants) {
            System.out.println(restaurant.toString());
        }
    }

    public static void testInitialData() {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        session.beginTransaction();

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

        session.save(restaurant);
        session.save(menuItem);
        session.save(dailyMenu);

        session.getTransaction().commit();
        session.close();
    }
}
