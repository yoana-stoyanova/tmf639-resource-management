package com.example.bulkResourceManagement.service;

import com.example.bulkResourceManagement.model.ResourceObject;
import com.example.bulkResourceManagement.repository.ResourceObjectRepository;

import java.util.List;

public class ResourceObjectService {
    public ResourceObjectRepository resourceObjectRepository;

    public ResourceObjectService(ResourceObjectRepository resourceObjectRepository){
        resourceObjectRepository = resourceObjectRepository;
    }

    public List<ResourceObject> XmlToJavaObject(String filepath){
    };
}
