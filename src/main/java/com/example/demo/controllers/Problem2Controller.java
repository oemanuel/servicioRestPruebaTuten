package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.dto.HoraRequestDTO;
import com.example.demo.models.dto.HoraResponseDTO;
import com.example.demo.services.IProblem2Service;

@CrossOrigin(origins = "*", maxAge = 3600)



@RestController
@RequestMapping("/problem2")
public class Problem2Controller {
	
	@Autowired
	private IProblem2Service service;

	@PostMapping("/result")
	public ResponseEntity<HoraResponseDTO> result( @RequestBody HoraRequestDTO hora) {
		return service.calcularUtc(hora);
	}
}
