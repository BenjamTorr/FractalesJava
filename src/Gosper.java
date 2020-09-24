package _2019330198_08;

import javax.swing.JPanel;

public class Gosper extends Fractal{
    private double segmento;
    private final double SEG = 1 / Math.sqrt(7);
    
    public Gosper(JPanel lienzo, int recursion_ , double segmento){
        super(lienzo,recursion_);
        this.segmento = segmento;
    }
    
    public void setEscala(int n, int m){
        tortuga.setEscala(n, m);
    }
    
    private void Gosper(int nivel, double lon){
        double seg = 1 / Math.sqrt(7);
        RGosper(nivel, lon);
    }
    


    private void RGosper(int nivel, double lon) {
        double unit;
        if(nivel <= 0){
            tortuga.avanza(lon);
        }else{
            unit = lon * SEG; 
            tortuga.derecha(75);
            LGosper(nivel -1, unit);
            tortuga.izquierda(60);
            RGosper(nivel -1, unit);
            RGosper(nivel -1, unit);
            tortuga.izquierda(120);
            RGosper(nivel -1, unit);
            tortuga.izquierda(60);
            LGosper(nivel -1, unit);
            tortuga.derecha(120);
            LGosper(nivel -1, unit);
            tortuga.derecha(60);
            RGosper(nivel -1, unit);
            tortuga.izquierda(15);
        
        }
    }
    
    void dibuja(){
        tortuga.setPosicion(-10, 0);
        RGosper(recursion, segmento);
    }

    private void LGosper(int nivel, double lon) {
        double unit = 0;
        if(nivel <=0){
            tortuga.avanza(lon);
        }else{
            unit = lon * SEG;
            tortuga.derecha(15);
            LGosper(nivel -1, unit);
            tortuga.izquierda(60);
            RGosper(nivel -1, unit);
            tortuga.izquierda(120);
            RGosper(nivel -1, unit);
            tortuga.derecha(60);
            LGosper(nivel -1, unit);
            tortuga.derecha(120);
            LGosper(nivel -1, unit);
            LGosper(nivel -1, unit);
            tortuga.derecha(60);
            RGosper(nivel -1, unit);
            tortuga.izquierda(75);
        }
    }
    
}   
