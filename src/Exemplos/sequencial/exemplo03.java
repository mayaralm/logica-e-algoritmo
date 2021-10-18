package Exemplos.sequencial;

import java.util.Scanner;

public class exemplo03 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        // faca um programa para ler 4 valores inteiros: abcd, a seguir calcule e mostre a diferenca do produto a e b
        // pelo produto c e d. (a diferenca sera : a*b  -c*d)
        int a, b, c, d;
        int calculo;
        System.out.println("Digite um numero inteiro: ");
        a = leia.nextInt();
        System.out.println("Digite um numero inteiro: ");
        b = leia.nextInt();
        System.out.println("Digite um numero inteiro: ");
        c= leia.nextInt();
        System.out.println("Digite um numero inteiro: ");
        d = leia.nextInt();
        calculo =  (a*b - c*d);
        System.out.println("O resultado é:" + calculo);



    }





}
