package com.poo2.springboot.poo2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Poo2Application implements CommandLineRunner {
	protected ComponentDependency componentDependency;
	private MyBean myBean;
	//private ComponentImplementacion componentImplementacion;
	public Poo2Application(@Qualifier("componentDosImplement")ComponentDependency componentDependency,MyBean myBean){
		this.componentDependency=componentDependency;
		this.myBean=myBean;
	}

	public static void main(String[] args) {
		SpringApplication.run(Poo2Application.class, args);
	}
	@Override
	public void run(String...args){
		componentDependency.saludar();
		myBean.imprimir();
	}

}