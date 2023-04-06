package com.ninjacart.workflowvisualizerservice.Persistence;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ninjacart.workflowvisualizerservice.models.ServiceConfig;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class ServiceConfigDao {
    @Autowired
    private ServiceConfigRepository serviceConfigRepository;

    public List<ServiceConfig> getServiceConfigByName(String name){
        log.info(name);
        return serviceConfigRepository.findByName(name);
    }
}
