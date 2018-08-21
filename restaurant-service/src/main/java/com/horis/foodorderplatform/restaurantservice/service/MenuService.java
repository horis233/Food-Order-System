package com.horis.foodorderplatform.restaurantservice.service;

import com.horis.foodorderplatform.restaurantservice.domain.Menu;

import java.util.List;

public interface MenuService {
    List<Menu> findAllByRestaurantId(String rid);
    void createMenuItem(Menu menuItem);
    void uploadMenuItems(List<Menu> menuItems);
}
