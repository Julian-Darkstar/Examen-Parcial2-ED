/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package julianmoisesjimenezcortes.examenparcial2_ed;

/**
 *
 * @author PC
 */
public class Armamento{
    private static class Nodo{
        Armas Arma;
        Nodo sig;
        public Nodo(Armas Arma){
            this.Arma = Arma;
            this.sig= null;
        }
    }
    
    //Primer elemento del armamento
    private Nodo head;
    
    //Constructor que inicializa la lista de armamento
    public Armamento(){
        head = null;
    }
    
    //Metodo para agregar armas al inventario
    public void agregarAInventario(Armas Arma){
        Nodo nuevaArma = new Nodo(Arma);
        if (head ==null){
            head = nuevaArma;
        }else{
            Nodo actual = head;
            while(actual.sig != null){
                actual = actual.sig;
            }
            actual.sig= nuevaArma;
        }
    }
    
    //Metodo para obtener el numero de aarmas en el inventario
    public int tamañoInvetario(){
        int cuenta = 0;
        Nodo actual = head;
        while(actual != null){
            cuenta++;
            actual = actual.sig;
        }
        return cuenta;
    }
    
    //Metodo para bucar un arma en el armamento
    public Armas obtenerArma(int lugar){
        int cuenta =0;
        Nodo actual = head;
        while(actual != null){
            if(cuenta == lugar){
                return actual.Arma;
            }
            cuenta++;
            return actual.Arma;
        }
        throw new IndexOutOfBoundsException("No tienes esa arma en el inventario");
    }
    
    //Metodo para quitar un arma del inventario
    public void quitarArma(int lugar){
        if (lugar==0){
            head=head.sig;
        }else{
            Nodo actual= head;
            for(int i=0; i<lugar-1; i++){
                actual = actual.sig;
            }
            actual.sig = actual.sig.sig;
        }
    }
    
    //Metodo para mostrar el armamento
    public void mostrarArmamento(){
        Nodo actual = head;
        int contador=0;
        while(actual!= null){
            contador++;
            System.out.println("Arma "+ contador+ ": " + actual.Arma.nombre + "\n");
            actual= actual.sig;
        }
    }
}
