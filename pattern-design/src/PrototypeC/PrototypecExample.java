/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrototypeC;

/**
 *
 * @author zagar
 */

interface Prototipo extends Cloneable {
    Prototipo clonar();
}

class Documento implements Prototipo {
    private String contenido;

    public Documento(String contenido) {
        this.contenido = contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public Prototipo clonar() {
        return new Documento(this.contenido);
    }

    @Override
    public String toString() {
        return "Documento [contenido=" + contenido + "]";
    }
}

public class PrototypecExample {
    public static void main(String[] args) {
        Documento documentoOriginal = new Documento("Contenido original");
        Documento documentoClonado = (Documento) documentoOriginal.clonar();
        documentoClonado.setContenido("Contenido modificado");
        System.out.println(documentoOriginal);
        System.out.println(documentoClonado);
    }
}
