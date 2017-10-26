
package boletin3_3;

/**
 * @author jborrajorodriguez
 */
public class Boletin3_3 {
    public static void main(String[] args) {
        Circulo circulo=new Circulo();
        circulo.setRadio(15);//se le da el valor 15 al radio.
        System.out.println("Valor del radio = "+circulo.getRadio());//Devuelve el valor del radio.
        System.out.println("Valor del area = "+circulo.calculArea());//Devuelve el valor del área.
        System.out.println("Valor de la longitud = "+circulo.longitud());//Devuelve el valor de la longitud.
        Circulo circuloVacio=new Circulo();
        System.out.println("Valor del radio por defecto = "+circuloVacio.getRadio());//Utilizamos los constructores por defecto y visualizamos.
    }
    
}
