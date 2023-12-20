package com.generation.uni.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produto")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 100)
	@NotBlank(message = "O Atributo nome é obrigatorio!")
	@Size(min = 5, max = 100, message = "O Atributo nome deve conter no minimo 5 e no maximo 100 caracteres.")
	private String nome;

	@Column(length = 1000)
	@Size(min = 5, max = 100, message = "O Atributo descrição deve conter no minimo 5 e no maximo 100 caracteres.")
	private String descricao;

	@DecimalMin(value = "0.0", inclusive = false)
	@Digits(integer = 3, fraction = 2)
	private BigDecimal preco;

	@Column(length = 100)
	@NotBlank(message = "O Atributo foto é obrigatorio!")
	@Size(min = 10, max = 100, message = "O Atributo foto deve conter no minimo 10 e no maximo 1000 caracteres.")
	private String foto;

	@Column(length = 100)
	@NotBlank(message = "O Atributo cor é obrigatorio!")
	@Size(max = 100, message = "O Atributo cor deve conter no minimo 10 e no maximo 1000 caracteres.")
	private String cor;

	@Column(length = 100)
	@NotBlank(message = "O Atributo tamanho é obrigatorio!")
	@Size(max = 100, message = "O Atributo tamanho deve conter no minimo 10 e no maximo 1000 caracteres.")
	private String tamanho;

	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;

	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Usuario usuario;

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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
