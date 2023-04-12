package com.example.externalapiexercise.api;

import com.example.externalapiexercise.dto.CombinedResponse;
import com.example.externalapiexercise.repository.CombinedResponseRepository;
import com.example.externalapiexercise.service.CombinedResponseService;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class DemoController {

    RemoteApiTester remoteApiTester;
    CombinedResponseRepository combinedResponseRepository;

    public DemoController(RemoteApiTester remoteApiTester,
                          CombinedResponseRepository combinedResponseRepository) {
        this.remoteApiTester = remoteApiTester;
        this.combinedResponseRepository = combinedResponseRepository;
    }

    private final int SLEEP_TIME = 1000*3;


    @GetMapping("/name/{name}")
    public CombinedResponse getName(@PathVariable String name){
        Optional<CombinedResponse>  response = combinedResponseRepository.findById(name);
        if (response.isPresent()){
            System.out.println(name + " already exists was called");
            return response.get();
        }
        else {
            System.out.println(name + " does not already exist was called");

            return remoteApiTester.fetchNameDetails(name).block();
        }

    }

    @GetMapping(value = "/random-string-slow")
    public String slowEndpoint() throws InterruptedException {
        Thread.sleep(SLEEP_TIME);
        return RandomStringUtils.randomAlphanumeric(10);
    }

}
