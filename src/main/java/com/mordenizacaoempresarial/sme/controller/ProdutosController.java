package com.mordenizacaoempresarial.sme.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProdutosController {
	
	@RequestMapping("/produtos/novo")
	public String novo() {
		return "produto/cadastroProduto";
	}
}