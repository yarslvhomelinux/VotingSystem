package model;

import javax.persistence.*;
import java.util.Date;

public class Vote extends AbstractBaseEntity {

    @Temporal(TemporalType.DATE)
    @Column(name = "DATE")
    protected Date date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
    protected User user;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RESTAURANT_ID")
    protected Restaurant restaurant;

    public Vote() {}

    public Vote(Integer id, Date date, User user, Restaurant restaurant) {
        super(id);
        this.date = date;
        this.user = user;
        this.restaurant = restaurant;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
}
