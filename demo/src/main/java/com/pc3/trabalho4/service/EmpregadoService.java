package br.com.prog3.trabalho4.service;

public class EmpregadoService {
	public List<Empregado> findAll(){
		EmpregadoRepository empregadoRepository = new EmpregadoRepository();
		return empregadoRepository.findAll();
	}
}
