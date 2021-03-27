package com.dojodolilo.controler.dto;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.dojodolilo.modelo.Turma;
import com.dojodolilo.validacao.DataFinalPosteriorDataInicial;

@DataFinalPosteriorDataInicial
public class TurmaRequest {

	@NotBlank @Size(max=50)
	private String nome;
	
	@NotNull
	private LocalDate dataInicio;
	
	@NotNull
	private LocalDate dataFinal;
	
	public TurmaRequest(@NotBlank @Size(max = 50) String nome, @NotNull LocalDate dataInicio,
			@NotNull LocalDate dataFinal) {
		this.nome = nome;
		this.dataInicio = dataInicio;
		this.dataFinal = dataFinal;
	}

	public LocalDate getDataInicio() {
		return dataInicio;
	}
	
	public LocalDate getDataFinal() {
		return dataFinal;
	}
	
	public Turma converter() {
		return new Turma(nome, dataInicio, dataFinal);
	}
}
