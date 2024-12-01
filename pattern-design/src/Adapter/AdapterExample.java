/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adapter;

/**
 *
 * @author zagar
 */

interface EnchufeEuropeo {
    void conectarEnchufe();
}

class EnchufeDeEuropa implements EnchufeEuropeo {
    @Override
    public void conectarEnchufe() {
        System.out.println("Conectado al enchufe europeo.");
    }
}

class EnchufeDeAmerica {
    public void conectar() {
        System.out.println("Conectado al enchufe americano.");
    }
}

class EnchufeAdapter implements EnchufeEuropeo {
    private EnchufeDeAmerica enchufeDeAmerica;

    public EnchufeAdapter(EnchufeDeAmerica enchufeDeAmerica) {
        this.enchufeDeAmerica = enchufeDeAmerica;
    }

    @Override
    public void conectarEnchufe() {
        enchufeDeAmerica.conectar(); 
    }
}

public class AdapterExample {
    public static void main(String[] args) {
        EnchufeEuropeo enchufeEuropeo = new EnchufeDeEuropa();
        enchufeEuropeo.conectarEnchufe();

        EnchufeDeAmerica enchufeAmericano = new EnchufeDeAmerica();
        EnchufeEuropeo enchufeAdaptado = new EnchufeAdapter(enchufeAmericano);
        enchufeAdaptado.conectarEnchufe();
    }
}

