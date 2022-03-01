package views;

import model.Numero;

import java.util.Scanner;

public class TestNumero {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Numero n1 = new Numero();

        System.out.println("Digite o numero");
        n1.valor = ler.nextInt();

        System.out.println(n1);
    }
}
