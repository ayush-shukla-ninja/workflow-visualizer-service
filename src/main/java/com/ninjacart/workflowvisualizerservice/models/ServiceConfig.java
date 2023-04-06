package com.ninjacart.workflowvisualizerservice.models;

import java.util.List;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "serviceConfig")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ServiceConfig extends BaseConfig {
  private List<APIComponent> apiComponentList;
  private ResponseDefinition responseDefinition;
}
