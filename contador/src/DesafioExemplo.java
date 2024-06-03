/* 
Realizar o cálculo de imposto de salário a partir de entradas do usuário
(valor bruto do salário - percentual de imposto mediante ao salário) + adicional de benefícios
alíquotas:
de R$0 a R$1100,00 = 5%
de R$1100,00 a R$2500,00 = 10%
maior que R$2500,00 = 15%
*/

import java.util.Scanner;

public class DesafioExemplo {

    public static void main(String[] args) {
        //le os valores de entrada
        Scanner leitorDeEntrada = new Scanner(System.in);

        float valorSalario = leitorDeEntrada.nextFloat();
        float valorBeneficios = leitorDeEntrada.nextFloat();
        float valorImposto = 0;

        if (valorSalario >= 0 && valorSalario <= 1100) {
            //atribui aliquota de 5% mediante o salário:
            valorImposto = 0.05F * valorSalario;
        } else if (valorSalario >= 1100.01 && valorSalario <= 2500.00) {
            valorImposto = 0.10F *valorSalario;
        } else {
            valorImposto = 0.15F * valorSalario;
        }
        //calcula e imprime e saída com duas casas decimais
        float saida = valorSalario - valorImposto + valorBeneficios;
        System.out.println(String.format("%.2f", saida));
    }
}
