package julianmoisesjimenezcortes.examenparcial2_ed;

import java.util.LinkedList;
import java.util.Queue;

public class Monstruos {
    int vida, id; 
    String tipoMonstruo, nombre;

    Monstruos(int id) {
        this.id = id;
        switch (id) {
            case 0:
                nombre = "Trasgo";
                tipoMonstruo = "Tierra";
                vida = (int) (Math.random() * 6 + 3); 
                break;
            case 1:
                nombre = "Gárgola";
                tipoMonstruo = "Aire";
                vida = (int) (Math.random() * 31 + 60); 
                break;
            case 2:
                nombre = "Orco";
                tipoMonstruo = "Tierra";
                vida = (int) (Math.random() * 81 + 120); 
                break;
            case 3:
                nombre = "Dragón";
                tipoMonstruo = "Tierra y Aire";
                vida = (int) (Math.random() * 301 + 300); 
                break;
            default:
                nombre = "Desconocido";
                tipoMonstruo = "N/A";
                vida = 0;
                break;
        }
    }

    public int atacarUsuario() {
        int daño;
        switch (nombre) {
            case "Trasgo":
                daño = (int) (Math.random() * 3 + 2); 
                break;
            case "Gárgola":
                daño = (int) (Math.random() * 10 + 10); 
                break;
            case "Orco":
                daño = (int) (Math.random() * 20 + 20);
                break;
            case "Dragón":
                daño = (int) (Math.random() * 30 + 50); 
                break;
            default:
                daño = 0;
                break;
        }
        System.out.println(nombre + " ataca al usuario con " + daño + " de daño.");
        return daño;
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

    public void encolarMonstruo(Monstruos monstruo) {
        colaMonstruos.add(monstruo);
    }

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