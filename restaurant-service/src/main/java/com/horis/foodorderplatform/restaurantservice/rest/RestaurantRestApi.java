package com.horis.foodorderplatform.restaurantservice.rest;

import com.horis.foodorderplatform.restaurantservice.domain.Menu;
import com.horis.foodorderplatform.restaurantservice.domain.Restaurant;
import com.horis.foodorderplatform.restaurantservice.service.MenuService;
import com.horis.foodorderplatform.restaurantservice.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RestaurantRestApi {
    RestaurantService restaurantService;
    MenuService menuItemService;

    @Autowired
    public RestaurantRestApi(RestaurantService restaurantService, MenuService menuItemService) {
        this.restaurantService = restaurantService;
        this.menuItemService = menuItemService;
    }

    @RequestMapping(value = "/restaurants", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public void createRestaurant(Restaurant restaurant) {
        restaurantService.createRestaurant(restaurant);
    }

    @RequestMapping(value = "/restaurants", method = RequestMethod.GET)
    public Restaurant findRestaurant(@RequestParam(value = "name") String name) {
        return restaurantService.getRestaurantByName(name);
    }

    @RequestMapping(value = "/restaurants/{rid}/menuItems", method = RequestMethod.GET)
    public List<Menu> getMenuItems(@PathVariable String rid) {
        return menuItemService.findAllByRestaurantId(rid);
    }

    @RequestMapping(value = "/restaurants/{rid}/menuItems", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public void createMenuItem(@RequestBody Menu menuItem) {
        menuItemService.createMenuItem(menuItem);
    }

    @RequestMapping(value = "/restaurants/bulk/menuItems", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void upload(@RequestBody List<Menu> menuItems) {
        this.menuItemService.uploadMenuItems(menuItems);
    }
}
