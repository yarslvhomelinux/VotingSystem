package controller;

import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import service.RestaurantService;

@Controller
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    @GetMapping("/")
    public String root() {
        return "index";
    }

    @RequestMapping(value = "/restaurants")
    public String display(HttpServletRequest request, Model model) {
        model.addAttribute("restaraunts", restaurantService.getAll());
        return "restarauntsList";
    }
}

