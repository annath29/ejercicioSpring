package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelo.FiguraEntity;
import com.example.demo.service.FiguraService;

@RestController
@RequestMapping("/apifigura")
public class FiguraController {
	@Autowired
	FiguraService servicio;
	
	@PostMapping("/crear-figura")
	public boolean agregarFigura(@RequestBody FiguraEntity figura) {
		return servicio.crearFigura(figura);
	}
	@GetMapping("/obtener-figura")
	public List<FiguraEntity> obtenerFiguras(){
		return servicio.obtenerFigura();
	}
	
	@DeleteMapping("/eliminar-figura")
	public boolean eliminarFiguras(int id) {
		return servicio.eliminarFigura(id);
	}
	

}
