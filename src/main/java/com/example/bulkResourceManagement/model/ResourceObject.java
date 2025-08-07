package com.example.bulkResourceManagement.model;

import jakarta.persistence.*;

import java.util.HashMap;
import java.util.Map;

@Entity
@Table(name = "resources")
public class ResourceObject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String pattern;
    private String location;
    private String type;

    @ManyToOne
    @JoinColumn
    private ResourceObject parent;

    @Transient
    private Map<String, String> properties = new HashMap<>();

    public ResourceObject(){};
    public ResourceObject(Long id, String name, String pattern, String location, ResourceObject parent, Map<String, String> properties) {
        this.id = id;
        this.name = name;
        this.pattern = pattern;
        this.location = location;
        this.parent = parent;
        this.properties = properties;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ResourceObject getParent() {
        return parent;
    }

    public void setParent(ResourceObject parent) {
        this.parent = parent;
    }

    public Map<String, String> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, String> properties) {
        this.properties = properties;
    }

}
