package _2019330198_08;

import javax.swing.JPanel;

public class Abelson extends Fractal {
    private double tam;
    public Abelson(JPanel lienzo, int rec, double tam){
        super(lienzo, rec);
        this.tam = tam;
    }
    
    public void setEscala(int n, int m){
        this.tortuga.setEscala(n, m);
    }
    
    public void Abl(double si, int r){
        if(r <= 0){
            tortuga.avanza(si);
        }else{
            Abl(si, r-1);
            tortuga.derecha(90);
            Abl(si ,r -1);
            tortuga.izquierda(90);
        }
    }
    
    public void Abelson_grafica(double si ,int r){
        Abl(si, r);
    }
    
    @Override        
     void dibuja(){
         tortuga.setPosicion(0,10);
        Abelson_grafica(tam,recursion);
    }
}
