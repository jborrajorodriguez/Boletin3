package boletin3_3;
/**
 * @author jborrajorodriguez
 */
public class Circulo {
    private double radio;
    final double PI=3.14;
    
    public Circulo(){
        radio=0;
    }
    public Circulo(double radio){
        this.radio=radio;
    }
            
    public void setRadio(double radio){
        this.radio=radio;
    }
    public double getRadio(){
        return radio;
    }
    public double calculArea(){
        double Area = PI*Math.pow(radio, 2);
        return Area;
    }
    public double longitud(){
        double longitud=2*PI*radio;
        return longitud;
    }
}
