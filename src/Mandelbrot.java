
 package _2019330198_08;

import javax.swing.JPanel;

public class Mandelbrot extends Fractal{
    private double siz;
    
    public Mandelbrot(JPanel lienzo, int recursion, int siz){
        super(lienzo,recursion);
        this.siz = siz;
    }
    
    public void setEscala(int n, int m){
        tortuga.setEscala(n,m);
    }
    
    private void Mandel_recursivo(int nivel, double si){
        double unit = 0;
        if(nivel <= 0){
            tortuga.avanza(si);
        }else{
            unit = si / 4;
            Mandel_recursivo(nivel -1, unit);
            tortuga.izquierda(90);
            Mandel_recursivo(nivel -1, unit);
            tortuga.derecha(90);
            Mandel_recursivo(nivel -1, unit);
            tortuga.derecha(90);
            Mandel_recursivo(nivel -1, unit);
            Mandel_recursivo(nivel -1, unit);
            tortuga.izquierda(90);
            Mandel_recursivo(nivel -1, unit);
            tortuga.izquierda(90);
            Mandel_recursivo(nivel -1, unit);
            tortuga.derecha(90);
            Mandel_recursivo(nivel -1, unit);
        }
    }
    
    public void dibuja(){
        tortuga.setPosicion(-15,0);
        Mandel_recursivo(recursion, siz);
    }
}
