package com.example.springbootdemo.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public record ResultRecord(@JsonProperty("result") int res) {}
