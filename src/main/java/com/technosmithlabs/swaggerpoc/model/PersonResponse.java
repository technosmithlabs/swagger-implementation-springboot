package com.technosmithlabs.swaggerpoc.model;

import lombok.*;

/**
 * This class is model class for Person Web Service response.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PersonResponse {
    private String fullName;
    private String personClassification;
}
