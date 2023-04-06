package com.ninjacart.workflowvisualizerservice.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ConfigGuid implements Serializable {
  @EqualsAndHashCode.Exclude
  private String id;
  private String name;
  private Integer version;
}
