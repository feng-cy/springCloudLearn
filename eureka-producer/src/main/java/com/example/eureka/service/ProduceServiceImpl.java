package com.example.eureka.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ProduceServiceImpl implements ProduceService{

    Logger logger = LoggerFactory.getLogger(getClass());
    @Value("${server.port}")
    String port;
    public String getPort()
    {
        logger.info("port:" + port);
        return port;
    }
}
