package com.example.bulkResourceManagement.model;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Tmf639Resource {
    private String id;
    private String href;
    private String name;
    private Place place;
    private List<ResourceCharacteristic> resourceCharacteristic;
    private String type;

    public Tmf639Resource(String id, String href, String name, Place place, List<ResourceCharacteristic> resourceCharacteristic, String type) {
        this.id = id;
        this.href = href;
        this.name = name;
        this.place = place;
        this.resourceCharacteristic = resourceCharacteristic;
        this.type = type;
    }

    public Tmf639Resource(){};

    public static class Place {
        private String id;
        private String href;
        private String referredType;

        public Place(){};

        public Place(String id, String href, String referredType) {
            this.id = id;
            this.href = href;
            this.referredType = referredType;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

        public String getReferredType() {
            return referredType;
        }

        public void setReferredType(String referredType) {
            this.referredType = referredType;
        }
    }

    public static class ResourceCharacteristic {
        private String name;
        private String valueType;
        private String value;

        public ResourceCharacteristic(){};
        public ResourceCharacteristic(String name, String valueType, String value) {
            this.name = name;
            this.valueType = valueType;
            this.value = value;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getValueType() {
            return valueType;
        }

        public void setValueType(String valueType) {
            this.valueType = valueType;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public List<ResourceCharacteristic> getResourceCharacteristic() {
        return resourceCharacteristic;
    }

    public void setResourceCharacteristic(List<ResourceCharacteristic> resourceCharacteristic) {
        this.resourceCharacteristic = resourceCharacteristic;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

