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
        //check if marshaller is faster than manually getting the attributes
    };

    public List<ResourceObject> getAllResources(){
        return resourceObjectRepository.findAll()
    }

    public ResourceObject getResourceById(Long id){
        return resourceObjectRepository.findById(id);
    }
}

