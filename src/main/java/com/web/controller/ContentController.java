package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContentController {

	@RequestMapping("/views/listContent")
	public String getContent(Model model) {
		model.addAttribute("titulo", "Contenido");
		model.addAttribute("listadecontenido", "Todos los Contenidos");
		return "/views/listContent";
	}
	
}
