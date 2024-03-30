package ex02;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int opcao;

        do {

            System.out.println("[1] Inserir Livro");
            System.out.println("[2] Biblioteca");
            System.out.println("[3] Sair");
            System.out.print("\nInforme a opçao desejada: ");
            opcao = Integer.parseInt(leitor.nextLine());

            switch (opcao) {
                case 1:
                    livro.RegistrarLivros();
                break;

                case 2:
                    livro.ExibirLivros();
                break;
                
                case 3:
                break;
            
                default:
                    System.out.println("Opção inválida!");
                    System.out.println();
                break;
            }

        } while (opcao != 3);

      
    }
}

