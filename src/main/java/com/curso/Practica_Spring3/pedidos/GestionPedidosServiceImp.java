package com.curso.Practica_Spring3.pedidos;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("gestionPedidosABC")
public class GestionPedidosServiceImp implements GestionPedidosService {

	public static Logger log = Logger.getAnonymousLogger();
	@Autowired
	private Pedido pedido;
	
	public GestionPedidosServiceImp() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void gestionar() {
		// TODO Auto-generated method stub
		log.info(".... Gestionando ....");
		pedido.pidiendo();
	}

}
