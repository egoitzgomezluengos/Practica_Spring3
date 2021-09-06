package com.curso.Practica_Spring3.pedidos;

import java.util.logging.Logger;

import org.springframework.stereotype.Component;

@Component
public class Pedido {

	public static Logger log = Logger.getAnonymousLogger();
	
	public Pedido() {
		// TODO Auto-generated constructor stub
	}
	
	public void pidiendo() {
		log.info(".... pidiendo");
	}

}
