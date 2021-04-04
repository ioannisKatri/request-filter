package com.requestfilter.utils.validations.simplerequest;

import com.requestfilter.utils.validations.simplerequest.interfaces.CustomerIdExist;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CustomerIdExistValidator implements ConstraintValidator<CustomerIdExist, Object> {

    @Override
    public boolean isValid(Object o, ConstraintValidatorContext constraintValidatorContext) {

//        TODO CHECK DATABASE IF EXIST the customer ID
        return true;
    }
}
