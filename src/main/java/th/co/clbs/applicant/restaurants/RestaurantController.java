package th.co.clbs.applicant.restaurants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Created by clbs on 4/4/17.
 */
@RestController
@RequestMapping("/v1/api/restaurants")
public class RestaurantController {
    private final RestaurantService restaurantService;

    @Autowired
    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }


    @GetMapping("")
    public List<Restaurant> getAll() {
        return restaurantService.getAll();
    }
}
