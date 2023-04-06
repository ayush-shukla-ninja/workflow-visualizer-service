package com.ninjacart.workflowvisualizerservice.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ninjacart.workflowvisualizerservice.Persistence.ServiceConfigDao;
import com.ninjacart.workflowvisualizerservice.models.ServiceConfig;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ServiceConfigService {
    @Autowired
    private ServiceConfigDao serviceConfigDao;

    public List<ServiceConfig> getServiceConfigByName(String name){
        log.info(name);
        return serviceConfigDao.getServiceConfigByName(name);
    }
}
