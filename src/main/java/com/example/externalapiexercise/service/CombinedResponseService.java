package com.example.externalapiexercise.service;

import com.example.externalapiexercise.dto.CombinedResponse;
import com.example.externalapiexercise.entity.Age;
import com.example.externalapiexercise.entity.Gender;
import com.example.externalapiexercise.entity.Nationality;
import com.example.externalapiexercise.repository.CombinedResponseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CombinedResponseService {

    @Autowired
    private CombinedResponseRepository combinedResponseRepository;

    public void saveCombinedResponse(Gender g, Age a, Nationality n){
        CombinedResponse response = new CombinedResponse(g,a,n);
        combinedResponseRepository.save(response);
    }
}
