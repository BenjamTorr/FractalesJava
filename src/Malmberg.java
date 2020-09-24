package _2019330198_08;

import javax.swing.JPanel;

public class Malmberg extends Fractal {
    private final boolean weave = false;
    private final boolean maze = true;
    private double tam;
    private boolean who;
    private int parity;
    
    public Malmberg(JPanel lienzo, int recursi, int tam, boolean choice){
        super(lienzo, recursi);
        this.tam = tam;
        who = choice;
        parity = -1;
    }
    
    public void SetEscala(int n, int m){
        tortuga.setEscala(n,m);
    }
    
    private void maze_recursivo(double t, double nivel){
        double unit = 0;
        if(nivel <= 0){
            interior(t);
        }else{
            unit = t / 3;
            maze_recursivo(unit, nivel -1);
            tortuga.izquierda(90);
            maze_recursivo(unit, nivel -1);
            for(int i=0 ; i<2 ; i++){
               tortuga.derecha(90);
               maze_recursivo(unit, nivel -1);   
            }
            for(int i=0 ; i<3 ; i++){
                tortuga.izquierda(90);
                maze_recursivo(unit, nivel -1);
            }
            tortuga.derecha(90);
            maze_recursivo(unit, nivel -1);
        }
    }
    
    
    
    public void dibuja(){
        maze_recursivo(tam, recursion);
    }

    private void interior(double t) {
        parity = -parity;
        double unit = t/5;
        if(who){
            parity = 1;
            tortuga.izquierda(45);
        }
        tortuga.avanza(4 * unit);
        tortuga.derecha(90*parity);
        tortuga.avanza(3 * unit);
        tortuga.derecha(90 * parity);
        tortuga.avanza(2 * unit);
        tortuga.derecha(90 * parity);
        tortuga.avanza(unit);
        tortuga.derecha(90*parity);
        tortuga.avanza(unit);
        tortuga.izquierda(90 * parity);
        tortuga.avanza(unit);
        tortuga.izquierda(90 * parity);
        tortuga.avanza(2*unit);
        tortuga.izquierda(90 * parity);
        tortuga.avanza(3 * unit);
        tortuga.izquierda(90 * parity);
        tortuga.avanza(4 * unit);
        tortuga.izquierda(90 * parity);
        tortuga.avanza(4 * unit);
        tortuga.derecha( 90 * parity);
        if(who){
            tortuga.derecha(90);
            tortuga.avanza(4 * unit);
            tortuga.izquierda(45);
        }
        
        
        
    }
}
