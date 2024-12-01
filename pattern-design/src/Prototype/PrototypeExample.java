/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prototype;

/**
 *
 * @author zagar
 */
interface Prototipo {
    Prototipo clonar();
}

class Vehiculo implements Prototipo {
    private String modelo;
    private int anio;

    public Vehiculo(String modelo, int anio) {
        this.modelo = modelo;
        this.anio = anio;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }

    @Override
    public Prototipo clonar() {
        return new Vehiculo(this.modelo, this.anio);
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "modelo='" + modelo + '\'' + ", anio=" + anio + '}';
    }
}

public class PrototypeExample {
    public static void main(String[] args) {
        Vehiculo vehiculoOriginal = new Vehiculo("Toyota Corolla", 2020);
        
        Vehiculo vehiculoClonado = (Vehiculo) vehiculoOriginal.clonar();
        
    
        System.out.println("Vehículo Original: " + vehiculoOriginal);
        System.out.println("Vehículo Clonado: " + vehiculoClonado);
        
        if (vehiculoOriginal != vehiculoClonado) {
            System.out.println("Los vehículos son instancias diferentes.");
        }
    }
}