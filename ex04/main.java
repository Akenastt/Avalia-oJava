package ex04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        List<Jogador> jogadores = new ArrayList<>();

        
        Jogador j1 = new Jogador("Neymar Junior", 7, 2);
        Jogador j2 = new Jogador("Lionel Messi", 9, 3);
        Jogador j3 = new Jogador("Cristiano Ronaldo", 8, 3);
        Jogador j4 = new Jogador("Kylian Mbappé", 8, 3);
        Jogador j5 = new Jogador("Robert Lewandowski", 9, 3);

        jogadores.add(j1);
        jogadores.add(j2);
        jogadores.add(j3);
        jogadores.add(j4);
        jogadores.add(j5);

        Scanner leitor = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\n--- Escolha uma opção: ---\n");
            System.out.println("[1] Mostrar jogadores");
            System.out.println("[2] Informações do Jogador");
            System.out.println("[3] Alterar Nível");
            System.out.println("[4] Alterar Pontuação");
            System.out.println("[5] Sair");

            opcao = leitor.nextInt();
            leitor.nextLine();

            switch (opcao) {

                case 1:

                    System.out.println("Jogadores adicionados:\n");

                    for (Jogador jogador : jogadores) {
                        System.out.println(jogador.getNome());
                    }
                    break;

                case 2:

                    System.out.println("Informações do jogador:");

                    for (Jogador jogador : jogadores) {
                        System.out.println("\nNome: " + jogador.getNome());
                        System.out.println("Pontuação: " + jogador.getPontuacao());
                        System.out.println("Nível: " + jogador.getNivel());
                    }
                    break;

                case 3:

                    System.out.println("Informe o nome do jogador:");
                    String nomeJogador = leitor.nextLine();

                    System.out.println("Informe o novo nível:");
                    int novoNivel = leitor.nextInt();

                    leitor.nextLine(); 

                    for (Jogador jogador : jogadores) {
                        if (jogador.getNome().equals(nomeJogador)) {
                            jogador.setNivel(novoNivel);
                            System.out.println("Nível atualizado com sucesso!");
                            break;
                        }
                    }
                    break;

                case 4:

                    System.out.println("Informe o nome do jogador:");
                    String nomeJogadorPontuacao = leitor.nextLine();

                    System.out.println("Informe a pontuação a ser adicionada:");
                    int pontos = leitor.nextInt();

                    leitor.nextLine(); 

                    for (Jogador jogador : jogadores) {
                        if (jogador.getNome().equals(nomeJogadorPontuacao)) {
                            jogador.aumentarPontuacao(pontos);
                            System.out.println("Pontuação atualizada com sucesso!");
                            break;
                        }
                    }
                    break;

                case 5:

                    System.out.println("Programa encerrado");
                    break;

                default:

                    System.out.println("Opção inválida");

            }

        } while (opcao != 5);

    
    }
}

