/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package julianmoisesjimenezcortes.examenparcial2_ed;

/**
 *
 * @author PC
 */
public class Armas {
    int municion, daño, id;// id es utilizado para la generación aleatoria de armas durante un nivel.
    String tipoAtaque, nombre;    
    Armas(int id){
        if (id==0){
            nombre = "Puño";
            tipoAtaque = "T";//Tierra
            municion = 999999;
            daño = 5;
        }else if(id==1){
            nombre = "Pistola";
            tipoAtaque = "TA";//Tierra y aire
            municion = (int)(Math.random()*12+5);//Munición entre 5 y 12
            daño = 25;
        }else if(id==2){
            nombre = "Rifle";
            tipoAtaque = "TA";//Tierra y aire
            municion = (int)(Math.random()*30+5);//Munición entre 5 y 30
            daño = 25;
        }else if(id==3){
            nombre = "Uzi";
            tipoAtaque = "TA";//Tierra y aire
            municion = (int)(Math.random()*25+5);//Munición entre 5 y 25
            daño = 20;
        }else if(id==4){
            nombre = "Cuchillo";
            tipoAtaque = "T";//Tierra
            municion = 1;//Munición 1
            daño = 10;
        }else if(id==5){
            nombre = "Arco";
            tipoAtaque = "A";//Aire
            municion = (int)(Math.random()*6+1);//Munición entre 1 y 6
            daño = 20;
        }else if(id==6){
            nombre = "Granada";
            tipoAtaque = "T";//Tierra
            municion = (int)(Math.random()*3+1);//Munición entre 1 y 3
            daño = 40;
        }
    }
}
