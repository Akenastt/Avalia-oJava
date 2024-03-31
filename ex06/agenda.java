package ex06;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class agenda {

    private List<contato> ListaContatos;

    agenda(){

        ListaContatos = new ArrayList<>();

    }

    void AdicionarContato(){

        Scanner leitor = new Scanner(System.in);

        System.out.println("\n--- Adicionar Contato ---\n");

        System.out.print("Nome: ");
        String Nome = leitor.nextLine();

        System.out.print("Telefone: ");
        String Telefone = leitor.nextLine();

        ListaContatos.add(new contato(Nome, Telefone));
    }

    void BuscarContato(String nomeContato){

        boolean Encontrado = false;

        for(contato contato : ListaContatos){

            if (contato.getNome().equalsIgnoreCase(nomeContato)) {

                System.out.println("\n--- Contato ---\n");
                System.out.println("Nome: " + contato.getNome() + "\nTelefone: " + contato.getTelefone());
                Encontrado = true;

            }
        }

        if(Encontrado == false){

            System.out.println("-- Contato não encontrado!");

        }
    }
}