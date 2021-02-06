package br.com.prog3.trabalho4.domain;

public class Dependente {
	private Long cpfEmpregado;
    private String nome;
    private String grauParentesco;
    private String dataNascimento;
	
    public Dependente(Long cpfEmpregado, String nome, String grauParentesco, String dataNascimento) {
		super();
		this.cpfEmpregado = cpfEmpregado;
		this.nome = nome;
		this.grauParentesco = grauParentesco;
		this.dataNascimento = dataNascimento;
	}

	public Long getCpfEmpregado() {
		return cpfEmpregado;
	}

	public void setCpfEmpregado(Long cpfEmpregado) {
		this.cpfEmpregado = cpfEmpregado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGrauParentesco() {
		return grauParentesco;
	}

	public void setGrauParentesco(String grauParentesco) {
		this.grauParentesco = grauParentesco;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
    
    
    
}
