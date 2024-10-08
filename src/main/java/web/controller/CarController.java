package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String getList(@RequestParam(value = "count", required = false)
                              Integer count, Model model) {

        List<Car> cars = carService.getCars();
        model.addAttribute("cars_list",
                count != null && count <= cars.size()
                    ? carService.getLimitedNumberOfCars(count)
                    : cars);

        return "cars";
    }

}
