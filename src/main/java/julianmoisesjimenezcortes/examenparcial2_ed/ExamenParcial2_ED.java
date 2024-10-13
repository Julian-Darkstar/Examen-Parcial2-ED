/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package julianmoisesjimenezcortes.examenparcial2_ed;

/**
 *
 * @authors Julián Moisés Jiménez Cortés, Jesus Rodriguez Romero, Christopher Joey Vidal Cervantes
 */
public class ExamenParcial2_ED {

    public static void main(String[] args) {
        
        //Generacion de inventario aleatorio
        int IDArma;
        Armas NuevaArma;
        Armamento A1 = new Armamento();
        A1.agregarAInventario(NuevaArma= new Armas(0));
        for(int i=0; i<4; i++){
        IDArma = (int)(Math.random()*5+1);
         NuevaArma = new Armas(IDArma);
            System.out.println("Arma generada" + NuevaArma.nombre);
        A1.agregarAInventario(NuevaArma);
        }
        A1.mostrarArmamento();
        
        PilaMonstruos pila = new PilaMonstruos();

        Monstruos trasgo = new Monstruos("Trasgo", "Tierra", (int) (Math.random() * 6 + 3)); // Vida entre 3 y 8
        Monstruos gargola = new Monstruos("Gárgola", "Aire", (int) (Math.random() * 31 + 60)); // Vida entre 60 y 90
        Monstruos orco = new Monstruos("Orco", "Tierra", (int) (Math.random() * 81 + 120)); // Vida entre 120 y 200
        Monstruos dragon = new Monstruos("Dragón", "Tierra y Aire", (int) (Math.random() * 301 + 300)); // Vida entre 300 y 600

        
        pila.apilarMonstruo(trasgo);
        pila.apilarMonstruo(gargola);
        pila.apilarMonstruo(orco);
        pila.apilarMonstruo(dragon);

        // Mostrar los monstruos en la pila
        pila.mostrarMonstruos();
    }
}
