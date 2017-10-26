
package boletin3_1;

/**
 * @author jborrajorodriguez
 */
public class Boletin3_1 {

    public static void main(String[] args) {
        Coche coche=new Coche();//crear objecto.
        System.out.println("Velocidad actual = "+coche.getVelocidade());
        coche.acelerar(100);//se introduce el valor 100 para subir velocidade.
        System.out.println("Incremento a la velocidad = "+coche.getVelocidade());
        coche.frenar(25);//se introduce el valor 25 para diminuir velocidade.
        System.out.println("Diminuir velocidade = "+coche.getVelocidade());
       
    }
    
}
