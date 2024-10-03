package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.model.Car;

import java.util.*;

@Component
public class CarServiceImp implements CarService {

    @Autowired
    private CarDao carDao;

    @Override
    public List<Car> getLimitedNumberOfCars(Integer count) {
        List<Car> cars = carDao.getCars();
        return cars.size() <= count ? cars : cars.subList(0, count);
    }

    @Override
    public List<Car> getCars() {
        return carDao.getCars();
    }
}
