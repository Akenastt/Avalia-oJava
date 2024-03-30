package ex08;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        List<Pedido> Pedidos = new ArrayList<>();

        List<Pizza> Pizzas = new ArrayList<>();

            Pizzas.add(new Pizza("Pepperoni", 28.50, "Molho de tomate, Queijo Mussarela, Pepperoni"));
            Pizzas.add(new Pizza("Calabresa", 26.90, "Molho de tomate, Queijo Mussarela, Calabresa, Cebola, Azeitonas"));
            Pizzas.add(new Pizza("Quatro Queijos", 30.50, "Molho de tomate, Queijo Mussarela, Queijo Gorgonzola, Queijo Provolone, Queijo Parmesão"));
            Pizzas.add(new Pizza("Frango com Catupiry", 32.90, "Molho de tomate, Queijo Mussarela, Frango Desfiado, Catupiry"));
            Pizzas.add(new Pizza("Portuguesa", 29.90, "Molho de tomate, Queijo Mussarela, Presunto, Ovo, Cebola, Pimentão, Azeitonas"));
            Pizzas.add(new Pizza("Vegetariana", 31.90, "Molho de tomate, Queijo Mussarela, Pimentão, Cebola, Champignon, Tomate, Azeitonas"));
            Pizzas.add(new Pizza("Lombo com Cheddar", 34.90, "Molho de tomate, Queijo Mussarela, Lombo Canadense, Cheddar"));
            Pizzas.add(new Pizza("Bacon com Milho", 32.50, "Molho de tomate, Queijo Mussarela, Bacon, Milho, Catupiry"));
            Pizzas.add(new Pizza("Marguerita Especial", 35.90, "Molho de tomate, Queijo Mussarela de Búfala, Tomate, Manjericão Fresco, Azeite Extra Virgem"));
            Pizzas.add(new Pizza("Rúcula com Tomate Seco", 33.90, "Molho de tomate, Queijo Mussarela, Rúcula, Tomate Seco, Azeite Extra Virgem"));
            Pizzas.add(new Pizza("Escarola com Bacon", 32.90, "Molho de tomate, Queijo Mussarela, Escarola Refogada, Bacon"));
            Pizzas.add(new Pizza("Atum", 30.90, "Molho de tomate, Queijo Mussarela, Atum, Cebola, Azeitonas"));
            Pizzas.add(new Pizza("Broccoli com Alho", 31.50, "Molho de tomate, Queijo Mussarela, Brócolis Cozido, Alho Frito"));
            Pizzas.add(new Pizza("Mexicana", 34.50, "Molho de tomate, Queijo Mussarela, Carne Moída Temperada, Pimenta Jalapeño, Pimentão, Cebola"));
            Pizzas.add(new Pizza("Carbonara", 33.90, "Creme de Leite, Queijo Parmesão, Bacon, Ovo, Pimenta do Reino"));
            Pizzas.add(new Pizza("Toscana", 30.90, "Molho de tomate, Queijo Mussarela, Linguiça Toscana, Cebola, Azeitonas"));
            Pizzas.add(new Pizza("Palmito", 32.90, "Molho de tomate, Queijo Mussarela, Palmito, Catupiry"));
            Pizzas.add(new Pizza("Brigadeiro", 26.90, "Chocolate ao Leite, Chocolate Granulado"));
            Pizzas.add(new Pizza("Banana com Canela", 25.90, "Doce de Leite, Banana, Canela"));
            Pizzas.add(new Pizza("Romeu e Julieta", 28.90, "Goiabada, Queijo Mussarela"));
            Pizzas.add(new Pizza("Chocolate com Morango", 27.90, "Chocolate ao Leite, Morango"));
            Pizzas.add(new Pizza("Prestígio", 29.90, "Chocolate ao Leite, Coco Ralado"));
            Pizzas.add(new Pizza("Doce de Leite com Amendoim", 26.90, "Doce de Leite, Amendoim"));
            Pizzas.add(new Pizza("Limão", 25.90, "Leite Condensado, Suco de Limão"));
            Pizzas.add(new Pizza("Nutella", 30.90, "Nutella, Morango, Banana"));
            Pizzas.add(new Pizza("Alho Poró", 31.90, "Molho Branco, Queijo Mussarela, Alho Poró, Nozes"));
            Pizzas.add(new Pizza("Camarão", 36.90, "Molho de tomate, Queijo Mussarela, Camarão, Catupiry"));
            Pizzas.add(new Pizza("Margherita com Pesto", 33.90, "Molho de tomate, Queijo Mussarela, Tomate, Manjericão, Pesto de Manjericão"));
            

        

        int opcao;

        do {
            
            System.out.println("\n--- Pizzaria ---\n");
            System.out.println("\n[1] Cardapio");
            System.out.println("[2] Fazer Pedido");
            System.out.println("[3] Informações Pedido");
            System.out.println("[4] Cancelar Pedido");
            System.out.println("[5] Relatório dos Pedidos");
            System.out.println("[0] Sair");
            System.out.print("Informe a opção desejada: ");
            opcao = Integer.parseInt(leitor.nextLine());

            switch (opcao) {
                case 1:
                    Pizza.MenuDasPizzas(Pizzas);
                break;

                case 2:
                    Pedido.AdicionarPedido(Pedidos, Pizzas);
                break;

                case 3:
                    Pedido.InformacaoDoPedido(Pedidos);
                break;

                case 4:
                    Pedido.CancelamentoDoPedido(Pedidos);
                break;

                case 5:
                    Pedido.RelatorioDosPedidos(Pedidos);
                break;

                case 0:
                break;
            
                default:
                    System.out.println("> Opção inválida!");
                break;
            }

        } while (opcao != 0);

    
    }
}