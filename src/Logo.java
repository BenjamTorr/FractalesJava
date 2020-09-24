package _2019330198_08;

import javax.swing.JPanel;
import java.awt.Graphics;

public class Logo {
    private final boolean ARRIBA = false;
    private final boolean ABAJO = true;
    private int MidX,MidY;
    private double x,y,x0,y0;
    private double grados, grados0;
    private final double CONVERSION = Math.PI/180;
    private int Escala_x,Escala_y;
    private JPanel pantalla;
    private boolean pluma;
    
    public Logo(){
        pantalla = null;
        x=y=x0=y0=0.0;
        pluma = true;
        Escala_x=3;
        Escala_y=3;
        grados = grados0 = 0;
    }
    public Logo(JPanel lienzo){
        x = y = x0 = y0 = 0.0;
        pantalla = lienzo;
        pluma = true;
        Escala_x = 3;
        Escala_y = 3;
        grados = grados0 = 0;
        MidX = pantalla.getWidth()/2;
        MidY = pantalla.getHeight()/2;
    }
    
    public Logo(JPanel lienzo, double x, double y, double grados){
        this.x = x0 = x;
        this.y = y0 = y;
        pantalla = lienzo;
        this.grados = this.grados0 = grados;
        Escala_x = 3;
        Escala_y = 3;
        MidX = pantalla.getWidth()/2;
        MidY = pantalla.getHeight()/2;
    }
    
    public void setEscala(int k1, int k2){
        Escala_x = k1;
        Escala_y = k2;
    }
    
    public void setPantalla(JPanel pantalla){
        this.pantalla = pantalla;
        MidX = pantalla.getWidth();
        MidY = pantalla.getHeight();
    }
    
    public void setCentro(){
        MidX = pantalla.getWidth()/2;
        MidY = pantalla.getHeight()/2;
    }
    
    public void setPosicion(double x, double y){
        this.x = x;
        this.y = y;
    }
    public void reinicia(){
        x = x0;
        y = y0;
        direccion(grados0);
    }
    
    public void setPluma(boolean nueva){
        pluma = nueva;
    }
    
    public void linea(double x1, double y1, double x2, double y2){
        pantalla.getGraphics().drawLine((int)(MidX + Escala_x*x1),(int)(MidY -Escala_y*y1),(int)(MidX + Escala_x*x2),(int)(MidY - Escala_y*y2));
    }
 
    public void avanza(double distancia){
        double x1 = x;
        double y1 = y;
        double grad = grados*CONVERSION;
        x += distancia*Math.cos(grad);
        y += distancia*Math.sin(grad);
        
        if(pluma == true){
            this.linea(x1,y1,x,y);
        }
    }
    
    public void direccion(double grados){
        this.grados = grados;
        grados0 = grados;
    }
    
    public void retrocede(double distancia){
        avanza(-distancia);
    }
    public void derecha(double angulo){
        grados -= angulo;
    }
    
    public void izquierda(double angulo){
        grados += angulo;
    }
}
