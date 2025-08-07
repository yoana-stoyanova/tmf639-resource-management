package com.example.bulkResourceManagement.resourceConverter;

import com.example.bulkResourceManagement.factory.Tmf639ResourceFactory;
import com.example.bulkResourceManagement.model.ResourceObject;
import com.example.bulkResourceManagement.model.Tmf639Resource;
import org.springframework.stereotype.Component;

@Component
public class ObjectToTmf369Resource {
    private final Tmf639ResourceFactory factory;

    public ObjectToTmf369Resource(Tmf639ResourceFactory factory){
        this.factory = factory;
    }

    public Tmf639Resource convert(ResourceObject obj){
        String dummyUrl = "/dummy/url/locations";

        Tmf639Resource resource = factory.createResource();

        resource.setId(Long.toString(obj.getId()));
        resource.setHref("/api/sn_ni_core/resource/" + obj.getType());
        resource.setName(obj.getName());
        resource.setType(obj.getType());
        resource.setResourceCharacteristic(factory.setResourceCharacteristics(obj));

        return resource;
    }
}
