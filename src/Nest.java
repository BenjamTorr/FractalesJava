package _2019330198_08;

import javax.swing.JPanel;

public class Nest extends Fractal {
    private double tamano;
    
    public Nest(JPanel lienzo ,int recursi, double tamano){
        super(lienzo, recursi);
        this.tamano = tamano;
    }
    
    public void setEscala(int n, int m){
        tortuga.setEscala(n, m);
    }
    
    public void Nested(int nivel, double taman){
        if(nivel > 0){
            for(int i= 1; i<=3 ; i++){
                Nested(nivel -1, taman/2);
                tortuga.avanza(taman);
                tortuga.derecha(120);
            }
        }
    }
    
    public void dibuja(){
        tortuga.setPosicion(-10,10);
        Nested(recursion, tamano);
    }
}
