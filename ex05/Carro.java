package ex05;

public class Carro {

    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private int velocidadeAtual;

    
    public Carro(String marca, String modelo, int ano, String placa) {

        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.velocidadeAtual = 0; 

    }

    
    public void acelerar(int aceleracao) {
        if (aceleracao > 0) {
            this.velocidadeAtual += aceleracao;
            System.out.println("Carro acelerando... Velocidade atual: " + this.velocidadeAtual + " km/h");
        } else {
            System.out.println("A aceleração de velocidade deve ser maior que zero.");
        }
    }

   
    public void frear(int desaceleracao) {
        if (desaceleracao > 0 && desaceleracao <= this.velocidadeAtual) {
            this.velocidadeAtual -= desaceleracao;

            System.out.println("Carro freando.... Velocidade atual: " + this.velocidadeAtual + " km/h");
            
        } else if (desaceleracao > this.velocidadeAtual) {

            System.out.println("Não é possível frear mais do que a velocidade atual.");

        } else {

            System.out.println("A desaceleração de velocidade deve ser maior que zero.");

        }
    }

    
    public void exibirInfoCarro() {

        System.out.println("\n-Informações do Carro:\n");
        System.out.println("-Marca: " + this.marca);
        System.out.println("-Modelo: " + this.modelo);
        System.out.println("-Ano: " + this.ano);
        System.out.println("-Placa: " + this.placa);
        System.out.println("-Velocidade Atual: " + this.velocidadeAtual + " km/h");

    }
}
