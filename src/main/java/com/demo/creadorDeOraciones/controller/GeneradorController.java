package com.demo.creadorDeOraciones.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.creadorDeOraciones.dto.Catalogo;
import com.demo.creadorDeOraciones.dto.Oraciones;
import com.demo.creadorDeOraciones.dto.Palabras;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("generador")
public class GeneradorController {

	@GetMapping("/")
	public ResponseEntity generar() {
		try {
			Oraciones oracion = new Oraciones();
			
			String respuesta = oracion.generarNueva();
			
			return ResponseEntity.ok(respuesta);
		}
		catch(Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Hubo un problema: "+e);
		}
	}
	
	@PostMapping("/")
	public ResponseEntity guardar(@RequestBody Palabras palabra) {
		try {
			Catalogo cat = new Catalogo();
			
			cat.agregar(palabra.getNombre());
			
			return ResponseEntity.ok(cat);
		}
		catch(Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Hubo un problema: "+e);
		}
	}

}
