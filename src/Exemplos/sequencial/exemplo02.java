package Exemplos.sequencial;

import java.util.Scanner;
public class exemplo02 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        System.out.printf("Digite o valor do raio: ");
        double raio = leia.nextDouble();
        double area = 3.14159 * raio*raio;
        System.out.println(String.format("O resultado é: %.4f", area));
        leia.close();


    }

}