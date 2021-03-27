package com.dojodolilo.validacao;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.dojodolilo.controler.dto.TurmaRequest;

public class DataFinalPosteriorDataInicialValidator implements ConstraintValidator<DataFinalPosteriorDataInicial, TurmaRequest> {


	@Override
	public void initialize(DataFinalPosteriorDataInicial constraintAnnotation) {
	}
	
	@Override
	public boolean isValid(TurmaRequest turma, ConstraintValidatorContext context) {

		if (turma.getDataInicio() == null || turma.getDataFinal() == null)
			return false;

		return turma.getDataInicio().isBefore(turma.getDataFinal());
	}

}
