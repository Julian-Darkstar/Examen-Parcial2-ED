/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package julianmoisesjimenezcortes.examenparcial2_ed;

import java.util.Stack;

public class Monstruos {
    int vida;
    String tipoMonstruo, nombre;

    Monstruos(String nombre, String tipoMonstruo, int vida) {
        this.nombre = nombre;
        this.tipoMonstruo = tipoMonstruo;
        this.vida = vida;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Tipo: " + tipoMonstruo + ", Vida: " + vida);
    }
}

class PilaMonstruos {
    Stack<Monstruos> pilaMonstruos;

    public PilaMonstruos() {
        pilaMonstruos = new Stack<>();
    }

    // Método para apilar los monstruos
    public void apilarMonstruo(Monstruos monstruo) {
        pilaMonstruos.push(monstruo);
    }

    // Método para desapilar el monstruo más amenazante
    public Monstruos desapilarMonstruo() {
        if (!pilaMonstruos.isEmpty()) {
            return pilaMonstruos.pop();
        } else {
            System.out.println("No hay monstruos en la pila.");
            return null;
        }
    }

    // Método para mostrar los monstruos en la pila
    public void mostrarMonstruos() {
        if (pilaMonstruos.isEmpty()) {
            System.out.println("No hay monstruos en la pila.");
        } else {
            System.out.println("Monstruos en la pila (de mayor a menor amenaza):");
            for (Monstruos monstruo : pilaMonstruos) {
                monstruo.mostrarInfo();
            }
        }
    }
}