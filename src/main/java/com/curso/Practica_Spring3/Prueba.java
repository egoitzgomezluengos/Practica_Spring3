package com.curso.Practica_Spring3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.curso.Practica_Spring3.pedidos.GestionPedidosService;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("application-context-pedidos.xml");
		GestionPedidosService servicio = (GestionPedidosService) context.getBean("gestionPedidosABC");
		servicio.gestionar();
	}

}
