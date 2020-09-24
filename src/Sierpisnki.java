package _2019330198_08;

import javax.swing.JPanel;
////////////////////////PENDIENTE////////////////
public class Sierpisnki extends Fractal{
    protected double siz;
    protected double diag;
    
    public Sierpisnki(JPanel lienzo, int recursion, int siz){
        super(lienzo,recursion);
        this.siz = siz;
        diag = siz / Math.sqrt(2);
    }
    
    public void setEscala(int n,int m){
        tortuga.setEscala(n, m);
    }
   
    private void Oneside(int nivel ){
        if(nivel <= 0){
            
        }else{
            Oneside(nivel -1);
            tortuga.derecha(45);
            tortuga.avanza(diag);
            tortuga.derecha(45);
            Oneside(nivel -1);
            tortuga.izquierda(90);
            tortuga.avanza(siz);
            tortuga.izquierda(90);
            Oneside(nivel -1);
            tortuga.derecha(45);
            tortuga.avanza(diag);
            tortuga.derecha(45);
            Oneside(nivel -1);
        }
    }
    
    private void Sierp(int nivel, double si){
        for(int i = 1; i<=4 ; i++){
            Oneside(nivel);
            tortuga.derecha(45);
            tortuga.avanza(diag);
            tortuga.derecha(45);
        }
        
    }
    
    @Override
    void dibuja(){
        tortuga.setPosicion(-20,10);
        Sierp(recursion, siz);
    }
}
