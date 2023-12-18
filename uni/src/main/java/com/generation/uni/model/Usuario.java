package com.generation.uni.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O atributo [nome] é obrigatório!")
	@Size(min = 3, max = 255, message = "O [nome] deve conter no mínimo 3 e no máximo 255 caracteres.")
	@Column(length = 255, nullable = false)
	private String nome;
	
	@NotBlank(message = "O atributo [usuario] é obrigatório!")
	@Size(min = 10, max = 255, message = "O [usuario] deve conter no mínimo 10 e no máximo 255 caracteres.")
	@Email
	@Column(length = 255, nullable = false, unique = true)
	private String usuario;
	
	@NotBlank(message = "O atributo [senha] é obrigatório!")
	@Size(min = 3, max = 100, message = "O [senha] deve conter no mínimo 3 e no máximo 100 caracteres.")
	@Column(length = 255, nullable = false)
	private String senha;
	
	@Size(min = 10, max = 255, message = "A [foto] deve conter no mínimo 10 e no máximo 255 caracteres.")
	@Column(length = 255, nullable = true)
	private String foto;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario", cascade = CascadeType.REMOVE)
    @JsonIgnoreProperties("usuario")
	private List <Produto> produtos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
}
