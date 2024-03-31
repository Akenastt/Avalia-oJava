package ex06;

public class contato {

    private String Nome;
    private String Telefone;
    
    contato(String Nome, String Telefone){

        this.Nome = Nome;
        this.Telefone = Telefone;

    }

    String getNome(){

        return this.Nome;

    }

    String getTelefone(){

        return this.Telefone;
        
    }
}