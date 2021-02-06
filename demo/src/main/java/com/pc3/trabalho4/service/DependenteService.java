package br.com.prog3.trabalho4.service;

public class DependenteService {
	public List<Dependente> findAll(){
		DependenteRepository dependenteRepository = new DependenteRepository();
		return dependenteRepository.findAll();
	}
}
