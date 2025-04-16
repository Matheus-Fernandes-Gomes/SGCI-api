package br.com.sgci.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sgci.controller.schema.PessoaReq;
import br.com.sgci.manager.PessoaManager;
import br.com.sgci.model.Pessoa;
import jakarta.validation.Valid;


// ctrl+shift+o
@RestController
@RequestMapping("pessoas")
public class PessoaController {

	@Autowired
	private PessoaManager pessoaManager;
	

	@PostMapping
	public ResponseEntity<Long> createPessoa(
			@Valid @RequestBody PessoaReq req) {
		Pessoa pessoa = pessoaManager.createPessoa(req);
		return ResponseEntity.ok(pessoa.getId());
	}
	

	@GetMapping
	public ResponseEntity<String> findAll() {
		return ResponseEntity.ok("Olá Mundo!");
	}

	// @PutMapping
	// update

	// @DeleteMapping
	// apagar

}
