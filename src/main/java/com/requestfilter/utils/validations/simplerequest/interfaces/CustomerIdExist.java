package com.requestfilter.utils.validations.simplerequest.interfaces;

import com.requestfilter.utils.validations.simplerequest.CustomerIdExistValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CustomerIdExistValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomerIdExist {

    public String message() default "Invalid Customer Id";

    public Class<?>[] groups() default {};

    public Class<? extends Payload>[] payload() default {};
}
