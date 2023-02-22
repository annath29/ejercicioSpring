package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class SaludoService {
	public String hola() {
		try {
			Thread.sleep(3000);;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return "Hola sincrono";
	}
	
	public String hola2() {
		try {
			Thread.sleep(3000);;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return "Hola sincrono 2";
	}
}
