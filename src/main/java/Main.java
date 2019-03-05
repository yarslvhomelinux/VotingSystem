import model.DailyMenu;
import model.MenuItem;
import model.Restaurant;
import org.hibernate.Session;
import service.HibernateSessionFactory;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        testInitialData();
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
