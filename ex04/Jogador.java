package ex04;

public class Jogador {
    private  String nome;
    private  int pontuacao;
    private  int nivel;

   
    public Jogador(String nome, int pontuacao, int nivel) {
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.nivel = nivel;
    }

   
    public void aumentarPontuacao(int pontos) {
        this.pontuacao += pontos;
    }

    public void subirNivel() {
        this.nivel++;
    }

    public void exibirInfoJogador() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Pontuação: " + this.pontuacao);
        System.out.println("Nível: " + this.nivel);
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}



