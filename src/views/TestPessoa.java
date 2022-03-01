package views;

import model.Pessoa;

import java.util.Scanner;

public class TestPessoa {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Pessoa p1 = new Pessoa();

        Pessoa p2 = new Pessoa( "Rita",33, 63.0, 1.54); // cheio

        // lendo os atributos privados
        System.out.println("Digite o nome:");
        p1.setNome(ler.nextLine());
        System.out.println("Digite a idade:");
        p1.setIdade(ler.nextInt());
        System.out.println("Digite a peso:");
        p1.setPeso(ler.nextDouble());
        System.out.println("Digite a altura:");
        p1.setAltura(ler.nextDouble());


        // System.out.println(p1.toString());
        System.out.println(p1); // chamando o toString(); construtor vazio
        System.out.println(p2); // chamndo o toString(); construtor cheio
    }
}
