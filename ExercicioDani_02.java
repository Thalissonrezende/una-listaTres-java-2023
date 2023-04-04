
package exerciciodani;

import java.util.Scanner;
public class ExercicioDani_02{


   public static void main(String[] args) {                     
    Scanner leia = new Scanner(System.in);
    double preço,novopreço;
    System.out.println("Qual o preço do produto?");
    preço = leia.nextDouble();
    novopreço = preço+(preço*0.10);
    System.out.println("O novo preço do produto é"+ novopreço);
   }
}