package com.fooddeliveryapp.storefront.functionalProgramming;

import com.fooddeliveryapp.storefront.models.Food;
import com.fooddeliveryapp.storefront.models.Order;
import com.fooddeliveryapp.storefront.models.OrderState;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NavinFunctions {

        //  QUERY 1
        //  Get all orders with order state not delivered and order state not rejected.
        public static Function<List<Order>, List<Order>> getOrderStatus = (orders) ->  orders.stream()
                .filter(o -> o.getOrderState()!= OrderState.DELIVERED && o.getOrderState()!=OrderState.REJECTED)
                .collect(Collectors.toList());

        //  QUERY 2
        //  Get all foods that have price below $xyz and from the restaurant that have a rating above 4.
        public static Function<List<Food>, List<Food>> getFoodStatus = foods -> foods.stream()
                .filter(f -> f.getPrice()<=10 && f.getRating()>=4).collect(Collectors.toList());


        //  QUERY 3
        //  Get all users who are in xyz place and ordered food more than x times and all food prices are more than $10.

}
