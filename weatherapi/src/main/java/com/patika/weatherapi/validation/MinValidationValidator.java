package com.patika.weatherapi.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.patika.weatherapi.validation.ForecastQueryParamValidation.GetTaskRequestParameters;

public class MinValidationValidator implements ConstraintValidator<MinValidation, GetTaskRequestParameters>{

	@Override
	public boolean isValid(GetTaskRequestParameters value, ConstraintValidatorContext context) {
		if(value.days() < 1) {
			context.disableDefaultConstraintViolation();
			context.buildConstraintViolationWithTemplate("Days value should be between 0 to 15");
			return false;
		}
		return true;
	}

}
