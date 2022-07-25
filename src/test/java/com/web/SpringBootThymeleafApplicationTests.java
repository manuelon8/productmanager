package com.web;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
 import org.web.entity.EProduct;

 
 import  org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import com.web.repository.ProductRepository;

@SpringBootTest
//@DataJpaTest
//@AutoConfigureTestDatabase(replace = Replace.NONE)
class SpringBootThymeleafApplicationTests {
	
	private ProductRepository repository;
	 
	
	@Autowired	
	public void setProductRepository(ProductRepository repository) {
		this.repository=repository;
	}

	@Test
	void contextLoads() {
	}
	
	@Test
	void testGuardarProducto() {
		
		EProduct product = new EProduct("Bocadillo de Calamar", 45, "FOODY");
		EProduct productGuardado = repository.save(product);
		assertNotNull(productGuardado);		
	}
	@Test
	void buscarProductoById() {
		String productoBase = "HARINA PANADERA";
		Long p = new Long(1);
		EProduct producto = repository.findById(p).orElse(null);
		assertThat(producto.getDescripcion().equals(productoBase));
	}
	
	@Test
	void buscarProductoByNoExistente() {
		String productoBase = "HARINA PANADERA333";
		Long p = new Long(1);
		EProduct producto = repository.findById(p).orElse(null);
		assertNull(producto.getDescripcion().equals(productoBase));
	}
	
	@Test
	void testListarProducto() {
		List<EProduct> productos =  (List<EProduct>) repository.findAll();
		assertThat(productos).size().isGreaterThan(0); 		 	
	}
	
	@Test
	void deleteProductoById() {
		
		String productoBase = "HARINA PANADERA";
		Long p = new Long(9);
		boolean existenteAntesEliminar = repository.findById(p).isPresent();
		
		repository.deleteById(p);
		
		boolean noexistenteDespuesEliminar = repository.findById(p).isPresent();
		
		assertTrue(existenteAntesEliminar);
		assertFalse(noexistenteDespuesEliminar);
	}

}
