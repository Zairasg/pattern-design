/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strategy;

/**
 *
 * @author zagar
 */

interface Estrategia {
    void ejecutar();
}

class EstrategiaA implements Estrategia {
    @Override
    public void ejecutar() {
        System.out.println("Estrategia A ejecutada.");
    }
}

class EstrategiaB implements Estrategia {
    @Override
    public void ejecutar() {
        System.out.println("Estrategia B ejecutada.");
    }
}

class Contexto {
    private Estrategia estrategia;

    public void setEstrategia(Estrategia estrategia) {
        this.estrategia = estrategia;
    }

    public void ejecutarEstrategia() {
        estrategia.ejecutar();
    }
}

public class StrategyExample {
    public static void main(String[] args) {
        Contexto contexto = new Contexto();
        Estrategia estrategiaA = new EstrategiaA();
        Estrategia estrategiaB = new EstrategiaB();
        contexto.setEstrategia(estrategiaA);
        contexto.ejecutarEstrategia();
        contexto.setEstrategia(estrategiaB);
        contexto.ejecutarEstrategia();
    }
}
