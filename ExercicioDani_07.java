
package exerciciodani;

import java.util.Scanner;
public class ExercicioDani_07 {
    public static void main(String[]args){
        Scanner leia = new Scanner(System.in);
        
       double salario, vendas, porcent,salariototal;
        System.out.println("Informe o seu salário");
        salario = leia.nextDouble();
        System.out.println("Informe o valor de vendas no mês bonificação de 10%");
        vendas = leia.nextDouble();
        
        porcent = vendas*10/100;
        salariototal = porcent+salario;
        System.out.println("Seu salário é de " + salariototal);    }


        
}
