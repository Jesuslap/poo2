package com.poo2.springboot.poo2;
import java.util.Scanner;
public class MyBeanImplement implements MyBean{
    @Override
    public void imprimir(){
        System.out.println("Resta de dos numeros");
        int num1,num2,resultado;

        Scanner objeto=new Scanner(System.in);
        System.out.println("ingrese el primer numero de la resta");
        num1=objeto.nextInt();
        System.out.println("ingrese el segundo numero de la resta");
        num2=objeto.nextInt();
        resultado=num1-num2;
        System.out.println("el resultado de la resta es igual a :"+resultado);
    }
}