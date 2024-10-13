/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package julianmoisesjimenezcortes.examenparcial2_ed;

import java.util.LinkedList;
import java.util.Queue;

public class Monstruos {
    int vida, id; // id para identificar el tipo de monstruo
    String tipoMonstruo, nombre;

    Monstruos(int id) {
        this.id = id;
        switch (id) {
            case 0:
                nombre = "Trasgo";
                tipoMonstruo = "Tierra";
                vida = (int) (Math.random() * 6 + 3); // Vida entre 3 y 8
                break;
            case 1:
                nombre = "Gárgola";
                tipoMonstruo = "Aire";
                vida = (int) (Math.random() * 31 + 60); // Vida entre 60 y 90
                break;
            case 2:
                nombre = "Orco";
                tipoMonstruo = "Tierra";
                vida = (int) (Math.random() * 81 + 120); // Vida entre 120 y 200
                break;
            case 3:
                nombre = "Dragón";
                tipoMonstruo = "Tierra y Aire";
                vida = (int) (Math.random() * 301 + 300); // Vida entre 300 y 600
                break;
            default:
                nombre = "Desconocido";
                tipoMonstruo = "N/A";
                vida = 0;
                break;
        }
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Tipo: " + tipoMonstruo + ", Vida: " + vida);
    }
}

class ColaMonstruos {
    Queue<Monstruos> colaMonstruos;

    public ColaMonstruos() {
        colaMonstruos = new LinkedList<>();
    }

    // Método para agregar monstruos a la cola
    public void encolarMonstruo(Monstruos monstruo) {
        colaMonstruos.add(monstruo);
    }

    // Método para atacar y eliminar el monstruo que está al frente de la cola
    public Monstruos desencolarMonstruo() {
        if (!colaMonstruos.isEmpty()) {
            Monstruos monstruoAtacado = colaMonstruos.poll();
            System.out.println("Atacando a: " + monstruoAtacado.nombre);
            return monstruoAtacado;
        } else {
            System.out.println("Ya no hay monstruos.");
            return null;
        }
    }

    // Método para mostrar los monstruos en la cola
    public void mostrarMonstruos() {
        if (colaMonstruos.isEmpty()) {
            System.out.println("No hay monstruos en la cola.");
        } else {
            System.out.println("Monstruos en la cola (orden de ataque):");
            for (Monstruos monstruo : colaMonstruos) {
                monstruo.mostrarInfo();
            }
        }
    }
}