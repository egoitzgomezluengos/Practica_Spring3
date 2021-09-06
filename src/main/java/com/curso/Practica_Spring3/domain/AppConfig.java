package com.curso.Practica_Spring3.domain;

import org.springframework.context.annotation.Bean;

public class AppConfig {

	@Bean
	public JefeEquipo jefeEquipo() {
		return new JefeEquipo();
	}
	
	@Bean
	public Programador programador1() {
		Programador p = new Programador();
		p.setTarea("programar en C++");
		return p;
	}
	
	@Bean
	public Programador programador2() {
		Programador p = new Programador();
		p.setTarea("Programar en Java EE");
		return p;
	}
}
