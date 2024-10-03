package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImp implements CarDao {
    private static int ID;
    private final List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(++ID, "BMW", "11"));
        cars.add(new Car(++ID, "Audi", "22"));
        cars.add(new Car(++ID, "Honda", "33"));
        cars.add(new Car(++ID, "Mercedes", "44"));
        cars.add(new Car(++ID, "Kia", "55"));
    }

    @Override
    public List<Car> getCars() {
        return cars;
    }
}
