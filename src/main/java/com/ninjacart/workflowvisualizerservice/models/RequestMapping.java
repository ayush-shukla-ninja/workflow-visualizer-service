package com.ninjacart.workflowvisualizerservice.models;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class RequestMapping {
  private Map<String, Object> requestBodyMapping;
  private Map<String, Object> pathParamMapping;
  private Map<String, Object> queryParamMapping;
  private Map<String, Object> headerMapping;
  private Map<String, Object> additionalMapping;
  private Map<String, Object> errorResponseMapping;
}
