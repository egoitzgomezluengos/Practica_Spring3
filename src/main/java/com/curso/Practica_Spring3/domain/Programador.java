package com.curso.Practica_Spring3.domain;

import java.util.logging.Logger;

import org.springframework.stereotype.Service;

@Service
public class Programador implements Recurso {

	private String tarea;
	private static Logger log = Logger.getAnonymousLogger();
	
	public Programador() {
		// TODO Auto-generated constructor stub
		tarea = "Programar";
		log.info("...Construyendo programador");
	}
	
	

	public String getTarea() {
		return tarea;
	}



	public void setTarea(String tarea) {
		this.tarea = tarea;
	}



	@Override
	public void trabajar() {
		// TODO Auto-generated method stub
		log.info("Realizo la tarea " + tarea);
	}

}
