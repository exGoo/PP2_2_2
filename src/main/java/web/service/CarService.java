package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> getLimitedNumberOfCars(Integer count);
    List<Car> getCars();
}
