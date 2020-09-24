package _2019330198_08;

import javax.swing.JPanel;

public class AbelCornered extends Fractal {
    private double limit;
//    private double siz;
//    private double ang;
    
    public AbelCornered(JPanel lienzo, int recu, double angle, double l, double tam){
        super(lienzo, recu);
        this.limit = l;
        this.angulo = angle;
        
        this.a = tam;
    }
    
    public void setAngle(double angle){
        this.angulo = angle;
    }
    
    public void setEscala(int n , int m){
        tortuga.setEscala(n,m);
    }
    
    private void Corner(double s, double angle){
        CornerPoly(s,angle,0);
    }
    
    private void CornerPoly(double s, double angle, double total){
        if(s <= limit){//
            
        }else{
            CornerPolyStep(s,angle);
            total += angle;
            if( total % 360 != 0){
                CornerPoly(s,angle,total);
            }
        }
    }
    
    
    
    @Override
    public void dibuja(){
        Corner(a, angulo );
    }

    private void CornerPolyStep(double s, double angle) {
        tortuga.avanza(s);
        CornerPoly(s / 2, -angle, 0);
        tortuga.derecha(angle);
    }
}
