package model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "DAILY_MENU")
public class DailyMenu extends AbstractBaseEntity {

    @Temporal(TemporalType.DATE)
    @Column(name = "DATE_")
    protected Date date;

    @OneToMany(mappedBy = "dailyMenu", fetch = FetchType.EAGER)
    protected List<MenuItem> menuItems;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "RESTAURANT_ID")
    protected Restaurant restaurant;

    public DailyMenu() {
    }

    public DailyMenu(Integer id, Date date, Restaurant restaurant, List<MenuItem> menuItems) {
        super(id);
        this.date = date;
        this.menuItems = menuItems;
        this.restaurant = restaurant;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
}
