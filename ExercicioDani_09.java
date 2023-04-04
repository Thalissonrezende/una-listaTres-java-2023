
package exerciciodani;

import java.util.Scanner;
public class ExercicioDani_09 {
    
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
       int segundosInf;
       System.out.println("informe os segundos");
       segundosInf = input.nextInt();
       int segundos = segundosInf;
       int horas = segundos / 3600;
       segundos %= 3600;
       int minutos = segundos / 60;
       segundos %= 60;
       System.out.print("Tempo total:");
if (horas > 0)
       System.out.printf(" %d horas", horas);
if (minutos > 0)
       System.out.printf(" %d minutos", minutos);
if (segundos > 0)
       System.out.printf(" %d segundos", segundos);
    }
    
}


