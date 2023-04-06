package com.ninjacart.workflowvisualizerservice.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class APIComponent extends ConfigGuid {

  private APIConfig apiConfigDefinition;
  private RequestMapping mappings;
  private ConfigGuid ruleConfigIdentifier;
  private RuleConfig ruleConfigIdentifierDefinition;
  private List<RuleExecutionConfig> ruleConfigExecution;
}
