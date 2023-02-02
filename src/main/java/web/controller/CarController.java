package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.List;

@Controller
public class CarController {

    private CarServiceImpl carServiceImp;

    public CarController(CarServiceImpl carServiceImp) {
        this.carServiceImp = carServiceImp;
    }

    @GetMapping(value = "/cars")
    public String listNumCars(@RequestParam(name = "count", defaultValue = "5") Integer count, Model model) {
        List<Car> cars = carServiceImp.getCars(count);
        model.addAttribute("car", 5);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
