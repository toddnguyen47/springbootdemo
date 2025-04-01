package com.example.springbootdemo;

import com.example.springbootdemo.components.HelloComponent;
import com.example.springbootdemo.models.ResultRecord;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final HelloComponent helloComponent;

    public HelloController(HelloComponent helloComponent) {
        this.helloComponent = helloComponent;
    }

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/calc")
    public ResultRecord calc(@RequestParam int input) {
        var result = helloComponent.addConfiguredValue(input);
        var resultRecord = new ResultRecord(result);
        return resultRecord;
    }
}
