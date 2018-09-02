package com.cesarschool.ManagerProject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cesarschool.ManagerProject.repository.ContaRepository;

@Controller
public class ContaController {

	@Autowired
	private ContaRepository contaRepository;
	
	@RequestMapping("/conta")
	public String conta() {
		return "conta/detalhesConta";
	}

	
}
