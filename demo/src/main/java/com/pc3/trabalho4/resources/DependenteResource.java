package br.com.prog3.trabalho4.resources;

@RestController
@RequestMapping("/api/v1/Dependente")

public class DependenteResource {
	@GetMapping()
	public List<Dependente> get() {
	DependenteService dependenteService = new DependenteService();
	return dependenteService.findAll();
	}
}
