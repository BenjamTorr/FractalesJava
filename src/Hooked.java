package _2019330198_08;

import javax.swing.JPanel;

public class Hooked extends Fractal {
    private double tamano;

    public Hooked(JPanel lienzo, int recursi, double tamano){
        super(lienzo,recursi);
        this.tamano = tamano;
    }
    public void setEscala(int n, int m){
        tortuga.setEscala(n,m);
    }
            
    public void dibuja(){
        tortuga.setPosicion(-10,-6);
        Rsnow(tamano, recursion);
    }

    private void Rsnow(double taman, int nivel) {
        if(nivel <= 0){
            tortuga.avanza(taman);
        }else{
            double unit = taman / 3;
            double sunit = taman * 2 * Math.sin(Math.PI/3) / 9;
            tortuga.izquierda(60);
            Lsnow(unit, nivel -1);
            Rsnow(unit, nivel -1);
            tortuga.derecha(60);
            Rsnow(unit, nivel -1);
            tortuga.derecha(60);
            Rsnow(unit, nivel -1);
            tortuga.derecha(150);
            Rsnow(sunit, nivel -1);
            Lsnow(sunit, nivel -1);
            tortuga.izquierda(60);
            Rsnow(sunit, nivel -1);
            tortuga.izquierda(60);
            Lsnow(sunit, nivel -1);
            Rsnow(sunit, nivel -1);
            tortuga.izquierda(90);
            Lsnow(unit, nivel -1);
            Rsnow(unit, nivel -1);
        }
    }

    private void Lsnow(double taman, int nivel) {
        if(nivel <= 0){
            tortuga.avanza(taman);
        }else{
            double unit = taman / 3;
            double sunit = taman * 2 * Math.sin(Math.PI/3) / 9;
            Lsnow(unit, nivel -1);
            Rsnow(unit, nivel -1);
            tortuga.derecha(90);
            Lsnow(sunit, nivel -1);
            Rsnow(sunit, nivel -1);
            tortuga.derecha(60);
            Lsnow(sunit, nivel -1);
            tortuga.derecha(60);
            Rsnow(sunit, nivel -1);
            Lsnow(sunit, nivel -1);
            tortuga.izquierda(150);
            Lsnow(unit, nivel -1);
            tortuga.izquierda(60);
            Lsnow(unit, nivel -1);
            tortuga.izquierda(60);
            Lsnow(unit, nivel -1);
            Rsnow(unit, nivel -1);
            tortuga.derecha(60);
        }
    }
}
