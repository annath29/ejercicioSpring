package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.FiguraEntity;
import com.example.demo.repository.FakeRepository;

@Service
public class FiguraService {
	@Autowired
	public FakeRepository repositorio;
	
	public boolean crearFigura(FiguraEntity figura) {
		return repositorio.agregarFigura((figura));
	}
	
	public List<FiguraEntity> obtenerFigura(){
		return repositorio.traerFigura();
	}
	
	public boolean eliminarFigura(int id) {
		return repositorio.eliminarFigura(id);
	}
}
