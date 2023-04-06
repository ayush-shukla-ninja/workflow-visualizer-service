package com.ninjacart.workflowvisualizerservice.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ninjacart.workflowvisualizerservice.Service.ServiceConfigService;
import com.ninjacart.workflowvisualizerservice.models.ServiceConfig;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/sfind")
@Slf4j
public class ServiceConfigController {
    @Autowired
    private ServiceConfigService serviceConfigService;

    @GetMapping(path = "/{name}")
    public List<ServiceConfig> readQueryUsingName(@PathVariable("name") String name) {
        log.info(name);
        return serviceConfigService.getServiceConfigByName(name);
    }
}
