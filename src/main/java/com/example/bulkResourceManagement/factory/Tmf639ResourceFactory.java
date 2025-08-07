package com.example.bulkResourceManagement.factory;

import com.example.bulkResourceManagement.model.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class Tmf639ResourceFactory {

    public Tmf639Resource createResource() {
        return new Tmf639Resource();
    }

    public Tmf639Resource.Place createPlace(ResourceObject obj) {
        Tmf639Resource.Place place = new Tmf639Resource.Place();
        place.setHref("/api/now/table/cmdb_ci_ni_site/place");
        place.setReferredType("GeographicAddress");
        return place;
    }

    public List<Tmf639Resource.ResourceCharacteristic> setResourceCharacteristics(ResourceObject obj) {
        List<Tmf639Resource.ResourceCharacteristic> list = new ArrayList<>();

        Map<String, String> map = obj.getProperties();
        if (map == null) {
            return list;
        }

        for (Map.Entry<String, String> entry : map.entrySet()) {
            String name = entry.getKey();
            Object value = entry.getValue();

            Tmf639Resource.ResourceCharacteristic rc = new Tmf639Resource.ResourceCharacteristic();
            rc.setName(name);
            rc.setValue(value != null ? value.toString() : null);
            rc.setValueType(rc.getValue());

            list.add(rc);
        }

        return list;
    }

    private Tmf639Resource.ResourceCharacteristic createCharacteristic(String name, String valueType, String value) {
        Tmf639Resource.ResourceCharacteristic rc = new Tmf639Resource.ResourceCharacteristic();
        rc.setName(name);
        rc.setValueType(valueType);
        rc.setValue(value);
        return rc;
    }
}

