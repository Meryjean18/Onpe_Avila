package com.web.onpe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.web.onpe.service.GrupoVotacionService;

@Controller
public class OnpeController {

	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/actas")
	public String actas() {
		return "actas";
	}
	
	@Autowired
	private GrupoVotacionService Grupovotacion;
	
	@RequestMapping("/actasnumero")
	public String Listar(Model modelo ,@RequestParam("nroMesa") String nroMesa){
		modelo.addAttribute("actas", Grupovotacion.getGrupoVotacion(nroMesa));
	    return "actas_info";
	}
}
