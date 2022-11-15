package io.shanoon.fitness.models;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    Customer shanoon = new Customer("Shanoon", Gender.MALE,false);
    Customer issaka = new Customer("Issaka", Gender.FEMALE,true);


    @Test
    void payment() {
        assertEquals(170, shanoon.getCashPayable());
        assertEquals(100, issaka.getCashPayable());
    }
}