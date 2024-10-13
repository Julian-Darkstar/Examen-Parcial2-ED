package julianmoisesjimenezcortes.examenparcial2_ed;

/**
 *
 * @authors Julián Moisés Jiménez Cortés, Jesus Rodriguez Romero, Christopher Joey Vidal Cervantes
 */
public class ExamenParcial2_ED {

    public static void main(String[] args) {
        
        System.out.println(" __       __                                  __                                          __    __                        __                         \n" +
"/  \\     /  |                                /  |                                        /  |  /  |                      /  |                        \n" +
"$$  \\   /$$ |  ______   _______    _______  _$$ |_     ______    ______    _______       $$ |  $$ | __    __  _______   _$$ |_     ______    ______  \n" +
"$$$  \\ /$$$ | /      \\ /       \\  /       |/ $$   |   /      \\  /      \\  /       |      $$ |__$$ |/  |  /  |/       \\ / $$   |   /      \\  /      \\ \n" +
"$$$$  /$$$$ |/$$$$$$  |$$$$$$$  |/$$$$$$$/ $$$$$$/   /$$$$$$  |/$$$$$$  |/$$$$$$$/       $$    $$ |$$ |  $$ |$$$$$$$  |$$$$$$/   /$$$$$$  |/$$$$$$  |\n" +
"$$ $$ $$/$$ |$$ |  $$ |$$ |  $$ |$$      \\   $$ | __ $$    $$ |$$ |  $$/ $$      \\       $$$$$$$$ |$$ |  $$ |$$ |  $$ |  $$ | __ $$    $$ |$$ |  $$/ \n" +
"$$ |$$$/ $$ |$$ \\__$$ |$$ |  $$ | $$$$$$  |  $$ |/  |$$$$$$$$/ $$ |       $$$$$$  |      $$ |  $$ |$$ \\__$$ |$$ |  $$ |  $$ |/  |$$$$$$$$/ $$ |      \n" +
"$$ | $/  $$ |$$    $$/ $$ |  $$ |/     $$/   $$  $$/ $$       |$$ |      /     $$/       $$ |  $$ |$$    $$/ $$ |  $$ |  $$  $$/ $$       |$$ |      \n" +
"$$/      $$/  $$$$$$/  $$/   $$/ $$$$$$$/     $$$$/   $$$$$$$/ $$/       $$$$$$$/        $$/   $$/  $$$$$$/  $$/   $$/    $$$$/   $$$$$$$/ $$/       \n" +
"                                                                                                                                                     \n" +
"                                                                                                                                                     ");
       
        System.out.println("\t\t _____ __   _ _______ _______  ______ _     _ _______ _______ _____  _____  __   _ _______ _______\n" +
"\t\t   |   | \\  | |______    |    |_____/ |     | |       |         |   |     | | \\  | |______ |______\n" +
"\t\t __|__ |  \\_| ______|    |    |    \\_ |_____| |_____  |_____  __|__ |_____| |  \\_| |______ ______|");
        
        
        System.out.println("\n\t\t\t\t -Selecciona un tipo de partida: Partida rapida o Partida Normal\n"
                          +"\t\t\t\t -Se generaran un armamento aleatorio de 5 armas e iran apareciendo \n"
                          +"\t\t\t\t  armas en cada ronda por las que podras intercambiar en tu armamento,  \n"
                          + "\t\t\t\t usarlas en el momento o guardarlas si tienes espacio en tu arsenal\n"
                          + "\t\t\t\t -Cada ronda tendra un numero de monstruos que aparecen, pero unicamente\n"
                          + "\t\t\t\t  puedes ver a 3 a la vez, asi que ten cuidado y usa tus armas sabiamente.\n"
                          + "\t\t\t\t -Tu personaje tiene una cantidad de vida limitada y los monstruos pueden atacarte,\n"
                          + "\t\t\t\t  si la vida de tu personaje llega a 0 la partida termina\n"
                          + "\t\t\t\t - Para ganar la partida, debes eliminar a todos los monstruos de todas las rondas\n"
                          + "\t\t\t\tantes de que tu vida llegue a 0\n\n"
                          + "\t\t\t\t\t\t Buena suerte cazador, la necesitaras.");
        
        System.out.println("¿INICIAR PARTIDA?");
        /**
        //Generacion de inventario aleatorio
        int IDArma;
        Armas NuevaArma;
        Armamento A1 = new Armamento();
        A1.agregarAInventario(NuevaArma= new Armas(0));
        for(int i=0; i<4; i++){
        IDArma = (int)(Math.random()*5+1);
         NuevaArma = new Armas(IDArma);
            System.out.println("Arma generada " + NuevaArma.nombre);
        A1.agregarAInventario(NuevaArma);
        }
        A1.mostrarArmamento();
        
        //Generacion de colas de monstruos
        ColaMonstruos cola = new ColaMonstruos();
        int vidaUsuario = 100; 

        for (int i = 0; i < 4; i++) {
            int idMonstruo = (int) (Math.random() * 4); 
            Monstruos nuevoMonstruo = new Monstruos(idMonstruo);
            System.out.println("Monstruo generado: " + nuevoMonstruo.nombre);
            cola.encolarMonstruo(nuevoMonstruo);
        }

        cola.mostrarMonstruos();

        //Sistema de ataques
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
        }**/
    }
}