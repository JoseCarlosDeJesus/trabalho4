package br.com.prog3.trabalho4.repository;

public class EmpregadoRepository implements IEmpregadoRepository{
	@Override
	public List<Empregado> findAll() {
	// TODO Auto-generated method stub
	return null;
	}
	@Override
	public Empregado findById(Long id) {
	// TODO Auto-generated method stub
	return null;
	}
	
	@Override
	public List<Empregado> findByNome(String nome) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Empregado inserir(Empregado empregado) {
	// TODO Auto-generated method stub
	return null;
	}
	@Override
	public Empregado alterar(Empregado empregado) {
	// TODO Auto-generated method stub
	return null;
	}
	@Override
	public void excluir(Long id) {
	// TODO Auto-generated method stub
	}
	
	@Override
	public List<Empregado> findAll() {
	   List<Empregado> empregado = new ArrayList<>();
	   empregado.add(new Empregado(123456,"João Pereira",40,5000.00));
	   empregado.add(new Empregado(654321,"Helen Ferreira",30,2000.00));
	   empregado.add(new Empregado(678921,"Mateus Lester",20,10000.00));
	   empregado.add(new Empregado(6210863,"Maria Catarina",42,6000.00));
	   empregado.add(new Empregado(12678023,"Eduarda Candida",21,3000.50));
	   return empregados;
	}
}
