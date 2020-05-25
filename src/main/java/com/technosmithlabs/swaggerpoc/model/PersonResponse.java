package com.technosmithlabs.swaggerpoc.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

/**
 * This class is model class for Person Web Service response.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@ApiModel
public class PersonResponse {
    @ApiModelProperty(notes = "full name of the person")
    private String fullName;
    @ApiModelProperty(notes = "person's classification based on age")
    private String personClassification;
}
