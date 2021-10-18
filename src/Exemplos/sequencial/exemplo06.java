package Exemplos.sequencial;

import java.util.Scanner;

public class exemplo06 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        double a, b, c;
        System.out.println("Digite um valor: ");
        a = leia.nextDouble();
        System.out.println("Digite um valor: ");
        b = leia.nextDouble();
        System.out.println("Digite um valor: ");
        c= leia.nextDouble();
        double triangulo = (a*c)/2;
        double circulo = Math.PI*c*c;
        double trapezio = a+b*c/2;
        double quadrado = b*b;
        double retangulo = a*b;
        System.out.println(triangulo);
        System.out.println(circulo);
        System.out.println(trapezio);
        System.out.println(quadrado );
        System.out.println(retangulo);

    }


    }
