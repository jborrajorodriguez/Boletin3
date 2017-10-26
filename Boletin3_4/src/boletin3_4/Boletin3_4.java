package boletin3_4;

import java.util.Scanner;

/**
 * @author Juan
 */
public class Boletin3_4 {

    public static void main(String[] args) {
       Clientes polbo=new Clientes();
       Clientes patacas=new Clientes();
       System.out.println("Cantidad inicial de polbo = "+polbo.getPolbo()+"kg");//mostrar la cantidad inicial de polbo en el almacen
       System.out.println("Cantidad inicial de patacas = "+patacas.getPatacas()+"kg");//mostrar la cantidad inicial de patacas.
       Scanner teclado=new Scanner(System.in);
       //polbo.engadirPolbo(10);//valor añadido de polbo
       System.out.println("Introducir cantidad a añadir de polbo");
       int masPolbo=teclado.nextInt();//introducir los valores para aumentar pulpo por teclado.
       polbo.engadirPolbo(masPolbo);
       System.out.println("kilos de polbo en el almacen = "+polbo.amosaPolbo()+"kg");
       //patacas.engadirPatacas(6);//valor añadido de patacas
       System.out.println("Introducir cantidad a añadir de patacas");
       int masPatacas=teclado.nextInt();
       patacas.engadirPatacas(masPatacas);
       System.out.println("Kilos de patatas en el almacen = "+patacas.amosarPatacas()+"kg");
       //Clientes totalCliente=new Clientes();
       // System.out.println("Total de clientes = "+totalCliente.tatalClientes());
      
    }
    
}
