package com.web.controller;

import java.util.ArrayList;
import java.util.List;

 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.web.converter.ProductConverter;
import org.web.entity.EProduct;

import com.web.model.Categoria;
import com.web.model.Product;
import com.web.service.ICategoriaService;
import com.web.service.IProductService;
import com.web.service.ProductService;

@Controller
@RequestMapping("/views/")
public class ProductController {
	
	@Autowired
	IProductService service;
	
	@Autowired
	ICategoriaService categoriaService;
	
	
	
	@RequestMapping("listProduct")
	public String getProducts(Model model) {
		List<Product> allProduct= new ArrayList<>();
		allProduct= service.getAllProduct();
		model.addAttribute("titulo", "Los Productos");
		model.addAttribute("listadeproductos", allProduct);//allProduct);
		return "/views/listProduct";
	}
	
	
	@GetMapping("np")
	public String nuevoProducto(Model model) {
		
		Product p = new Product();
		List<Categoria> lc= categoriaService.ListaCategorias();
		
		model.addAttribute("titulo", "Formulario Nuevo Producto");
		model.addAttribute("producto", p);
		model.addAttribute("categorias", lc);
		return "/views/frmnuevoproducto";
	}
	
	@PostMapping("/saveproduct")
	public String Guardar(@ModelAttribute EProduct p) {
		
		service.guardar(p);
		System.out.println("CLIENTE GUARDADO CON EXITO!!");
		return "redirect:/views/listProduct";
	}
	
	@GetMapping("/edit/{id}")
	public String editProducto(@PathVariable("id") Long idProducto, Model model) {
		if(idProducto!=null) {
			EProduct p = new EProduct();			 
			p=service.findPorID(idProducto);			
			List<Categoria> lc= categoriaService.ListaCategorias();
 
			
			
			model.addAttribute("titulo", "Formulario Editar Producto");
			model.addAttribute("producto", p);
			model.addAttribute("categorias", lc);	
		}
		
//		Product p = service.buscarPorID(idProducto);
		
		return "/views/frmnuevoproducto";
	}

}
