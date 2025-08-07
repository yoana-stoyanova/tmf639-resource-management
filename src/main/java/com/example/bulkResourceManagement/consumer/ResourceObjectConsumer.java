package com.example.bulkResourceManagement.consumer;

import com.example.bulkResourceManagement.model.ResourceObject;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.util.List;

@Component
public class ResourceObjectConsumer {
    private ResourceObjectService resourceObjectService;
    private final RestTemplate restTemplate;
    
    private String xmlPathname = "src/main/resources/XMLSnapshot.xml";
    
    @Value("${b.unit.in.app.properties}")
    private String bUnitUrl;

    @Value("${r.unit.in.app.properties}")
    private String rUnitUrl;

    public ResourceObjectConsumer(ResourceObjectService resourceObjectService, RestTemplate restTemplate){
        this.resourceObjectService = resourceObjectService;
        this.restTemplate = restTemplate;
    }

    @PostConstruct
    public void fetchFromExternal(){
        //fetch from link
    }

    @PostConstruct
    public void importStationsIntoTable() throws ParserConfigurationException, IndexOutOfBoundsException, SAXException {
        List<ResourceObject> objList = resourceObjectService.XmlToJavaObject(this.xmlPathname);

        resourceObjectService.importStations(objList);
    }

}
