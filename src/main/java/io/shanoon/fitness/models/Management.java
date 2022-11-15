package io.shanoon.fitness.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity(name = "Managements")
public class Management {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Status status;
}
