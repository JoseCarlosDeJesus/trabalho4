package br.com.prog3.trabalho4.repository;

public interface IDependenteRepository {
	List<Dependente> findAll();
	Dependente findById(String id);
	List<Dependente> findByCpfEmpregado(String cpfEmpregado);
	Dependente inserir(Dependente dependente);
	Dependente alterar(Dependente dependente);
	void excluir(Long id);
}
