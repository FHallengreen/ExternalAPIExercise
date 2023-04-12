package com.example.externalapiexercise.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Age {
    int age;
    int count;

    @Override
    public String toString() {
        return "Age{" +
                "age=" + age +
                ", count=" + count +
                '}';
    }
}
