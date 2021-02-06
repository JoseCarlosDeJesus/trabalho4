package br.com.prog3.trabalho4.domain;

public class Empregado {
       private Long cpf;
       private String nome;
       private Integer idade;
       private Double salario;
	
       public Empregado(Long cpf, String nome, Integer idade, Double salario) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
       
       
       
       
}
