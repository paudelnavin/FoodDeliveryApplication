package com.fooddeliveryapp.storefront.functionalProgramming;

import com.fooddeliveryapp.storefront.models.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class NavinFunctionsTest {

    public List<User> restaurants, customers, drivers;
    public List<Food> foods;
    public List<Order> allOrders;

    @BeforeEach
    public void setUp() {
        // Restaurants
        User restaurant1 = new User("restaurant1", "sham.sher", "user1", "Shamsher", "Rana", "example@example.com", "9999999999", "Fairfield", UserRole.RESTAURANT, 5);
        User restaurant2 = new User("restaurant2", "navin.paudel", "user2", "Navin", "Paudel", "example@example.com", "9999999999", "Des Moines", UserRole.RESTAURANT, 4);
        User restaurant3 = new User("restaurant3", "navin.paudel", "user2", "Navin", "Paudel", "example@example.com", "9999999999", "New York", UserRole.RESTAURANT, 3);
        User restaurant4 = new User("restaurant4", "navin.paudel", "user2", "Navin", "Paudel", "example@example.com", "9999999999", "Chicago", UserRole.RESTAURANT, 2);
        User restaurant5 = new User("restaurant5", "navin.paudel", "user2", "Navin", "Paudel", "example@example.com", "9999999999", "Fairfield", UserRole.RESTAURANT, 1);
        User restaurant6 = new User("restaurant6", "navin.paudel", "user2", "Navin", "Paudel", "example@example.com", "9999999999", "Iowa", UserRole.RESTAURANT, 4);
        User restaurant7 = new User("restaurant7", "navin.paudel", "user2", "Navin", "Paudel", "example@example.com", "9999999999", "Fairfield", UserRole.RESTAURANT, 5);
        User restaurant8 = new User("restaurant8", "navin.paudel", "user2", "Navin", "Paudel", "example@example.com", "9999999999", "Des Moines", UserRole.RESTAURANT, 4);
        User restaurant9 = new User("restaurant9", "navin.paudel", "user2", "Navin", "Paudel", "example@example.com", "9999999999", "Las Vega", UserRole.RESTAURANT, 1);
        User restaurant10 = new User("restaurant10", "navin.paudel", "user2", "Navin", "Paudel", "example@example.com", "9999999999", "California", UserRole.RESTAURANT, 2);
        restaurants = Arrays.asList(restaurant1, restaurant2, restaurant3,restaurant4,restaurant5,restaurant6,restaurant7,restaurant8,restaurant9,restaurant10 );

        //Customers
        User customer1 = new User("customer1", "sham.sher", "customer1", "Shamsher", "Rana", "example@example.com", "9999999999", "Fairfield", UserRole.CUSTOMER, 5);
        User customer2 = new User("customer2", "navin.paudel", "customer2", "Navin", "Paudel", "example@example.com", "9999999999", "Des Moines", UserRole.CUSTOMER, 4);
        User customer3 = new User("customer3", "navin.paudel", "customer3", "Navin", "Paudel", "example@example.com", "9999999999", "Fairfield", UserRole.CUSTOMER, 3);
        User customer4 = new User("customer4", "navin.paudel", "customer4", "Navin", "Paudel", "example@example.com", "9999999999", "Chicago", UserRole.CUSTOMER, 1);
        User customer5 = new User("customer5", "navin.paudel", "customer5", "Navin", "Paudel", "example@example.com", "9999999999", "Fairfield", UserRole.CUSTOMER, 1);
        User customer6 = new User("customer6", "navin.paudel", "customer6", "Navin", "Paudel", "example@example.com", "9999999999", "Iowa", UserRole.CUSTOMER, 2);
        User customer7 = new User("customer7", "navin.paudel", "customer7", "Navin", "Paudel", "example@example.com", "9999999999", "Fairfield", UserRole.CUSTOMER, 3);
        User customer8 = new User("customer8", "navin.paudel", "customer8", "Navin", "Paudel", "example@example.com", "9999999999", "Des Moines", UserRole.CUSTOMER, 2);
        User customer9 = new User("customer9", "navin.paudel", "customer9", "Navin", "Paudel", "example@example.com", "9999999999", "Fairfield", UserRole.CUSTOMER, 4);
        User customer10 = new User("customer10", "navin.paudel", "customer10", "Navin", "Paudel", "example@example.com", "9999999999", "Fairfield", UserRole.CUSTOMER, 4);
        customers = Arrays.asList(customer1, customer2, customer3,customer4,customer5,customer6,customer7,customer8,customer9,customer10);

        //Drivers
        User driver1 = new User("driver1", "sham.sher", "user1", "Shamsher", "Rana", "example@example.com", "9999999999", "Fairfield", UserRole.DRIVER, 5);
        User driver2 = new User("driver2", "navin.paudel", "user2", "Navin", "Paudel", "example@example.com", "9999999999", "Des Moines", UserRole.DRIVER, 3);
        User driver3 = new User("driver3", "navin.paudel", "user2", "Navin", "Paudel", "example@example.com", "9999999999", "Des Moines", UserRole.DRIVER, 1);
        User driver4 = new User("driver4", "navin.paudel", "user2", "Navin", "Paudel", "example@example.com", "9999999999", "Des Moines", UserRole.DRIVER, 3);
        User driver5 = new User("driver5", "navin.paudel", "user2", "Navin", "Paudel", "example@example.com", "9999999999", "Des Moines", UserRole.DRIVER, 4);
        User driver6 = new User("driver6", "navin.paudel", "user2", "Navin", "Paudel", "example@example.com", "9999999999", "Des Moines", UserRole.DRIVER, 5);
        User driver7 = new User("driver7", "navin.paudel", "user2", "Navin", "Paudel", "example@example.com", "9999999999", "Des Moines", UserRole.DRIVER, 2);
        User driver8 = new User("driver8", "navin.paudel", "user2", "Navin", "Paudel", "example@example.com", "9999999999", "Des Moines", UserRole.DRIVER, 1);
        User driver9 = new User("driver9", "navin.paudel", "user2", "Navin", "Paudel", "example@example.com", "9999999999", "Des Moines", UserRole.DRIVER, 5);
        User driver10 = new User("driver10", "navin.paudel", "user2", "Navin", "Paudel", "example@example.com", "9999999999", "Des Moines", UserRole.RESTAURANT, 3);
        drivers = Arrays.asList(driver1, driver2, driver3, driver4, driver5, driver6, driver7, driver8, driver8, driver9, driver10);

        // Order Entity
        OrderEntity orderEntity1 = new OrderEntity("food1", 5);

        // Order
        Order order1 = new Order("order1", "customer1", "restaurant1", Arrays.asList(orderEntity1), "driver1", OrderState.DELIVERED, "driver1", 20.0);
        Order order2 = new Order("order2", "customer2", "restaurant2", Arrays.asList(orderEntity1), "driver1", OrderState.PENDING, "driver1", 20.0);
        Order order3 = new Order("order3", "customer3", "restaurant3", Arrays.asList(orderEntity1), "driver2", OrderState.DELIVERED, "driver1", 20.0);
        Order order4 = new Order("order4", "customer4", "restaurant4", Arrays.asList(orderEntity1), "driver2", OrderState.ACCEPTED, "driver1", 20.0);
        Order order5 = new Order("order5", "customer5", "restaurant5", Arrays.asList(orderEntity1), "driver3", OrderState.DELIVERED, "driver1", 20.0);
        Order order6 = new Order("order6", "customer6", "restaurant6", Arrays.asList(orderEntity1), "driver4", OrderState.PICKEDUP, "driver1", 20.0);
        Order order7 = new Order("order7", "customer7", "restaurant7", Arrays.asList(orderEntity1), "driver5", OrderState.DELIVERED, "driver1", 20.0);
        Order order8 = new Order("order8", "customer8", "restaurant8", Arrays.asList(orderEntity1), "driver5", OrderState.REJECTED, "driver1", 20.0);
        Order order9 = new Order("order9", "customer9", "restaurant9", Arrays.asList(orderEntity1), "driver5", OrderState.DELIVERED, "driver1", 20.0);
        Order order10 = new Order("order10", "customer10", "restaurant10", Arrays.asList(orderEntity1), "driver5", OrderState.DELIVERED, "driver1", 20.0);
        Order order11 = new Order("order11", "customer1", "restaurant1", Arrays.asList(orderEntity1), "driver5", OrderState.DELIVERED, "driver1", 20.0);
        Order order12 = new Order("order12", "customer1", "restaurant1", Arrays.asList(orderEntity1), "driver5", OrderState.DELIVERED, "driver1", 20.0);
        Order order13 = new Order("order13", "customer1", "restaurant1", Arrays.asList(orderEntity1), "driver5", OrderState.DELIVERED, "driver1", 20.0);
        Order order14 = new Order("order14", "customer3", "restaurant1", Arrays.asList(orderEntity1), "driver5", OrderState.DELIVERED, "driver1", 20.0);
        Order order15 = new Order("order15", "customer3", "restaurant2", Arrays.asList(orderEntity1), "driver5", OrderState.DELIVERED, "driver1", 20.0);
        Order order16 = new Order("order16", "customer5", "restaurant2", Arrays.asList(orderEntity1), "driver5", OrderState.DELIVERED, "driver1", 20.0);
        Order order17 = new Order("order17", "customer5", "restaurant2", Arrays.asList(orderEntity1), "driver5", OrderState.DELIVERED, "driver1", 20.0);
        Order order18 = new Order("order18", "customer5", "restaurant2", Arrays.asList(orderEntity1), "driver5", OrderState.DELIVERED, "driver1", 20.0);
        Order order19 = new Order("order19", "customer7", "restaurant3", Arrays.asList(orderEntity1), "driver5", OrderState.DELIVERED, "driver1", 20.0);
        Order order20 = new Order("order20", "customer7", "restaurant4", Arrays.asList(orderEntity1), "driver5", OrderState.DELIVERED, "driver1", 20.0);
        Order order21 = new Order("order21", "customer7", "restaurant5", Arrays.asList(orderEntity1), "driver5", OrderState.DELIVERED, "driver1", 20.0);
        Order order22 = new Order("order22", "customer9", "restaurant6", Arrays.asList(orderEntity1), "driver5", OrderState.DELIVERED, "driver1", 20.0);

        allOrders = Arrays.asList(order1, order2, order3, order4, order5, order6, order7, order8);

        // Food
        Food food1 = new Food("food1", "Pizza", 15.3, "Italian Food", "https://images.app.goo.gl/vebgTeEk7Y4Dj2Lg7", "restaurant10", 4, LocalDate.now());
        Food food2 = new Food("food2", "MoMo", 8.2, "Nepali Food", "https://images.app.goo.gl/vxwvS2qsvcKwXueU8", "restaurant1", 5, LocalDate.now());
        Food food3 = new Food("food3", "MoMo", 10.1, "Nepali Food", "https://images.app.goo.gl/vxwvS2qsvcKwXueU8", "restaurant9", 4, LocalDate.now());
        Food food4 = new Food("food4", "MoMo", 9.5, "Nepali Food", "https://images.app.goo.gl/vxwvS2qsvcKwXueU8", "restaurant1", 4, LocalDate.now());
        Food food5 = new Food("food5", "MoMo", 12.3, "Nepali Food", "https://images.app.goo.gl/vxwvS2qsvcKwXueU8", "restaurant8", 5, LocalDate.now());
        Food food6 = new Food("food6", "MoMo", 2.7, "Nepali Food", "https://images.app.goo.gl/vxwvS2qsvcKwXueU8", "restaurant1", 2, LocalDate.now());
        Food food7 = new Food("food7", "MoMo", 1.8, "Nepali Food", "https://images.app.goo.gl/vxwvS2qsvcKwXueU8", "restaurant2", 1, LocalDate.now());
        Food food8 = new Food("food8", "MoMo", 0.5, "Nepali Food", "https://images.app.goo.gl/vxwvS2qsvcKwXueU8", "restaurant1", 4, LocalDate.now());
        Food food9 = new Food("food9", "MoMo", 19.25, "Nepali Food", "https://images.app.goo.gl/vxwvS2qsvcKwXueU8", "restaurant7", 3, LocalDate.now());
        Food food10 = new Food("food10", "MoMo", 1.25, "Nepali Food", "https://images.app.goo.gl/vxwvS2qsvcKwXueU8", "restaurant2", 4, LocalDate.now());
        foods = Arrays.asList(food1, food2, food3,food4,food5,food6,food7,food8,food9,food10);
    }

    @Test
    public void getOrderStatusTest1(){
        List<Order> result = NavinFunctions.getOrderStatus.apply(allOrders);
        assertEquals(3, result.size());
    }

    @Test
    public void getFoodStatusTest1(){
        List<Food> result = NavinFunctions.getFoodStatus.apply(foods);
        assertEquals(4, result.size());
    }
}