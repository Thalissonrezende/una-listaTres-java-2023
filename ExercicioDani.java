
package exerciciodani;

import java.util.Scanner;
public class ExercicioDani {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);    
    double num1,num2,media;
    System.out.println("Digite um numero!");
    num1= leia.nextDouble();
    System.out.println("Digite um segundo numero");
    num2= leia.nextDouble();
    media=((num1+num2)/2);
    System.out.print("A média entre os dois numeros é"+ media);
}
}