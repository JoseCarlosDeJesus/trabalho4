package br.com.prog3.trabalho4.resources;

@RestController
@RequestMapping("/api/v1/Empregado")

public class EmpregadoResource {
	@GetMapping()
	public List<Empregado> get() {
	EmpregadoService empregadoService = new EmpregadoService();
	return empregadoService.findAll();
	}

}
