package com.ninjacart.workflowvisualizerservice.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class RuleExecutionConfig extends ConfigGuid {
  private String executionMode;
  private RuleConfig ruleExecutionConfigDefinition;
}
