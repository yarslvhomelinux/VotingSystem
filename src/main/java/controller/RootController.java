package controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import model.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
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
        model.addAttribute("restaurants", restaurantService.getAll());
        return "restaurantList";
    }

    @RequestMapping(value = "/createRestaurant")
    public String createRestaurant(Model model) {
        model.addAttribute("restaurant", new Restaurant());
        return "restaurantForm";
    }

    @RequestMapping(value="/editRestaurant/{id}", method = RequestMethod.GET)
    public String editRestaurant(@PathVariable int id, Model model) {
        if (restaurantService.getRestaurantById(id) != null)
            model.addAttribute("restaurant", restaurantService.getRestaurantById(id));

        return "restaurantForm";
    }

    @RequestMapping(value="/saveRestaurant",method = RequestMethod.POST)
    public String saveRestaurant(@ModelAttribute("restaurant") Restaurant restaurant) {
//        if (restaurant.getId() == null) {
//            restaurantService.createRestaurant(restaurant);
//        } else {
            restaurantService.saveRestaurant(restaurant);
      //  }

        return "redirect:/restaurants";
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

