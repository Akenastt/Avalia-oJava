package ex05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

         Carro carro1 = new Carro("Chevrolet", "Onix", 2017, "A4NS23");


        int opcao;

        do {

            System.out.println("\n--- Escolha uma opção: ---\n");
            System.out.println("[1] Acelerar");
            System.out.println("[2] Frear");
            System.out.println("[3] Exibir informações do carro");
            System.out.println("[4] Sair");

            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                
                    System.out.println("-Informe o valor de aceleração:");
                    int aceleracao = scanner.nextInt();
                    carro1.acelerar(aceleracao);
                   

                    break;

                case 2:

                    System.out.println("-Informe o valor de desaceleração:");
                    int desaceleracao = scanner.nextInt();
                    carro1.frear(desaceleracao);
                    

                    break;

                case 3:

                    carro1.exibirInfoCarro();
                   

                    break;
                case 4:

                    System.out.println("Encerrando o programa");

                    break;

                default:

                    System.out.println("Opção inválida.");
            }
        } while (opcao != 4);

       
    }
}
