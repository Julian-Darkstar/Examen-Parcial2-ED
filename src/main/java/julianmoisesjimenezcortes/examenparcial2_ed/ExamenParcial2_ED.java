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
        int vidaUsuario = 100; 

        for (int i = 0; i < 4; i++) {
            int idMonstruo = (int) (Math.random() * 4); 
            Monstruos nuevoMonstruo = new Monstruos(idMonstruo);
            System.out.println("Monstruo generado: " + nuevoMonstruo.nombre);
            cola.encolarMonstruo(nuevoMonstruo);
        }

        cola.mostrarMonstruos();

        System.out.println("\nAtacando a los monstruos en orden:");

        while (!cola.colaMonstruos.isEmpty() && vidaUsuario > 0) {
            Monstruos monstruoActual = cola.desencolarMonstruo(); 

            int dañoRecibido = monstruoActual.atacarUsuario();
            vidaUsuario -= dañoRecibido;

            if (vidaUsuario > 0) {
                System.out.println("Vida restante del usuario: " + vidaUsuario);
            } else {
                System.out.println("El usuario ha sido derrotado.");
                break;
            }
        }

        if (vidaUsuario > 0) {
            System.out.println("El usuario ha derrotado a todos los monstruos y le queda " + vidaUsuario + " de vida.");
        } else {
            System.out.println("El usuario ha sido derrotado por los monstruos.");
        }
    }
}