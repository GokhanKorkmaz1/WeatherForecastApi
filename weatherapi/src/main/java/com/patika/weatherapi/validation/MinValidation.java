package com.patika.weatherapi.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = MinValidationValidator.class)
public @interface MinValidation {
	String message() default "days parametresi 1'den kucuk olamaz";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
