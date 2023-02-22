package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.SaludoReactivoServicio;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class SaludoReactivoController {
	@Autowired//llamar el servicio
	SaludoReactivoServicio saludo;
	
	@RequestMapping("/hola-asincrono")
	public Mono<String>hola(){
		return saludo.hola();
	}
	
	@RequestMapping("/hola-asincrono2")
	public Mono<String>hola2(){
		return saludo.hola();
	}
	@RequestMapping("/holas-asincorono")
	public Mono<Object> holas() {
		List<String>lista=new ArrayList<>();
		if (lista.size()>0) {
			return Flux.just(lista).collect(Collectors.reducing((i1,i2)->i1)).map(op->op.get());
		}
		else {
			return Mono.just("no hay datos");
		}
	}
}
