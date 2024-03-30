package ex01;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int menu;
        
        do {
            System.out.println("--- Calculadora ---\n");
            System.out.println("[1] Calcular");
            System.out.println("[2] Sair");
            System.out.print("Informe a opção desejada: ");
            menu = Integer.parseInt(leitor.nextLine());

            switch (menu) {
                case 1:
                System.out.println("Informe um número: ");
                double a = Double.parseDouble(leitor.nextLine());
        
                System.out.println("Informe a operação: ");
                String opcao = leitor.nextLine();
        
                System.out.println("Informe um número: ");
                double b = Double.parseDouble(leitor.nextLine());
        
                switch(opcao){
                    case "+":
                        calculadora.Soma(a,b);
                    break;
        
                    case "-":
                        calculadora.Subtracao(a,b);
                    break;
        
                    case "*":
                        calculadora.Multiplicacao(a,b);
                    break;
        
                    case "/":
                        calculadora.Divisao(a,b);
                    break;

                    default:
                        System.out.println("> Operação não encontrada!");
                    break;
                }
                break;

                case 2:
                break;
            
                default:
                    System.out.println("> Opção inválida!");
                break;
            }
        } while (menu != 2);

    
    }
}