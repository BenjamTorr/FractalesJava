package _2019330198_08;

import javax.swing.JPanel;

public class Hilbert extends Fractal{
    private double tam;
    
    public Hilbert(JPanel lienzo, int recursion, double tam){
        super(lienzo,recursion);
        this.tam = tam;
    }
    public void setEscala(int n, int m){
        this.tortuga.setEscala(n, m);
    }
    
    private void Hil(int recursion, double tam, double ang){
        if(recursion <= 0){
            return;
        }else{
            tortuga.derecha(ang);
            Hil(recursion -1, tam, -ang);
            tortuga.avanza(tam);
            tortuga.izquierda(ang);
            Hil(recursion -1,tam, ang);
            tortuga.avanza(tam);
            Hil(recursion -1,tam,ang);
            tortuga.izquierda(ang);
            tortuga.avanza(tam);
            Hil(recursion -1, tam, -ang);
            tortuga.derecha(ang);
        
        }
    }
    
    private void Hilbert_recursivo(int recursion, double tam, double ang){
        Hil(recursion,tam,ang);
    }
    
    @Override
    void dibuja(){
        tortuga.setPosicion(-10,0);
        Hilbert_recursivo(this.recursion,tam,90);
    }
}
