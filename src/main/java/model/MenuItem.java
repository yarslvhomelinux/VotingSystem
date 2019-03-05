package model;

import javax.persistence.*;

@Entity
@Table(name = "MENU_ITEM")
public class MenuItem extends AbstractBaseEntity {

    @Column(name = "DISHNAME")
    protected String dishName;

    @Column(name = "PRICE")
    protected Integer price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DAILY_MENU_ID")
    protected DailyMenu dailyMenu;

    public MenuItem() {
    }

    public MenuItem(Integer id, String dishName, Integer price, DailyMenu dailyMenu) {
        super(id);
        this.dishName = dishName;
        this.price = price;
        this.dailyMenu = dailyMenu;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public DailyMenu getDailyMenu() {
        return dailyMenu;
    }

    public void setDailyMenu(DailyMenu dailyMenu) {
        this.dailyMenu = dailyMenu;
    }
}

