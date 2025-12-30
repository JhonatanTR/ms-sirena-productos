package com.sirena.productos.control;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/v1/productos")
public class ProductosController {

	@GetMapping
	public ResponseEntity<List<String>>listarProductos(){
		List<String> listaProductos= new ArrayList<>();
		listaProductos.add("Ropa");
		listaProductos.add("Jabon Zote");
		listaProductos.add("Corona");
		listaProductos.add("Refresco");
		return new ResponseEntity<List<String>>(listaProductos,HttpStatus.ACCEPTED);
	}
	
}
