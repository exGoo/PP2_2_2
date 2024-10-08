package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImp implements CarDao {

    private final List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("BMW", "11"));
        cars.add(new Car("Audi", "22"));
        cars.add(new Car("Honda", "33"));
        cars.add(new Car("Mercedes", "44"));
        cars.add(new Car("Kia", "55"));
    }

    @Override
    public List<Car> getCars() {
        return cars;
    }
}
