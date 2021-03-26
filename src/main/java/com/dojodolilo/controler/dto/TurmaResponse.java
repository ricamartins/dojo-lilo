package com.dojodolilo.controler.dto;

import java.time.LocalDate;

import com.dojodolilo.modelo.Turma;

public class TurmaResponse {

	private Long id;

	private String nome;

	private LocalDate dataInicio;

	private LocalDate dataFinal;

	public TurmaResponse(Turma turma) {
		this.id = turma.getId();
		this.nome = turma.getNome();
		this.dataInicio = turma.getDataInicio();
		this.dataFinal = turma.getDataFinal();
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public LocalDate getDataInicio() {
		return dataInicio;
	}

	public LocalDate getDataFinal() {
		return dataFinal;
	}

}
