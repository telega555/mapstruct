package com.example.demo.controller;

import com.example.demo.dto.TargetDTO;
import com.example.demo.entity.SourceEntity;
import com.example.demo.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {
    private final MyService myService;

    @Autowired
    public MyController(MyService myService) {
        this.myService = myService;
    }

    @GetMapping("/map")
    public TargetDTO mapEntities() {
        SourceEntity source = new SourceEntity();
        source.setName("John");
        source.setAge(30);

        return myService.mapSourceToTarget(source);
    }
}
