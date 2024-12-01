/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractFactory;

/**
 *
 * @author zagar
 */

interface Comida {
    void preparar();
}

class Pizza implements Comida {
    public void preparar() {
        System.out.println("Preparando pizza.");
    }
}

class Hamburguesa implements Comida {
    public void preparar() {
        System.out.println("Preparando hamburguesa.");
    }
}

interface ComidaFactory {
    Comida crearComida(String tipo);
}

class ComidaFactoryImpl implements ComidaFactory {
    public Comida crearComida(String tipo) {
        if (tipo == null) {
            return null;
        }
        if (tipo.equalsIgnoreCase("Pizza")) {
            return new Pizza();
        } else if (tipo.equalsIgnoreCase("Hamburguesa")) {
            return new Hamburguesa();
        }
        return null;
    }
}

public class AbstractFactoryExample {
    public static void main(String[] args) {
        ComidaFactory comidaFactory = new ComidaFactoryImpl();
        
        Comida pizza = comidaFactory.crearComida("Pizza");
        pizza.preparar();
        
        Comida hamburguesa = comidaFactory.crearComida("Hamburguesa");
        hamburguesa.preparar();
    }
}
