package com.example.demo.models.dto;

import java.io.Serializable;
import java.time.LocalTime;

import com.fasterxml.jackson.annotation.JsonFormat;

public class HoraRequestDTO implements Serializable{

	@JsonFormat(pattern="HH:mm:ss")
	
	private LocalTime time;
	private Integer timezone;
	public LocalTime getTime() {
		return time;
	}
	public void setTime(LocalTime time) {
		this.time = time;
	}
	public Integer getTimezone() {
		return timezone;
	}
	public void setTimezone(Integer timezone) {
		this.timezone = timezone;
	}
	public HoraRequestDTO(LocalTime time, Integer timezone) {
		
		this.time = time;
		this.timezone = timezone;
	}
	public HoraRequestDTO() {
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public String toString() {
		return "HoraRequestDTO [time=" + time + ", timezone=" + timezone + "]";
	}



	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}
