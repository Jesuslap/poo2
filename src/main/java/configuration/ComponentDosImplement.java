package com.poo2.springboot.poo2;
import org.springframework.stereotype.Component;
import java.util.Scanner;
@Component
public class ComponentDosImplement implements ComponentDependency{
    @Override
    public void saludar(){
        System.out.println(" suma de dos numeros");
        int num1,num2,resultado;
        Scanner objeto=new Scanner(System.in);
        System.out.println("ingrese el primer numero de la suma");
        num1=objeto.nextInt();
        System.out.println("ingrese el segundo numero de la suma");
        num2=objeto.nextInt();
        resultado=num1+num2;
        System.out.println("el resultado de la suma es igual a :"+resultado);
    }


}