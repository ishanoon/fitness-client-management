package io.shanoon.fitness.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

@Entity(name = "Customers")
public class Customer {
    @Id @GeneratedValue(strategy = GenerationType.AUTO) private Long id;
    private String name;
    private Gender gender;
    private LocalDateTime registrationDate;
    private Boolean renewable;
    private Integer cashPayable;

    public Customer(String name, Gender gender, Boolean renewable) {
        this.name = name;
        this.gender = gender;
        this.registrationDate = LocalDateTime.now();
        this.renewable = renewable;
        this.cashPayable = payment();
    }

    private Integer payment(){
        switch (gender){
            case MALE -> cashPayable = renewable ? 130 : 170;
            case FEMALE -> cashPayable = renewable ? 100 : 150;
        }
        return cashPayable;
    }

}
