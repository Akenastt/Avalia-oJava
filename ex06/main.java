package ex06;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        agenda Agenda = new agenda();
        Scanner leitor = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\n--- Menu ---\n");
            System.out.println("[1] Adicionar Contato");
            System.out.println("[2] Buscar Contato");
            System.out.println("[3] Sair");
            System.out.print("\nInforme a opção desejada: ");
            opcao = Integer.parseInt(leitor.nextLine());

            switch (opcao) {

                case 1:

                    Agenda.AdicionarContato();

                break;

                case 2:

                    System.out.print("\nInforme o nome do contato desejado: ");
                    String nomeInsert = leitor.nextLine();
                    Agenda.BuscarContato(nomeInsert);

                    break;
                case 3:

                    System.out.println("--- Encerrando o programa");

                    break;
                default:

                    System.out.println("--- Opção inválida!");

                    break;
            }
        } while (opcao != 3);

        
    }
}