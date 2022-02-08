package com.poo2.springboot.poo2;
import org.springframework.stereotype.Component;
@Component
public class ComponentImplementacion implements ComponentDependency{
    @Override
    public void saludar(){
        System.out.println("Hola mundo mi primer componente");
    }
}