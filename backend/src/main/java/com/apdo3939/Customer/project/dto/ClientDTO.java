package com.apdo3939.Customer.project.dto;

import java.io.Serializable;
import java.time.Instant;

import com.apdo3939.Customer.project.entities.Client;

public class ClientDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private String cpf;
	private Double icome;
	private Instant birthDate;
	private Integer childern;
	
	public ClientDTO() {
		
	}

	public ClientDTO(Long id, String name, String cpf, Double icome, Instant birthDate, Integer childern) {
		super();
		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.icome = icome;
		this.birthDate = birthDate;
		this.childern = childern;
	}
	
	public ClientDTO(Client entity) {
		super();
		id = entity.getId();
		name = entity.getName();
		cpf = entity.getCpf();
		icome = entity.getIcome();
		birthDate = entity.getBirthDate();
		childern = entity.getChildern();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Double getIcome() {
		return icome;
	}

	public void setIcome(Double icome) {
		this.icome = icome;
	}

	public Instant getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Instant birthDate) {
		this.birthDate = birthDate;
	}

	public Integer getChildern() {
		return childern;
	}

	public void setChildern(Integer childern) {
		this.childern = childern;
	}
	
}
