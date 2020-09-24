package _2019330198_08;

import javax.swing.JPanel;

public class Koch extends Fractal{
    private double segmento;
    
    public Koch(JPanel lienzo, int recursividad, double segmento){
        super(lienzo, recursividad);
        this.segmento = segmento;
    }
    
    public void setEscala(int n, int m){
        tortuga.setEscala(n,m);
    }
    
    public void Koch_main(int recursi, double l){
        
        if(recursi <= 0){
            tortuga.avanza(l);
        }else{
            double l1 = l/3;
            Koch_main(recursi -1, l1);
            tortuga.izquierda(60);
            Koch_main(recursi -1, l1);
            tortuga.derecha(120);
            Koch_main(recursi -1, l1);
            tortuga.izquierda(60);
            Koch_main(recursi -1, l1);
        }
    }
    
    public void dibuja(){
        tortuga.setPosicion(-10,0);
        Koch_main(recursion,segmento);
    }
}
