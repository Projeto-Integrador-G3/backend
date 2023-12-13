package com.generation.uni.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_categoria") // CREATE TABLE tb_categoria
public class Categoria {

	@Id //Primary Key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO_INCREMENT
	private Long id;
	
	@Column(length = 500) // Define o maximo 
	@Size(max = 500, message = "O Atributo descrição deve conter no "
			+ "máximo 500 carácteres.")
	private String descricao;
	
	@Column(length = 255)
	@NotBlank(message = "O atributo Tipo é obrigatorio !")
	@Size(min = 3,max = 255, message = "O Atributo tipo deve conter no "
			+ "minimo 3 e no máximo 255 carácteres.")
	private String tipo;

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
