package com.example.demo.service;

import com.example.demo.dto.TargetDTO;
import com.example.demo.entity.SourceEntity;
import com.example.demo.mappers.MyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {
    private final MyMapper myMapper;

    @Autowired
    public MyService(MyMapper myMapper) {
        this.myMapper = myMapper;
    }

    public TargetDTO mapSourceToTarget(SourceEntity source) {
        return myMapper.sourceToTarget(source);
    }
}
