package Exemplos.sequencial;

import java.util.Scanner;

public class exemplo05 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        // ler id de produto1, quantidade de produtos1 e preço de cada produto1. id produto2,quantidade de produtos1
        // e preço de cada produto1 e mostre o valor a ser pago.

        int produto1Id;
        int produto1Qtde;
        double produto1Preco;
        int produto2Id;
        int produto2Qtde;
        double produto2Preco;
        double valorTotal;
        System.out.println("Digite id do produto 1: ");
        produto1Id = leia.nextInt();
        System.out.println("Digite quantidade do produto 1: ");
        produto1Qtde = leia.nextInt();
        System.out.println("Digite o preço de cada produto 1: ");
        produto1Preco = leia.nextDouble();
        System.out.println("Digite id do produto2: ");
        produto2Id = leia.nextInt();
        System.out.println("Digite quantidade do produto2: ");
        produto2Qtde = leia.nextInt();
        System.out.println("Digite o preço de cada produto2: ");
        produto2Preco = leia.nextDouble();
        valorTotal= (produto1Qtde*produto1Preco) + (produto2Qtde*produto2Preco);
        System.out.println(valorTotal);



    }
}
