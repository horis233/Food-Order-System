package com.horis.foodorderplatform.restaurantservice.service.implement;

import com.horis.foodorderplatform.restaurantservice.domain.Restaurant;
import com.horis.foodorderplatform.restaurantservice.repository.RestaurantRepository;
import com.horis.foodorderplatform.restaurantservice.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class RestaurantServiceImplement implements RestaurantService {
    private RestaurantRepository restaurantRepository;

    @Autowired
    public RestaurantServiceImplement(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    @Override
    public void createRestaurant(Restaurant restaurant) {
        restaurantRepository.save(restaurant);
    }

    @Override
    public Restaurant getRestaurantByName(String name) {
        Restaurant restaurant = restaurantRepository.findFirstByName(name);
        return restaurant;
    }
}
