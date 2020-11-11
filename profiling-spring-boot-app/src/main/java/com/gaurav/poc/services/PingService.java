package com.gaurav.poc.services;

import org.springframework.stereotype.Service;

@Service
public class PingService {

    public void ping(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
