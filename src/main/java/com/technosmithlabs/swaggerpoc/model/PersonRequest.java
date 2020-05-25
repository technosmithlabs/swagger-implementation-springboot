package com.technosmithlabs.swaggerpoc.model;

import lombok.*;

/**
 * This class is model class for Person Web Service request.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PersonRequest {
    private String fullName;
    private String dateOfBirth;
}
