package com.example.demo.services;

import org.springframework.http.ResponseEntity;

import com.example.demo.models.dto.HoraRequestDTO;
import com.example.demo.models.dto.HoraResponseDTO;

public interface IProblem2Service {

	public ResponseEntity<HoraResponseDTO> calcularUtc(HoraRequestDTO hora);
}
