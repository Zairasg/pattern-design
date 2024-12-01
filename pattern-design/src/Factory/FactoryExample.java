/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

/**
 *
 * @author zagar
 */
abstract class Comida {
    public abstract void preparar();
}

class Pizza extends Comida {
    @Override
    public void preparar() {
        System.out.println("Preparando una pizza con masa, salsa de tomate y queso.");
    }
}

class Hamburguesa extends Comida {
    @Override
    public void preparar() {
        System.out.println("Preparando una hamburguesa con pan, carne y lechuga.");
    }
}

class Taco extends Comida {
    @Override
    public void preparar() {
        System.out.println("Preparando un taco con tortilla, carne y salsa.");
    }
}

class ComidaFactory {
    public Comida getComida(String tipoComida) {
        if (tipoComida == null) {
            return null;
        }
        if (tipoComida.equalsIgnoreCase("PIZZA")) {
            return new Pizza();
        } else if (tipoComida.equalsIgnoreCase("HAMBURGUESA")) {
            return new Hamburguesa();
        } else if (tipoComida.equalsIgnoreCase("TACO")) {
            return new Taco();
        }
        return null;
    }
}

public class FactoryExample {
    public static void main(String[] args) {
        ComidaFactory comidaFactory = new ComidaFactory();

        Comida pizza = comidaFactory.getComida("PIZZA");
        pizza.preparar();

        Comida hamburguesa = comidaFactory.getComida("HAMBURGUESA");
        hamburguesa.preparar();

        Comida taco = comidaFactory.getComida("TACO");
        taco.preparar();

        Comida desconocida = comidaFactory.getComida("SUSHI");
        if (desconocida == null) {
            System.out.println("Tipo de comida no reconocido.");
        }
    }
}