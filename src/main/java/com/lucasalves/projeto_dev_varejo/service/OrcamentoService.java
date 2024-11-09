package com.lucasalves.projeto_dev_varejo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucasalves.projeto_dev_varejo.entity.Orcamento;
import com.lucasalves.projeto_dev_varejo.repository.OrcamentoRepository;

@Service
public class OrcamentoService {

    @Autowired
    OrcamentoRepository orcamentoRepository;

        public String save (Orcamento orcamento) {
		this.orcamentoRepository.save(orcamento);
		return "Orçamento cadastrado com sucesso";
	}

    public List<Orcamento> listar () {
		
		return this.orcamentoRepository.findAll();
		
	}
    
}
