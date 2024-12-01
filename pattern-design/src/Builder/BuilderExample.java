/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder;

/**
 *
 * @author zagar
 */

class Producto {
    private String parteA;
    private String parteB;
    private String parteC;

    public void setParteA(String parteA) {
        this.parteA = parteA;
    }

    public void setParteB(String parteB) {
        this.parteB = parteB;
    }

    public void setParteC(String parteC) {
        this.parteC = parteC;
    }

    @Override
    public String toString() {
        return "Producto [parteA=" + parteA + ", parteB=" + parteB + ", parteC=" + parteC + "]";
    }
}

interface Constructor {
    void construirParteA();

    void construirParteB();

    void construirParteC();

    Producto obtenerProducto();
}

class ConstructorConcreto implements Constructor {
    private Producto producto = new Producto();

    @Override
    public void construirParteA() {
        producto.setParteA("Parte A construida");
    }

    @Override
    public void construirParteB() {
        producto.setParteB("Parte B construida");
    }

    @Override
    public void construirParteC() {
        producto.setParteC("Parte C construida");
    }

    @Override
    public Producto obtenerProducto() {
        return producto;
    }
}

class Director {
    private Constructor constructor;

    public Director(Constructor constructor) {
        this.constructor = constructor;
    }

    public Producto construirProducto() {
        constructor.construirParteA();
        constructor.construirParteB();
        constructor.construirParteC();
        return constructor.obtenerProducto();
    }
}

public class BuilderExample {
    public static void main(String[] args) {
        Constructor constructor = new ConstructorConcreto();
        Director director = new Director(constructor);
        Producto producto = director.construirProducto();
        System.out.println(producto);
    }
}

