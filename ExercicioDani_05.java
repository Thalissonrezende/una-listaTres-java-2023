
package exerciciodani;

import java.util.Scanner;
public class ExercicioDani_05 {
    
    public static void main(String[]args){
        Scanner leia = new Scanner(System.in);
        float HorasTrab, ValorHora, SalarioFam, SalarioBruto;
        int Filhos ;
        System.out.println("Neste programa iremos calcular o valor do seu salário bruto recebido no mês.");
        System.out.print("Informe as horas trabalhadas por mês: ");
        HorasTrab = leia.nextFloat();
        System.out.print("Informe o valor recebido por hora: ");
        ValorHora = leia.nextFloat();
        System.out.print("Informe o salário da familia: ");
        SalarioFam = leia.nextFloat();
        System.out.print("Informe o número de filhos com idade menor de 14 anos: ");
        Filhos = leia.nextInt();
        SalarioBruto = (HorasTrab*ValorHora)+(SalarioFam*Filhos);
        System.out.println("O Salário Bruto é R$"+  SalarioBruto);
    }
}
