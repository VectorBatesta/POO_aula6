package aula6;

public class Estudante {
    private String nome;
    
    public Estudante(String nome){
        this.nome = nome;
    }
    
    public String toString(){
        return "nome: " + this.nome;
    }
}