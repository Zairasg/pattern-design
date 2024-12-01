/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer;

/**
 *
 * @author zagar
 */

import java.util.ArrayList;
import java.util.List;

interface Observador {
    void actualizar(String mensaje);
}

class Usuario implements Observador {
    private String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(String mensaje) {
        System.out.println(nombre + " recibió la notificación: " + mensaje);
    }
}

class Canal {
    private List<Observador> observadores = new ArrayList<>();

    public void suscribir(Observador observador) {
        observadores.add(observador);
    }

    public void desuscribir(Observador observador) {
        observadores.remove(observador);
    }

    public void notificar(String mensaje) {
        for (Observador observador : observadores) {
            observador.actualizar(mensaje);
        }
    }
}

public class ObserverExample {
    public static void main(String[] args) {
        Canal canal = new Canal();
        Usuario usuario1 = new Usuario("Juan");
        Usuario usuario2 = new Usuario("María");
        canal.suscribir(usuario1);
        canal.suscribir(usuario2);
        canal.notificar("Nuevo video disponible.");
        canal.desuscribir(usuario1);
        canal.notificar("Segundo video disponible.");
    }
}

