package com.example.externalapiexercise.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Country {
    private String country_id;
    private double probability;

    @Override
    public String toString() {
        return "Country{" +
                "country_id='" + country_id + '\'' +
                ", probability=" + probability +
                '}';
    }
}
