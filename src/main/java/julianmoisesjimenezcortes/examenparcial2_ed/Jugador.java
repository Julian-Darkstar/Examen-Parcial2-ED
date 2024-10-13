/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package julianmoisesjimenezcortes.examenparcial2_ed;

/**
 *
 * @author jr667
 */
class Jugador {
    int vidas;
    String NombreJug;
     Jugador(String NombreJug, int vida){
         this.vidas = vidas;
         this.NombreJug = NombreJug;   
     }
      public void mostrarInfo() {
        System.out.println("Jugador: " + NombreJug + "\nVidas: " + vidas);
    }
}
