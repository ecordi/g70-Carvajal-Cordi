# clase Cliente
package com.ecordi.clientes.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "cliente")
public class Cliente implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 448583438176888286L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@NotEmpty(message = "puede estar vacio")
	@Column(name = "nombre",unique = true, nullable = false	)
	private String nombre;
	@NotEmpty(message = " puede estar vacio")
	@Column(name = "apellido",unique = true, nullable = false)
	private String apellido;
	@Column(name = "email",unique = true, nullable = false)
	@Email
	private String email;
	
}

