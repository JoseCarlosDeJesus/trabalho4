package br.com.prog3.trabalho4.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/")

public class Trabalho41Resource {
	@GetMapping()
	public String get() {
	return "M�todo GET sendo chamado";
	}
	@PostMapping()
	public String post() {
	return "M�todo POST sendo chamado";
	}
	
	@PutMapping()
	public String put() {
		return "M�todo PUT sendo chamado";
	}
	
	@DeleteMapping()
	public String delete() {
	return "M�todo DELETE sendo chamado";
	}
	
	@PostMapping("/login")
	public String login(@RequestParam("login") String login,
	@RequestParam("senha") String senha) {
	return "Login: "+login+", Senha: "+senha;
	}

	@GetMapping("/cpf/{cpf}")
	public String findEmpregadoById(@PathVariable("cpf") Long cpf) {
	return "Cpf do empregado: "+cpf;
	}
	
	@GetMapping("/nome/{nome}")
	public String findDependenteById(@PathVariable("nome") Long Nome) {
	return " O Nome do dependente � : "+nome;
	}
	


}
