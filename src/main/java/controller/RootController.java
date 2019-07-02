package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import service.RestaurantService;

@Controller
public class RootController {

    @Autowired
    private RestaurantService restaurantService;

    @GetMapping("/")
    public String showMainPage() {
        return "index";
    }

    @RequestMapping(value = "/restaurants")
    public String showRestaurants(HttpServletRequest request, Model model) {
        model.addAttribute("restaraunts", restaurantService.getAll());
        return "restaurantList";
    }

    @RequestMapping(value = "/users")
    public String showUsers(HttpServletRequest request, Model model) {
        //model.addAttribute("restaraunts", restaurantService.getAll());
        return "userList";
    }

    @RequestMapping(value = "/menus")
    public String showMenus(HttpServletRequest request, Model model) {
        //model.addAttribute("restaraunts", restaurantService.getAll());
        return "menuList";
    }

    @RequestMapping(value = "/voting")
    public String showVoting(HttpServletRequest request, Model model) {
        //model.addAttribute("restaraunts", restaurantService.getAll());
        return "votingPage";
    }
}

