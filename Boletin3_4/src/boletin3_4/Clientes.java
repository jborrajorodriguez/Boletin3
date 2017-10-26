package boletin3_4;

/**
 *
 * @author Juan
 */
public class Clientes {
   private int polbo;
   private int patacas;
   private int clientes;
   
  public Clientes(){
      polbo=0;
      patacas=0;
  }
  
 
  public void setPolbo(int polbo){
      this.polbo=polbo;//valor inicial del polbo en el restaurante
  }
  public int getPolbo(){
      return polbo;
  }
  
  public void setPatacas(int patacas){
      this.patacas=patacas;//valor inicial de patacas en el restaurante
  }
  
  public int getPatacas(){
      return patacas;
  }
  public void engadirPolbo(int masPolbo){
      polbo+=masPolbo;
  }
  public void engadirPatacas(int masPatacas){
      patacas+=masPatacas;
  }
  public int amosaPolbo(){
      return polbo;
  }
  public int amosarPatacas(){
      return patacas;
  }
  /*public double tatalClientes(){
    double totalClientes=(patacas+(polbo));
    return totalClientes;
  }
  
  public int totalClientes(){
      totalClientes=patacas polbo 
  }
*/


}
