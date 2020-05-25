package com.technosmithlabs.swaggerpoc.service;

import com.technosmithlabs.swaggerpoc.model.PersonRequest;
import com.technosmithlabs.swaggerpoc.model.PersonResponse;

public interface RestService {
    public PersonResponse getPersonClass(PersonRequest personRequest);
}
