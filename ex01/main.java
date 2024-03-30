package ex01;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {


       Scanner leitor = new Scanner(System.in);
        
       int opcao;

       do{

        System.out.println("-- Calculadora --");
            System.out.println("[1] - Calcular");
            System.out.println("[2] - Sair");
            System.out.println("Informe a opção desejada: ");
            opcao = Integer.parseInt(leitor.nextLine());

            switch(opcao){
                case 1:
                    System.out.println("Opção Calcular selecionada com sucesso");

                    System.out.println("Informe primeiro número: ");
                    int a = Integer.parseInt(leitor.nextLine());

                    System.out.println("Informe segundo número: ");
                    int b = Integer.parseInt(leitor.nextLine());

                    System.out.println("-- Operações --\n Soma\n Subtração\n Multiplicação\n Divisão\n Informe a opção desejada: ");


                    String operacao = leitor.nextLine();


                        switch(operacao) {                          

                            case "Soma":
                                System.out.println("A soma dos números é: " + (a + b));

                                break;

                            case "subtracao":
                                System.out.println("A subtração dos números é: " + (a - b));

                                break;

                            case "multiplicacao":
                                System.out.println("A multiplicação dos números é: " + (a * b));

                                break;

                            case "divisao":
                                System.out.println("A div dos números é: " + (a / b));

                                break;

                        }

            
                    case 2:
                    System.out.println("Saindo...");
                    break;
                    
                    default:
                        System.out.println("Opção inválida. Por favor escolha novamente.");
                        break;

    
                    }   
            

            } while (opcao != 2);

    
       

    }

}





