
package _2019330198_08;

import javax.swing.JPanel;


public class Dragon extends Fractal {
    protected double distancia;
    
    public Dragon(JPanel lienzo, int recurs, double distancia){
        super(lienzo,recurs);
        this.distancia = distancia;
    }
    public void setDistancia(double distancia){
        this.distancia = distancia;
    }
  
    public void setEscala(int n, int m){
        tortuga.setEscala(n, m);
    }
    
    public void Dragon(int recursividad, double tamano){
        posicion(-5,-30.0);
    //    this.tortuga.setPluma(true);
        LDragon_recursivo(recursividad, tamano);
        
    }
    
    public void LDragon_recursivo(int recursividad, double tamano){
        if(recursividad <= 0){
            this.tortuga.avanza(tamano);
        }else{
            LDragon_recursivo(recursividad -1, tamano);
            this.tortuga.izquierda(90);
            RDragon_recursivo(recursividad -1, tamano);
        }
    }
  
    public void RDragon_recursivo(int recursividad, double tamano) {
        if(recursividad <= 0){
            this.tortuga.avanza(tamano);
        }else{
            LDragon_recursivo(recursividad -1, tamano);
            this.tortuga.derecha(90);
            RDragon_recursivo(recursividad -1, tamano);
        }
    }
  
    @Override
    void dibuja(){
       Dragon(recursion, distancia);
       //this.tortuga.avanza(20);
    }
}
