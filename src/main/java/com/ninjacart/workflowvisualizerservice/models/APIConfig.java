package com.ninjacart.workflowvisualizerservice.models;

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
public class APIConfig extends BaseConfig {
    private String apiReferenceId;
    private APIConfigReference apiConfigReference;
}
