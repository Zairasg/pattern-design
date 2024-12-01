/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Template;

/**
 *
 * @author zagar
 */

abstract class Procesador {
    public final void ejecutar() {
        cargarDatos();
        procesarDatos();
        guardarResultado();
    }

    protected abstract void cargarDatos();

    protected abstract void procesarDatos();

    protected void guardarResultado() {
        System.out.println("Guardando el resultado.");
    }
}

class ProcesadorTexto extends Procesador {
    @Override
    protected void cargarDatos() {
        System.out.println("Cargando datos de texto.");
    }

    @Override
    protected void procesarDatos() {
        System.out.println("Procesando datos de texto.");
    }
}

class ProcesadorImagen extends Procesador {
    @Override
    protected void cargarDatos() {
        System.out.println("Cargando datos de imagen.");
    }

    @Override
    protected void procesarDatos() {
        System.out.println("Procesando datos de imagen.");
    }
}

public class TemplateExample {
    public static void main(String[] args) {
        Procesador procesadorTexto = new ProcesadorTexto();
        procesadorTexto.ejecutar();
        Procesador procesadorImagen = new ProcesadorImagen();
        procesadorImagen.ejecutar();
    }
}
