package web.service;

import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.List;

public interface CarService {
    List<Car> listCars();
    List<Car> getCars(Integer count);
}
