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
        
        ColaMonstruos cola = new ColaMonstruos();

        // Generar aleatoriamente 4 monstruos y encolarlos
        for (int i = 0; i < 4; i++) {
            int idMonstruo = (int) (Math.random() * 4); // Generar un ID aleatorio entre 0 y 3
            Monstruos nuevoMonstruo = new Monstruos(idMonstruo);
            System.out.println("Monstruo generado: " + nuevoMonstruo.nombre);
            cola.encolarMonstruo(nuevoMonstruo);
        }

        // Mostrar los monstruos en la cola
        cola.mostrarMonstruos();

        System.out.println("\nAtacando a los monstruos en orden:");
        while (!cola.colaMonstruos.isEmpty()) {
            cola.desencolarMonstruo(); 
        }
    }
}