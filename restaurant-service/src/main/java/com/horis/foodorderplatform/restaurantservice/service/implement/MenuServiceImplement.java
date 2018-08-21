package com.horis.foodorderplatform.restaurantservice.service.implement;

import com.horis.foodorderplatform.restaurantservice.domain.Menu;
import com.horis.foodorderplatform.restaurantservice.repository.MenuRepository;
import com.horis.foodorderplatform.restaurantservice.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImplement implements MenuService {
    private MenuRepository menuItemRepository;

    @Autowired
    public MenuServiceImplement(MenuRepository menuItemRepository) {
        this.menuItemRepository = menuItemRepository;
    }

    @Override
    public List<Menu> findAllByRestaurantId(String rid) {
        return menuItemRepository.findAllByRestaurantId(rid);
    }

    @Override
    public void createMenuItem(Menu menuItem) {
        menuItemRepository.save(menuItem);
    }

    @Override
    public void uploadMenuItems(List<Menu> menuItems) {
        menuItemRepository.save(menuItems);
    }


}
