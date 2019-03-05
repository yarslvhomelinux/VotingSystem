package model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "RESTAURANT")
public class Restaurant extends AbstractBaseEntity {

    @Column(name = "NAME_")
    protected String name;

    @OneToMany(mappedBy = "restaurant", fetch = FetchType.LAZY)
    protected List<DailyMenu> dailyMenuList;

    public Restaurant() {
    }

    public Restaurant(Integer id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<DailyMenu> getDailyMenuList() {
        return dailyMenuList;
    }

    public void setDailyMenuList(List<DailyMenu> dailyMenuList) {
        this.dailyMenuList = dailyMenuList;
    }
}
