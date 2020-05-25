package com.technosmithlabs.swaggerpoc.service;

import com.technosmithlabs.swaggerpoc.model.PersonRequest;
import com.technosmithlabs.swaggerpoc.model.PersonResponse;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

@Service
public class RestServiceImpl implements RestService {

    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("MM-d-yyyy");

    @Override
    public PersonResponse getPersonClass(PersonRequest personRequest) {
        final PersonResponse personResponse = new PersonResponse();
        personResponse.setFullName(personRequest.getFullName());
        final LocalDate dateToday = LocalDate.now();
        try {
            final LocalDate dob = LocalDate.parse(personRequest.getDateOfBirth(), DATE_FORMATTER);
            final Long age = ChronoUnit.YEARS.between(dob, dateToday);
            if (Objects.nonNull(age) && age > 0) {
                if (age > 0 && age <= 5) {
                    personResponse.setPersonClassification("Toddler");
                } else if (age > 5 && age < 13) {
                    personResponse.setPersonClassification("Child");
                } else if (age >= 13 && age < 20) {
                    personResponse.setPersonClassification("Teenager");
                } else if (age >= 20 && age < 40) {
                    personResponse.setPersonClassification("Mid-Aged");
                } else {
                    personResponse.setPersonClassification("Senior");
                }
            }
            return personResponse;
        } catch (DateTimeParseException dtpe) {
            dtpe.printStackTrace();
        }
        personResponse.setPersonClassification("Invalid DOB");
        return personResponse;
    }
}
