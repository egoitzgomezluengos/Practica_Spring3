package com.curso.Practica_Spring3.domain;

import java.util.logging.Logger;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class JefeEquipo implements Gestor {

	private static Logger log = Logger.getAnonymousLogger();
	
	private int equipo;
	
	@Resource(name="programador2")
	private Recurso recurso;
	
	public JefeEquipo() {
		// TODO Auto-generated constructor stub
		log.info("... Construyendo JefeEquipo");
		equipo = 1;
	}
	
	public JefeEquipo(int equipo, Recurso recurso) {
		this.equipo= equipo;
		this.recurso= recurso;
		log.info("... Construyendo JefeEquipo con recurso y numero de equipo"); 
	}

	@Override
	public void gestionar() {
		// TODO Auto-generated method stub
		log.info("Gestiono el equipo " + equipo);
		log.info("Iniciar recursos");
		recurso.trabajar();
	}

}
