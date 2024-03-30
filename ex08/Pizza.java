package ex08;

import java.util.List;

public class Pizza {
    
    String nomeSabor;
    double precoSabor;
    String ingredientes;

    Pizza(String nomeSabor, double precoSabor,  String ingredientes){
        this.nomeSabor = nomeSabor;
        this.precoSabor = precoSabor;
        this.ingredientes = ingredientes;
    }

    String getNomeSabor(){
        return this.nomeSabor;
    }

    double getPrecoSabor(){
        return this.precoSabor;
    }

    String getIngredientes(){
        return this.ingredientes;
    }

    static void MenuDasPizzas(List<Pizza> Pizzas){

        System.out.println("\n|             Sabor          |     Preço       |                        Ingredientes                                                          |");
        System.out.println();
        for (Pizza pizza : Pizzas) {
            String sabor = pizza.getNomeSabor();
            String preco = String.format("%.2f", pizza.getPrecoSabor());
            String ingredientes = pizza.getIngredientes();

            System.out.printf("| %-26s | %-15s | %-92s |\n", sabor, preco, ingredientes);
        }
    }
}