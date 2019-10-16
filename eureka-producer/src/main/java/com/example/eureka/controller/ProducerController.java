package com.example.eureka.controller;

import com.example.eureka.service.ProduceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/producer")
@RestController
public class ProducerController {
    Logger logger = LoggerFactory.getLogger(getClass());
    @Value("${server.port}")
    String port;

    @Autowired
    private ProduceService produceService;

    @GetMapping("/getPort")
    public String getPort()
    {
        logger.warn("controller:" + port);
        return produceService.getPort();
    }

}
