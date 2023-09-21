package com.example.demo.mappers;

import com.example.demo.entity.SourceEntity;
import com.example.demo.dto.TargetDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface MyMapper {
    @Mapping(source = "name", target = "fullName")
    @Mapping(source = "age", target = "yearsOld")
    TargetDTO sourceToTarget(SourceEntity source);

}

