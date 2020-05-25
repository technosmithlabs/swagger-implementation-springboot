package com.technosmithlabs.swaggerpoc.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

/**
 * This class is model class for Person Web Service request.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@ApiModel
public class PersonRequest {
    @ApiModelProperty(notes = "full name of the person")
    private String fullName;
    @ApiModelProperty(notes = "date of birth of person in format MM-DD-YYYY, eg:02-02-1990")
    private String dateOfBirth;
}
