package com.horis.foodorderplatform.restaurantservice.service;

import com.horis.foodorderplatform.restaurantservice.domain.Restaurant;

public interface RestaurantService {
    void createRestaurant(Restaurant restaurant);
    Restaurant getRestaurantByName(String name);
}

