package Exemplos.sequencial;

import java.util.Scanner;

public class exemplo04 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        // ler id de funcionario, num de horas trabalhadas, valor por hora e calcular salario mostrar  de
        // funcionario com id e duas casas decimais no salario
        int id;
        int numHora;
        double valorHora;
        double salario;
        System.out.println("Digite seu ID: ");
        id = leia.nextInt();
        System.out.println("Digite o número de horas trabalhadas: ");
        numHora = leia.nextInt();
        System.out.println("Digite valor das horas trabalhadas: ");
        valorHora = leia.nextDouble();
        salario = numHora*valorHora;
        System.out.println(String.format ("Funcionario de id: "+ id + " recebe no total: %.2f", salario));


    }
}
