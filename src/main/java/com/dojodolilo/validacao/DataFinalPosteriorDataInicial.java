package com.dojodolilo.validacao;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ElementType.TYPE})
@Constraint(validatedBy=DataFinalPosteriorDataInicialValidator.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface DataFinalPosteriorDataInicial {

	String message() default "Data final deve ser após data inicial";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};

}
