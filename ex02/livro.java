package ex02;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class livro {


    private String nomeLivro;
    private String nomeAutor;
    private String AnoPublicacao;


            public livro(String nome, String autor, String ano){

                this.nomeLivro = nome;
                this.nomeAutor = autor;
                this.AnoPublicacao = ano;
            } 
            
            static List<livro> Livro  = new ArrayList<>();


            static void RegistrarNaBiblioteca(){

                Scanner leitor = new Scanner(System.in);

                System.out.println("Quantidade de Livros: ");
                int quantidade = Integer.parseInt(leitor.nextLine());
          
                for(int i = 0; i < quantidade; i++){

                    System.out.println("Informe o Nome do Livro: ");
                    String nomeLivro = leitor.nextLine();

                    System.out.println("Informe o Nome do Autor: ");
                    String nomeAutor = leitor.nextLine();

                    System.out.println("Informe o Ano de Publicação: ");
                    String AnoPublicacao = leitor.nextLine();

                    Livro.add(new livro(nomeLivro, nomeAutor, AnoPublicacao));

            }

        }

            public static void ExibirLivro(){

                System.out.println("----- Bem-Vindo à Biblioteca -----");  

                if (Livro.isEmpty()) {
                    System.out.println("Nenhum Livro Cadastrado");
                } else {
                    System.out.println("-----Livros Cadastrados ------\n");
                    for (livro livro : Livro) {
                       
                        System.out.println("- Nome do Livro: " + livro.nomeLivro);

                        System.out.println("- Nome do Autor: " + livro.nomeAutor);

                        System.out.println("- Ano de Publicação: " + livro.AnoPublicacao);

                        System.out.println("-------------------------------------");

                    }
                    
                }
                    
            }

}
    
  
