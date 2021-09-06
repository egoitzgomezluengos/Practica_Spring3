package com.curso.Practica_Spring3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.curso.Practica_Spring3.domain.AppConfig;
import com.curso.Practica_Spring3.domain.Gestor;
import com.curso.Practica_Spring3.domain.JefeEquipo;

public class Application
{
	public static void main( String[] args )
	{
		//ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		//Gestor servicio = (Gestor) context.getBean("jefe1");
		//servicio.gestionar();
		
		
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Gestor gestor = (Gestor) context.getBean(JefeEquipo.class);
		gestor.gestionar();

	}
}