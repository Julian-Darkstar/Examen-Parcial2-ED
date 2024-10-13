/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package julianmoisesjimenezcortes.examenparcial2_ed;

/**
 *
 * @author jr667
 */
public class Ronda {
    private int numeroDeRondas;
    private Jugador jugador;
    private Monstruos[] monstruos;
    private int tope;  // Simula el tope de la pila

    public Ronda(int numeroDeRondas, Jugador jugador, Monstruos[] monstruos) {
        this.numeroDeRondas = numeroDeRondas;
        this.jugador = jugador;
        this.monstruos = monstruos;
        this.tope = -1;  // La pila empieza vacía
    }

    // Empuja (push) una ronda a la "pila"
    public void pushRonda(Monstruos monstruo) {
        if (tope < monstruos.length - 1) {
            tope++;
            monstruos[tope] = monstruo;
            System.out.println("Se añade a la pila el monstruo: " + monstruos.getNombre());
        } else {
            System.out.println("No se puede añadir más monstruos, pila llena.");
        }
    }

    // Extrae (pop) una ronda de la "pila"
    public Monstruos popRonda() {
        if (tope >= 0) {
            Monstruos monstruo = monstruos[tope];
            tope--;
            return monstruo;
        } else {
            System.out.println("La pila está vacía.");
            return null;
        }
    }
}

   
