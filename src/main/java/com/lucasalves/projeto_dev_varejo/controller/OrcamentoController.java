package com.lucasalves.projeto_dev_varejo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucasalves.projeto_dev_varejo.entity.Orcamento;
import com.lucasalves.projeto_dev_varejo.service.OrcamentoService;

@RestController
@RequestMapping("/api/orcamento")
public class OrcamentoController {

    @Autowired
	private OrcamentoService orcamentoService;


    @GetMapping("/listar")
	public ResponseEntity<List<Orcamento>> listar(){
		try {
			List<Orcamento> lista = this.orcamentoService.listar();
			return new ResponseEntity<>(lista, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST );
		}
	}

    @PostMapping("/save")
	public ResponseEntity<String> save(@RequestBody Orcamento orcamento){
		try {
			String mensagem = this.orcamentoService.save(orcamento);
			return new ResponseEntity<>(mensagem, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>("Deu erro!"+e.getMessage(), HttpStatus.BAD_REQUEST );
		}
	}
    
}
