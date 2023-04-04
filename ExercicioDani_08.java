
package exerciciodani;

import java.util.Scanner;
public class ExercicioDani_08 {
    
    public static void main(String[]args){
        Scanner leia = new Scanner(System.in);
              double veiculos, rodas, carros, carros2,carros3,moto;
        System.out.println("informe a quantidade de veiculos");
        veiculos = leia.nextDouble();
        System.out.println("informe a quantidade de rodas");
        rodas = leia.nextDouble();
        carros = veiculos *(-2);
        carros2 = carros + rodas;
        carros3 = carros2/2;
  
        moto = veiculos - carros3;
      
        System.out.println("Temos um total de "+veiculos+" veiculos, sendo eles " + carros3 +" carros "+ " e "+ moto + " motos");
        
}
}


