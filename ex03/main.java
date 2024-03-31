package ex03;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        List<banco> Contas = new ArrayList<>();
        
        Contas.add(new banco( 001,  "Ana", 2345.23)); 
        Contas.add(new banco ( 002,  "Davi", 2000.23)); 
        Contas.add(new banco ( 003,  "Gabriel",  2100.23));
        
        int opcao;
        
        Scanner leitor = new Scanner(System.in);
        
        do{
        
        System.out.println("-- Informações --");   
        System.out.println(" Banco ");    
        System.out.println("[1] Informações");  
        System.out.println("[2] Sair");  
        System.out.println( "Informe a opção desejada: ");
        
        opcao = Integer.parseInt(leitor.nextLine());
        

            switch (opcao) {
                case 1:

                int opcao1;

                System.out.println("Informe o numero da sua conta:");
                int ContaSelecionada = Integer.parseInt(leitor.nextLine());

                    ContaSelecionada = ContaSelecionada - 1;

                    banco Conta = Contas.get(ContaSelecionada);

                        if(ContaSelecionada >= 0 && ContaSelecionada < Contas.size()){
                            
                            System.out.println("Nome: " + Conta.NomeDoTitular);
                            System.out.println("Conta: " + Conta.NumeroDaConta);
                            System.out.println("Conta Selecionada com sucesso!!");
                            System.out.println("---------------------------------------");
                       
                            do{

                            System.out.println("[1] Depositar");
                            System.out.println("[2] Sacar");
                            System.out.println("[3] Saldo");
                            System.out.println("[4] Sair");

                            opcao1 = Integer.parseInt(leitor.nextLine());
            
                            switch (opcao1) {

                                case 1:

                                    System.out.println("Informe o valor do depósito:");
                                    double valorDeposito = Double.parseDouble(leitor.nextLine());
                                    Conta.DepositoNaConta(valorDeposito);

                                    break;

                                case 2:

                                    System.out.println("Informe o valor que deseja sacar:");
                                    double valorSaque = Double.parseDouble(leitor.nextLine());
                                    Conta.SacarDaConta(valorSaque);

                                    break;

                                case 3:

                                    Conta.SaldoNaConta();

                                    break;

                                case 4:
                                    break;

                                default:
                                    System.out.println("Opção inválida");

                            }

                        } while (opcao1 != 4);

                    } else {

                        System.out.println("Conta não encontrada.");

                    }
                
                case 2:

                    System.out.println("Saindo...");

                    break;

                default:

                    System.out.println("Opção inválida");
                    
                    break;

            }
        } while (opcao != 2);
    }
}