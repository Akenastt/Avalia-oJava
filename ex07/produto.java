package ex07;

import java.util.Scanner;
import java.util.List;

public class produto {

    static Scanner leitor = new Scanner(System.in);

    private String Nome;
    private int idProduto;
    private double Preco;
    private int QuantEmEstoque;

    produto(String Nome, int idProduto, double Preco, int QuantEmEstoque){
        
        this.Nome = Nome;
        this.idProduto = idProduto;
        this.Preco = Preco;
        this.QuantEmEstoque = QuantEmEstoque;

    }

    static void AdicionarProduto(List<produto> Estoque){

        System.out.println("\n--- Adicionar Produto ---\n");

        System.out.print("Informe a quantidade de produtos que será inserida: ");
        int QuantProdutos = Integer.parseInt(leitor.nextLine());

        for(int i = 0; i < QuantProdutos; i++){

            System.out.print("Informe o nome do produto: ");
            String Nome = leitor.nextLine();

            System.out.print("Informe o preço do produto: R$");
            double Preco = Double.parseDouble(leitor.nextLine());

            System.out.print("Informe a quantidade de " + Nome + " a ser inserido(a) no estoque: ");
            int QuantEmEstoque = Integer.parseInt(leitor.nextLine());

            Estoque.add(new produto(Nome, Estoque.size() + 1, Preco, QuantEmEstoque));
        }
    }

    int getIdProduto(){

        return this.idProduto;

    }

    void setNome(String Nome){

        this.Nome = Nome;
        System.out.println("--- Nome alterado para " + Nome);

    }

    String getNome(){

        return this.Nome;

    }

    void setPreco(double Preco){

        this.Preco = Preco;
        System.out.println("--- Preço alterado para " + Preco);

    }

    double getPreco(){

        return this.Preco;

    }

    void setQuantEmEstoque(int QuantEmEstoque){

        this.QuantEmEstoque = QuantEmEstoque;
        System.out.println("--- Quantidade em estoque alterado para " + QuantEmEstoque);

    }

    int getQuantEmEstoque(){

        return this.QuantEmEstoque;

    }

    static void AlterarProduto(List<produto> Estoque){

        System.out.println("\n--- Alterar Produtos ---\n");

        System.out.print("Informe o código do produto que deseja alterar: ");
        int idProduto = Integer.parseInt(leitor.nextLine());

        for (produto produtos : Estoque) {
            if (produtos.getIdProduto() == idProduto) {

                System.out.println("-- Produto " + produtos.getNome() + " selecionado");

                int opcao;

                do {
                    
                    System.out.println("\n[1] Alterar nome");
                    System.out.println("[2] Alterar preço");
                    System.out.println("[3] Alterar quantidade do estoque");
                    System.out.println("[4] Informações do produto");
                    System.out.println("[5] Sair");
                    System.out.print("Informe a opção desejada: ");

                    opcao = Integer.parseInt(leitor.nextLine());

                    switch (opcao) {
                        case 1:

                            System.out.print("Informe o novo nome: ");
                            String SetarNome = leitor.nextLine(); 
                            produtos.setNome(SetarNome);

                        break;

                        case 2:

                            System.out.print("Informe o novo preço: R$");
                            double SetarPreco = Double.parseDouble(leitor.nextLine());
                            produtos.setPreco(SetarPreco);

                        break;

                        case 3:

                            System.out.print("Informe a nova quantidade de produtos em estoque: ");
                            int SetarQuantEstoque = Integer.parseInt(leitor.nextLine());
                            produtos.setQuantEmEstoque(SetarQuantEstoque);

                        break;

                        case 4:

                            System.out.println("\n--- Informações do produto " + produtos.getNome() + " ---\n");
                            System.out.println("Identificador: " + produtos.getIdProduto());
                            System.out.println("Preço: " + produtos.getPreco());
                            System.out.println("Quantidade em estoque: " + produtos.getQuantEmEstoque());

                        break;

                        case 5:
                        break;
                    
                        default:

                            System.out.println("--- Opção inválida!");

                        break;
                    }

                } while (opcao != 5);
            }
        }

    }

    void RemoverDoEstoque(){

        System.out.print("Informe a quantidade que deseja remover: ");
        int QuantRemover = Integer.parseInt(leitor.nextLine());

        if (QuantRemover > 0 && QuantRemover <= this.QuantEmEstoque) {

            this.QuantEmEstoque -= QuantRemover;
            System.out.println("--- A quantidade do produto " + this.getNome() + " foi atualizada para " + this.QuantEmEstoque);

        } 
    }

    void AdicionarAoEstoque(){

        System.out.print("Informe a quantidade que deseja inserir: ");
        int QuantAdicionar = Integer.parseInt(leitor.nextLine());

        if (QuantAdicionar > 0) {

            this.QuantEmEstoque += QuantAdicionar;
            System.out.println("--- A quantidade do produto " + this.getNome() + " foi atualizada para " + this.QuantEmEstoque);

        }
    }

    static void ControleEstoque(List<produto> Estoque){

        System.out.println("\n--- Controle de Estoque ---\n");

        System.out.print("Informe o identificador do produto: ");
        int idProduto = Integer.parseInt(leitor.nextLine());

        if (idProduto >= 0 && idProduto <= (Estoque.size() + 1)) {

            for(produto produtos : Estoque){

                if (produtos.getIdProduto() == idProduto) {

                    System.out.println("Nome: " + produtos.getNome());
                    System.out.println("Quantidade em estoque: " + produtos.getQuantEmEstoque());

                    int opcao;

                    do {
                        
                        System.out.println("\n[1] Remover quantidade do estoque");
                        System.out.println("[2] Adicionar quantidade ao estoque");
                        System.out.println("[3] Sair");
                        System.out.print("Informe a opção desejada: ");

                        opcao = Integer.parseInt(leitor.nextLine());

                        switch (opcao) {

                            case 1:

                                System.out.println("\n--- Remover ---\n");
                                produtos.RemoverDoEstoque();

                            break;

                            case 2:

                                System.out.println("\n--- Adicionar ---\n");
                                produtos.AdicionarAoEstoque();

                            break;

                            case 3:
                            break;
                        
                            default:

                                System.out.println("--- Opção inválida!");

                            break;
                        }

                    } while (opcao != 3);

                }
            }
        }      
    }

    static double MontanteEstoque(List<produto> Estoque){

        double TotalEmEstoque = 0;

        for (produto produtos : Estoque) {

            TotalEmEstoque += (produtos.Preco * produtos.QuantEmEstoque);

        }

        return TotalEmEstoque;

    }

   

    static void RelatorioEstoque(List<produto> Estoque){

      

        System.out.println("\n--- Relatório do Estoque ---\n");

      
        System.out.println("        -- Produtos --           | -- Preços --  | --Quantidades-- | -- Montante --|-- Identificador --\n");

        for (produto produtos : Estoque) {

            System.out.printf("- %-30s | R$ %-10.2f | %-15d | R$ %-10.2f | %-4d\n", produtos.getNome(), produtos.getPreco(), produtos.getQuantEmEstoque(), (produtos.getPreco() * produtos.getQuantEmEstoque()), produtos.idProduto);

        }


        System.out.printf("\n--- Montante total em estoque: R$ %-10.2f", MontanteEstoque(Estoque));

      

    }
}