package br.com.prog3.trabalho4.repository;

public class DependenteRepository implements IDependenteRepository{
	@Override
	public List<Dependente> findAll() {
	// TODO Auto-generated method stub
	return null;
	}
	@Override
	public Dependente findById(Long id) {
	// TODO Auto-generated method stub
	return null;
	}
	
	@Override
	public List<Dependente> findByDependente(String cpfEmpregado) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Dependente inserir(Dependente dependente) {
	// TODO Auto-generated method stub
	return null;
	}
	@Override
	public Dependente alterar(Dependente dependente) {
	// TODO Auto-generated method stub
	return null;
	}
	@Override
	public void excluir(Long id) {
	// TODO Auto-generated method stub
	}
	
	@Override
	public List<Dependente> findAll() {
	   List<Dependente> dependente = new ArrayList<>();
	   depedente.add(new Dependente(123456,"Duda Cintra","Irmã","25/06/1989"));
	   dependente.add(new Dependente(654321,"Christina Almeida","Filha","24/07/2000"));
	   dependente.add(new Dependente(678921,"Mateus Lester jr jr","Neto","12/12/2001"));
	   dependente.add(new Dependente(6210863,"Mario Luigi","filho","8/1/2010"));
	   dependente.add(new Dependente(12678023,"Guilherme Candido","Marido","22/01/2012"));
	   return dependente;
	}
	

}
