/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package julianmoisesjimenezcortes.examenparcial2_ed;

import java.util.Scanner;

/**
 *
 * @author jr667
 */
public class Ronda {
    Scanner scanner = new Scanner(System.in);
    private int numeroDeRondas = scanner.nextInt();
    private Jugador jugador;
    private Monstruos[] monstruos;
    int NumRonda = 0;
    private int tope;  // Simula el tope de la pila

    //Constructor para el numero de rondas
    public Ronda(int numeroDeRondas, Jugador jugador, Monstruos[] monstruos, int NumRonda) {
        this.numeroDeRondas = numeroDeRondas;
        this.jugador = jugador;
        this.monstruos = monstruos;
        this.tope = -1;  // La pila empieza vacía
    }
    
    public void iniciarRondas(Monstruos Monstruo) {
        int NumRonda = 0;
        while (NumRonda < numeroDeRondas) {
            // Aquí puedes añadir la lógica que deseas ejecutar en cada ronda
            pushRonda(Monstruo);
            NumRonda++;
        }
    }
    
       
         // Empuja (push) una ronda a la "pila"
        public void pushRonda(Monstruos monstruo) {
            if (tope < monstruos.length - 1) {
                 tope++;
                monstruos[tope] = monstruo;
                System.out.println("Se añade a la pila el monstruo: " );
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


   
