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
class Jugador {
    Scanner scanner = new Scanner(System.in); 
    String NombreJug = scanner.nextLine();
    int Hp = 100;
    
     Jugador(String NombreJug, int Hp){ 
         this.NombreJug = NombreJug; 
         this.Hp = Hp;
     }
      public void mostrarInfo() {
        System.out.println("Jugador: " + NombreJug + "\nPuntos de salud: " + Hp);
    }
}
