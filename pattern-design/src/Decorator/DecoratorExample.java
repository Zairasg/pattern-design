/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

/**
 *
 * @author zagar
 */
interface Notificador {
    void enviar(String mensaje);
}

class NotificadorBasico implements Notificador {
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando mensaje: " + mensaje);
    }
}

abstract class NotificadorDecorator implements Notificador {
    protected Notificador notificador;

    public NotificadorDecorator(Notificador notificador) {
        this.notificador = notificador;
    }

    @Override
    public void enviar(String mensaje) {
        notificador.enviar(mensaje);
    }
}

class NotificadorPorEmail extends NotificadorDecorator {
    public NotificadorPorEmail(Notificador notificador) {
        super(notificador);
    }

    @Override
    public void enviar(String mensaje) {
        super.enviar(mensaje);
        System.out.println("Enviando notificación por correo: " + mensaje);
    }
}

class NotificadorPorSMS extends NotificadorDecorator {
    public NotificadorPorSMS(Notificador notificador) {
        super(notificador);
    }

    @Override
    public void enviar(String mensaje) {
        super.enviar(mensaje);
        System.out.println("Enviando notificación por SMS: " + mensaje);
    }
}

public class DecoratorExample {
    public static void main(String[] args) {
        Notificador notificador = new NotificadorBasico();
        Notificador notificadorConEmail = new NotificadorPorEmail(notificador);
        Notificador notificadorCompleto = new NotificadorPorSMS(notificadorConEmail);
        notificadorCompleto.enviar("Este es un mensaje importante.");
    }
}
