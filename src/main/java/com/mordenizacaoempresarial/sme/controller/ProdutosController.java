package com.mordenizacaoempresarial.sme.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mordenizacaoempresarial.sme.model.Produto;

@Controller
public class ProdutosController {
	
	@RequestMapping("/produtos/novo")
	public String novo(Produto produto) {
		return "produto/cadastroProduto";
	}
	
	@PostMapping(value="/produtos/novo")
	private String cadastrarProduto(@Valid Produto produto, BindingResult result, Model model, RedirectAttributes redirectAttributes) {
		if (result.hasErrors()) {
			return novo(produto);
		}
		
		redirectAttributes.addFlashAttribute("mensagem", "Produto Salvo com Sucesso.");
		System.out.println(">> NOME: " + produto.getNome());
		System.out.println(">>>> DESCRIÇÃO: " + produto.getDescricao());
		return "redirect:/produtos/novo";
	}
	
	@RequestMapping("/produtos/cadastro")
	public String cadastro() {
		return "produto/cadastro-produto";
	}
}
