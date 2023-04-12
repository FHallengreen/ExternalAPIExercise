package com.example.externalapiexercise.api;

import com.example.externalapiexercise.dto.CombinedResponse;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    RemoteApiTester remoteApiTester;

    public DemoController(RemoteApiTester remoteApiTester) {
        this.remoteApiTester = remoteApiTester;
    }

    private final int SLEEP_TIME = 1000*3;

    @GetMapping("/name/{name}")
    public CombinedResponse getName(@PathVariable String name){
        return remoteApiTester.fetchNameDetails(name).block();
    }

    @GetMapping(value = "/random-string-slow")
    public String slowEndpoint() throws InterruptedException {
        Thread.sleep(SLEEP_TIME);
        return RandomStringUtils.randomAlphanumeric(10);
    }

}
