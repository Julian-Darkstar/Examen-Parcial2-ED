package julianmoisesjimenezcortes.examenparcial2_ed;

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
                daño = (int) (Math.random() * 3 + 2); // Daño entre 2 y 5
                break;
            case "Gárgola":
                daño = (int) (Math.random() * 10 + 10); // Daño entre 10 y 20
                break;
            case "Orco":
                daño = (int) (Math.random() * 20 + 20); // Daño entre 20 y 40
                break;
            case "Dragón":
                daño = (int) (Math.random() * 30 + 50); // Daño entre 50 y 80
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
    private static class Nodo {
        Monstruos monstruo;
        Nodo siguiente;

        public Nodo(Monstruos monstruo) {
            this.monstruo = monstruo;
            this.siguiente = null;
        }
    }

    private Nodo front, rear; 
    public ColaMonstruos() {
        this.front = this.rear = null;
    }

    public void encolarMonstruo(Monstruos monstruo) {
        Nodo nuevoNodo = new Nodo(monstruo);
        if (this.rear == null) { 
            this.front = this.rear = nuevoNodo;
        } else {
            this.rear.siguiente = nuevoNodo; 
            this.rear = nuevoNodo;
        }
        System.out.println(monstruo.nombre + " ha sido agregado a la cola.");
    }

    public Monstruos desencolarMonstruo() {
        if (this.front == null) {
            System.out.println("No hay monstruos en la cola.");
            return null;
        }
        Monstruos monstruoAtacado = this.front.monstruo;
        this.front = this.front.siguiente; 
        if (this.front == null) { 
            this.rear = null;
        }
        System.out.println("Atacando a: " + monstruoAtacado.nombre);
        return monstruoAtacado;
    }
    public void mostrarMonstruos() {
        if (this.front == null) {
            System.out.println("No hay monstruos en la cola.");
            return;
        }
        Nodo actual = this.front;
        System.out.println("Monstruos en la cola (orden de ataque):");
        while (actual != null) {
            actual.monstruo.mostrarInfo();
            actual = actual.siguiente;
        }
    }

    public boolean estaVacia() {
        return front == null;
    }
}