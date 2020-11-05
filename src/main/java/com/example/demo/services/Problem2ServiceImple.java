package com.example.demo.services;

import java.time.LocalTime;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.models.dto.HoraRequestDTO;
import com.example.demo.models.dto.HoraResponseDTO;

@Service
public class Problem2ServiceImple implements IProblem2Service {

	@Override
	public ResponseEntity<HoraResponseDTO> calcularUtc(HoraRequestDTO hora) {
		LocalTime lt;
		if(hora.getTimezone() < 0) {
			lt=hora.getTime().plusHours(Math.abs(Long.valueOf(hora.getTimezone())));
		}
		else if(hora.getTimezone() > 0) {
			lt=hora.getTime().minusHours(Long.valueOf(hora.getTimezone()));
		}
		else {
			lt=hora.getTime();
		}
		return ResponseEntity.ok(new HoraResponseDTO(lt.toString(),"utc"));
	}

}
