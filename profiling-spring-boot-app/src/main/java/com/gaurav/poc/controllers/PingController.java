package com.gaurav.poc.controllers;

import com.gaurav.poc.Main;
import com.gaurav.poc.beans.GauravCustomClass;
import com.gaurav.poc.services.PingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
public class PingController {

    private List<GauravCustomClass> list = new ArrayList<>();

    @Autowired
    private PingService pingService;

    @GetMapping("/sleep")
    public String sleep() {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        pingService.ping();
        return Thread.currentThread().getName();
    }

    @GetMapping("/run")
    public String run() {

        long l = System.currentTimeMillis();
        long l1 = System.currentTimeMillis() + 1000;
        while (System.currentTimeMillis() < l1) {
        }

        pingService.ping();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Thread.currentThread().getName();
    }

    @GetMapping("/wait")
    public String waitSample() {
        try {
            Integer take = Main.quu.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        pingService.ping();
        return Thread.currentThread().getName();
    }

    @GetMapping("/add")
    public String addInQueue() {
        Main.quu.add(19);
        return Thread.currentThread().getName();
    }
}
