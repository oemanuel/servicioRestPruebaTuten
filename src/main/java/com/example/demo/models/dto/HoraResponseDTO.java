package com.example.demo.models.dto;

import java.io.Serializable;

public class HoraResponseDTO implements Serializable{


	private String time;
	private String timezone;
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	public HoraResponseDTO(String time, String timezone) {
		super();
		this.time = time;
		this.timezone = timezone;
	}
	public HoraResponseDTO() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
