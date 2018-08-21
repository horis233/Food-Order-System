package com.horis.foodorderplatform.restaurantservice.repository;

import com.horis.foodorderplatform.restaurantservice.domain.Menu;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.Description;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "menu")

public interface MenuRepository extends PagingAndSortingRepository<Menu, String>{

    @RestResource(rel = "by-rid", description = @Description("Get all menu items by restaurant id"))
    List<Menu> findAllByRestaurantId(String rid);

    @RestResource(rel = "by-name", description = @Description("Get menu item by item name"))
    Menu findByName(@Param("name") String name);
}
