package com.example.externalapiexercise.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
public class Nationality {

    private List<Country> country;
    private String name;

    @Override
    public String toString() {
        return "Nationality{" +
                "country=" + country +
                ", name='" + name + '\'' +
                '}';
    }
}
