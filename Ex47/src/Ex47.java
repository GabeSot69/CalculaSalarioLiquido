/*
    Nome: Gabriel Sotero Mendonça
    Objetivo: Faça um programa que leia o salário bruto e calcule o salário líquido. Para esse programa, o salário
    líquido será o salário bruto menos os descontos de INSS e IR, seguindo as regras:
    • caso o salário seja menor que R$1.500,00, não devemos descontar IR e descontaremos 8% de INSS;
    • para salários a partir R$1.500,00, descontaremos 5% de IR e 11% de INSS.
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex47 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o salario bruto");
        double salBruto = scanner.nextDouble();
        double IR = 0, INSS = 0;
        if (salBruto >= 1500.00){
            IR = 0.05;
            INSS = 0.11;
        }
        else {
            INSS = 0.08;
        }
        double salLiq = salBruto - salBruto*(IR+INSS);
        System.out.println("Salario liquido: R$ " + df.format(salLiq));

    }
}
