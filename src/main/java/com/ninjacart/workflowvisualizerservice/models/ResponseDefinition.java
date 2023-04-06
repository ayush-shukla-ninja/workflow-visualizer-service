package com.ninjacart.workflowvisualizerservice.models;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseDefinition implements Serializable {
    private Map<String, Object> responseMapping;

  private ConfigGuid ruleConfigIdentifier;
  private RuleConfig ruleConfigIdentifierDefinition;

  private List<RuleExecutionConfig> ruleConfigs;

  private Map<String, Object> runtimeConfig;

  private ConfigGuid responseModel;
}
