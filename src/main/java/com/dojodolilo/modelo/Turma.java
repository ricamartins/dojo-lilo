package com.dojodolilo.modelo;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Turma {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable=false, length=50)
	private String nome;
	
	@Column(nullable=false, unique=true)
	private LocalDate dataInicio;
	
	@Column(nullable=false)
	private LocalDate dataFinal;

	public Turma(@NotEmpty @Size(max = 50) String nome, @NotNull LocalDate dataInicio,
			@NotNull LocalDate dataFinal) {
		this.nome = nome;
		this.dataInicio = dataInicio;
		this.dataFinal = dataFinal;
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
