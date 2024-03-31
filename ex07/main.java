package ex07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        List<produto> Estoque = new ArrayList<produto>();

            Estoque.add(new produto("Batata Chips", 6, 7.49, 85));
            Estoque.add(new produto("Refrigerante de Laranja", 7, 4.99, 110));
            Estoque.add(new produto("Barras de Cereal", 8, 2.29, 95));
            Estoque.add(new produto("Água Mineral", 9, 1.99, 150));
            Estoque.add(new produto("Maçãs", 10, 0.99, 120));
            Estoque.add(new produto("Salgadinho de Queijo", 11, 6.99, 80));
            Estoque.add(new produto("Suco de Uva", 12, 3.79, 100));
            Estoque.add(new produto("Sanduíche de Frango", 13, 4.49, 60));
            Estoque.add(new produto("Amendoim", 14, 3.99, 70));
            Estoque.add(new produto("Biscoitos", 15, 2.79, 90));
            Estoque.add(new produto("Limonada", 16, 3.49, 85));
            Estoque.add(new produto("Pipoca", 17, 1.79, 120));
            Estoque.add(new produto("Geléia", 18, 5.49, 65));
            Estoque.add(new produto("Picles", 19, 2.99, 75));
            Estoque.add(new produto("Bolachas", 20, 2.49, 80));
            Estoque.add(new produto("Presunto", 21, 8.99, 55));
            Estoque.add(new produto("Queijo", 22, 7.49, 70));
            Estoque.add(new produto("Leite Condensado", 23, 3.99, 60));
            Estoque.add(new produto("Chocolate em Barra", 24, 4.79, 45));
            Estoque.add(new produto("Bananas", 25, 1.29, 100));
            Estoque.add(new produto("Uvas", 26, 3.99, 80));
            Estoque.add(new produto("Abacaxi", 27, 2.99, 65));
            Estoque.add(new produto("Cenouras", 28, 0.89, 110));
            Estoque.add(new produto("Laranjas", 29, 1.49, 95));
            Estoque.add(new produto("Pêssegos", 30, 2.29, 75));
            Estoque.add(new produto("Azeitonas", 31, 4.99, 60));
            Estoque.add(new produto("Manteiga", 32, 3.49, 70));
            Estoque.add(new produto("Ovos", 33, 2.79, 90));
            Estoque.add(new produto("Iogurte", 34, 1.99, 80));
            Estoque.add(new produto("Pão de Queijo", 35, 6.99, 55));


        int opcao;

        do {
            
            System.out.println("\n--- Mercearia ---\n");
            System.out.println("[1] Adicionar Produto");
            System.out.println("[2] Alterar Produto");
            System.out.println("[3] Gerenciar Estoque");
            System.out.println("[4] Gerar Relatório");
            System.out.println("[5] Sair");
            System.out.print("Informe a opção desejada: ");

            opcao = Integer.parseInt(leitor.nextLine());

            switch (opcao) {

                case 1:

                    produto.AdicionarProduto(Estoque);

                break;

                case 2:
                
                    produto.AlterarProduto(Estoque);

                break;

                case 3:

                    produto.ControleEstoque(Estoque);

                break;

                case 4:

                    produto.RelatorioEstoque(Estoque);

                break;

                case 5:
                break;
            
                default:

                    System.out.println("-- Opção inválida!");

                break;
            }

        } while (opcao != 5);

       
    }
}