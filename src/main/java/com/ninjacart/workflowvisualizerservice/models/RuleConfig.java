package com.ninjacart.workflowvisualizerservice.models;

import java.util.Collection;

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
public class RuleConfig extends BaseConfig{
  private String executionMode;
  private String evaluationMode;
  private Collection<Expression> expressions;
}
