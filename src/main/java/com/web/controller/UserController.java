package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	
	@RequestMapping("/views/listUser")
	public String getUser(Model model) {
		model.addAttribute("titulo", "Los Usuarios");
		model.addAttribute("listadeusuarios", "Todos los Usuarios");
		return "/views/listUser";
	}

}
