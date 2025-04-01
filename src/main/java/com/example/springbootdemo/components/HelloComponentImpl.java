package com.example.springbootdemo.components;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class HelloComponentImpl implements HelloComponent {

    private final int configuredValue;

    public HelloComponentImpl(
            @Value("${configured.value}") int configuredValue) {
        this.configuredValue = configuredValue;
    }

    @Override
    public int addConfiguredValue(final int input) {
        return configuredValue + input;
    }
}
