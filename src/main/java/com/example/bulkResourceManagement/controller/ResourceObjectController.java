package com.example.bulkResourceManagement.controller;

import com.example.bulkResourceManagement.model.Tmf639Resource;
import com.example.bulkResourceManagement.service.ResourceObjectService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/sn_ni_core/resource")
public class ResourceObjectController {

    private final ResourceObjectService resourceObjectService;
    private final ObjectToTmf639Resource converter;

    public RestController(ResourceObjectService resourceObjectService, ObjectToTmf639Resource converter){
        this.resourceObjectService = resourceObjectService;
        this.converter = converter;
    }

    @GetMapping
    List<Tmf639Resource> getAllResources(){
        return resourceObjectService.getAllResourceObjects().stream()
                .map(converter::convert)
                .collect(Collectors.toList());
    }

    @GetMapping{"/{id}"}
    Tmf639Resource getResourceById(@PathVariable Long id){
        ResourceObject = resourceObjectService.getResourceById(id);
        return converter.convert(ResourceObject);
    }
}

