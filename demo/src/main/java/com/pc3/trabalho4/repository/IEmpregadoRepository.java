package br.com.prog3.trabalho4.repository;

public interface IEmpregadoRepository {
	List<Empregado> findAll();
	Empregado findById(Long id);
	List<Empregado> findByNome(String Nome);
	Empregado inserir(Empregado empregado);
	Empregado alterar(Empregado empregado);
	void excluir(Long id);
}
