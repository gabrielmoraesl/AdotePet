package br.pet.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import br.pet.admin.entity.User;

@Entity
public class Animal {
	@Id
	@GeneratedValue
	private Integer id;

	@Column(name = "tx_nome")
	private String nome;

	@Column(name = "tx_cor")
	private String cor;

	@Column(name = "dt_nascimento")
	private Date dtNascimento;

	@Column(name = "tx_carteira_vacinacao")
	private String carteiraVacinacao;

	@Column(name = "tx_sexo")
	private String sexo;

	@Column(name = "tx_descricao")
	private String descricao;

	@Column(name = "dt_cadastro")
	private Date dtCadastro;

	@OneToOne
	private TipoAnimal tipoAnimal;

	@OneToOne
	private User dono;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Date getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public String getCarteiraVacinacao() {
		return carteiraVacinacao;
	}

	public void setCarteiraVacinacao(String carteiraVacinacao) {
		this.carteiraVacinacao = carteiraVacinacao;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDtCadastro() {
		return dtCadastro;
	}

	public void setDtCadastro(Date dtCadastro) {
		this.dtCadastro = dtCadastro;
	}

	public TipoAnimal getTipoAnimal() {
		return tipoAnimal;
	}

	public void setTipoAnimal(TipoAnimal tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}

	public User getDono() {
		return dono;
	}

	public void setDono(User dono) {
		this.dono = dono;
	}

}
