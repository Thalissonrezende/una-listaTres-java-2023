
package exerciciodani;

import java.util.Scanner;
public class ExercicioDani_03 {
    
    public static void main(String[] args){
    Scanner leia = new Scanner(System.in);
   float fahrenheit, celsius;
System.out.println("Diga a temperatura em fahrenheit e vamos converter em celsius");
System.out.println("Qual a temperatura em fahrenheit?");
fahrenheit = leia.nextFloat();
celsius = ((fahrenheit-32)*5/9);
System.out.println("A temperatura em Celsius é " + celsius);
}
}