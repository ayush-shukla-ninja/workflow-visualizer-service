package com.ninjacart.workflowvisualizerservice.models;

import java.util.Date;

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
public class BaseConfig extends ConfigGuid {
    private String status;

  private Boolean active;

  private Date createdAt;

  private Date updatedAt;

  private Integer createdBy;

  private Integer updatedBy;

  private String realmId;

  private String nameVersion;
}
