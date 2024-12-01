/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package State;

/**
 *
 * @author zagar
 */

interface Estado {
    void manejar();
}

class EstadoEncendido implements Estado {
    @Override
    public void manejar() {
        System.out.println("El dispositivo está encendido.");
    }
}

class EstadoApagado implements Estado {
    @Override
    public void manejar() {
        System.out.println("El dispositivo está apagado.");
    }
}

class Contexto {
    private Estado estado;

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void ejecutar() {
        estado.manejar();
    }
}

public class StateExample {
    public static void main(String[] args) {
        Contexto contexto = new Contexto();
        Estado encendido = new EstadoEncendido();
        Estado apagado = new EstadoApagado();
        contexto.setEstado(encendido);
        contexto.ejecutar();
        contexto.setEstado(apagado);
        contexto.ejecutar();
    }
}
