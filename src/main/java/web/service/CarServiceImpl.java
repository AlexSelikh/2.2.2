package web.service;


import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {

    private static List<Car> car;

    {
        car = new ArrayList<>();
        car.add(new Car("manuf1", "model1", 1));
        car.add(new Car("manuf2", "model2", 2));
        car.add(new Car("manuf3", "model3", 3));
        car.add(new Car("manuf4", "model4", 4));
        car.add(new Car("manuf5", "model5", 5));
    }


    @Override
    public List<Car> listCars() {
        return car;
    }

    @Override
    public List<Car> getCars(Integer count) {

        return car.stream().limit(count).collect(Collectors.toList());
    }
}
