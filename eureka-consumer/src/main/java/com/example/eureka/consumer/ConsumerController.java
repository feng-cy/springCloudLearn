package com.example.eureka.consumer;

import com.example.eureka.service.ProduceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("consumer")
public class ConsumerController {

    @Autowired
    private ProduceService produceService;
    @GetMapping("/getPort")
    public String getPort()
    {
        return produceService.getPort();
    }

}
