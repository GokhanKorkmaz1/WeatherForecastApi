package com.patika.weatherapi.validation;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;


@MinValidation
public class ForecastQueryParamValidation {
	public record GetTaskRequestParameters(
			@NotNull
            String city,
            @NotNull
            @Min(1)
			@Max(15)
            int days) {
}
}
