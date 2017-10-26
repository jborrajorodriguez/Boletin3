
package boletin3_1;

/**
 * @author jborrajorodriguez
 */
public class Coche {
  private int velocidade ;
  public Coche(){
  velocidade =0 ;  
  }
  public int getVelocidade(){
      return velocidade;
  }
   public void acelerar(int incremento){
       velocidade+=incremento;
   }
   public void frenar(int frenado){
       velocidade-=frenado;
   }
     
}
