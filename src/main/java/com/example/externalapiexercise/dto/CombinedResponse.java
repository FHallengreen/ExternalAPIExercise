package com.example.externalapiexercise.dto;

import com.example.externalapiexercise.entity.Age;
import com.example.externalapiexercise.entity.Gender;
import com.example.externalapiexercise.entity.Nationality;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CombinedResponse {
    String name;
    String gender;
    double genderProbability;
    int age;
    int ageCount;
    String country;
    double countryProbability;

    public CombinedResponse(Gender g, Age a, Nationality n) {
        name = g.getName();
        gender = g.getGender();
        genderProbability = g.getProbability();
        age = a.getAge();
        ageCount = a.getCount();
        country = n.getCountry().get(0).getCountry_id();
        countryProbability = n.getCountry().get(0).getProbability();
    }

    @Override
    public String toString() {
        return "CombinedResponse{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", genderProbability=" + genderProbability +
                ", age=" + age +
                ", ageCount=" + ageCount +
                ", country='" + country + '\'' +
                ", countryProbability=" + countryProbability +
                '}';
    }
}
