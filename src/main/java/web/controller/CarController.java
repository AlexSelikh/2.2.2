package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;

@Controller
public class CarController {

    CarServiceImpl carService = new CarServiceImpl();

    @GetMapping(value = "/cars")
    public String listNumCars(@RequestParam(name = "count", defaultValue = "5") Integer count, Model model) {
        model.addAttribute("car", 5);
        model.addAttribute("car", carService.getCars(count));
        return "cars";
    }
}
