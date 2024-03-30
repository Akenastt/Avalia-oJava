package ex01;

public class calculadora {

    float soma;
    float multiplicacao;
    float divisao;
    float subtracao;

    void calcular(int a, int b){

        soma = a + b;
        subtracao = a - b;
        multiplicacao = a * b;
        if (b != 0) {
            divisao = (float) a / b;
        }
        else{
            
            System.out.println("Erro: divisão por 0.");

            
        }


    }

    
}


