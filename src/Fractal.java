package _2019330198_08;

import javax.swing.JPanel;

abstract public class Fractal {
    protected int recursion;
    protected double angulo;
    public Logo tortuga;
    protected double a;
    
    public Fractal(JPanel lienzo, int recursion){
        tortuga = new Logo(lienzo);
        this.recursion = recursion;
    }
    
    public void setAngulo(double angle){
        this.angulo = angle;
    }
    
    public Fractal(JPanel lienzo, double x, double y, double grados, int recursion){
        tortuga = new Logo(lienzo,x,y,grados);
        this.recursion = recursion;    
    }
    public Fractal(){
        tortuga = new Logo();
        recursion = 5;
    }
    public void setPantalla(JPanel lienzo){
        tortuga.setPantalla(lienzo);
    }
    
    public void setRecursion(int recursion){
        this.recursion = recursion;
    }
    
    public void setA(double tam){
        this.a = tam;
    }
    
    public void posicion(double x, double y){
        tortuga.setPosicion(x, y);
    }
    
    public void actualiza(){
        tortuga.setCentro();
    }
    public void reinicia(){
        tortuga.reinicia();
    }
    public void izqueierda(double grados){
        tortuga.izquierda(grados);
    }
    public void derecha(double grados){
        tortuga.derecha(grados);
    }
    abstract void dibuja();
    
}
