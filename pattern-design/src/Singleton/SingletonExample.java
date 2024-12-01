/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton;

/**
 *
 * @author zagar
 */

class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void mostrarMensaje() {
        System.out.println("Mensaje desde la instancia única de Singleton.");
    }
}

public class SingletonExample {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        
        singleton.mostrarMensaje();
        
        Singleton otroSingleton = Singleton.getInstance();
        if (singleton == otroSingleton) {
            System.out.println("Ambas referencias apuntan a la misma instancia.");
        }
    }
}
