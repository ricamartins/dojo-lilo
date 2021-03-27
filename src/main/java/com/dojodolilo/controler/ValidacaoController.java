package com.dojodolilo.controler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ValidacaoController {
	
//    @Override
//    protected ResponseEntity<Object> handleMethodArgumentNotValid(
//            MethodArgumentNotValidException ex,
//            HttpHeaders headers,
//            HttpStatus status,
//            WebRequest request) {
//
//        List<String> errors = new ArrayList<>();
//
//        for (FieldError error : ex.getBindingResult().getFieldErrors()) {
//            errors.add(error.getField() + ": " + error.getDefaultMessage());
//        }
//
//        for (ObjectError error : ex.getBindingResult().getGlobalErrors()) {
//            errors.add(error.getObjectName() + ": " + error.getDefaultMessage());
//        }
//
//        ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST,  errors);
//
//        return handleExceptionInternal(ex, apiError, headers, apiError.getStatus(), request);
//    }
	
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, List<ErroResponse>> validacao(MethodArgumentNotValidException exception) {
		
		List<FieldError> erros = exception.getBindingResult().getFieldErrors();
		
		List<ErroResponse> responses = erros.stream()
			.map(e -> new ErroResponse(e.getCode(), e.getField(), e.getDefaultMessage()))
			.collect(Collectors.toList());
		
		Map<String, List<ErroResponse>> response = new HashMap<String, List<ErroResponse>>();
		response.put("errors", responses);
		
		return response;
	}
	
}
