package com.horis.foodorderplatform.restaurantservice.repository;

import com.horis.foodorderplatform.restaurantservice.domain.Restaurant;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.Description;
import org.springframework.data.rest.core.annotation.RestResource;

public interface RestaurantRepository extends PagingAndSortingRepository<Restaurant, String> {
    @RestResource(rel = "by-name", description = @Description("Find by name"))
    Restaurant findFirstByName(@Param("name") String name);
}
