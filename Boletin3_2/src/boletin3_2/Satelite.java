
package boletin3_2;

/**
 * @author jborrajorodriguez
 */
   public class Satelite {
     private double meridiano;
     private double paralelo;
     private double distanciaTerra;
    
    public Satelite(){
        meridiano=0;
        paralelo=0;
        distanciaTerra=0;
    }
    
    public Satelite (double m,double p,double d){
        meridiano = m ;
        paralelo = p;
        distanciaTerra = d ;
    }
    public void verPosicion(){
    System.out.println("o satelite atopase no paralelo "+paralelo+"\nmeridiano "+meridiano+"\na unha distancia da terra "+distanciaTerra);
    }
}
