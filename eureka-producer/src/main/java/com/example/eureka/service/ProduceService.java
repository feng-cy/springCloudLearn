package com.example.eureka.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("produceService")
public interface ProduceService {
    @GetMapping("getPort")
    String getPort();
}
