package com.dojodolilo.controler;

import javax.validation.Valid;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dojodolilo.controler.dto.TurmaRequest;
import com.dojodolilo.controler.dto.TurmaResponse;
import com.dojodolilo.modelo.Turma;
import com.dojodolilo.repositorios.TurmaRepository;

@RestController
@RequestMapping("/turmas")
@CrossOrigin
public class TurmaController {

	private TurmaRepository repository;

	public TurmaController(TurmaRepository repository) {
		this.repository = repository;
	}
	
	@PostMapping
	public TurmaResponse cadastrar(@RequestBody @Valid TurmaRequest turmaRequest) {
		Turma turma = turmaRequest.converter();
		repository.save(turma);
		TurmaResponse turmaResponse = new TurmaResponse(turma);
		return turmaResponse;
		//new TurmaResponse(repository.save(turma.converter()))
	}
}
