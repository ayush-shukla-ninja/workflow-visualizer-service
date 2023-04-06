package com.ninjacart.workflowvisualizerservice.Persistence;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.ninjacart.workflowvisualizerservice.models.ServiceConfig;


public interface ServiceConfigRepository extends MongoRepository<ServiceConfig,String> {
    @Query("{name : ?0}")                                        
    ServiceConfig getServiceConfigByName(String name);

    List<ServiceConfig> findByName(String name);
}
