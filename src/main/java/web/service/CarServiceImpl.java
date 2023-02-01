package web.service;



import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class CarServiceImpl {

    private static List<Car> car;

    {
        car = new ArrayList<>();
        car.add(new Car("manuf1", "model1", 1));
        car.add(new Car("manuf2", "model2", 2));
        car.add(new Car("manuf3", "model3", 3));
        car.add(new Car("manuf4", "model4", 4));
        car.add(new Car("manuf5", "model5", 5));
    }


    public List<Car> listCars() {
        return car;
    }

    public List<Car> getCars(Integer count) {
        return car.stream().limit(count).collect(Collectors.toList());
    }
}
