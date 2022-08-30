package aula6;

import java.util.ArrayList;

public class Curso {
    private String nome;
    private ArrayList<Estudante> lista;
    
    public void Curso(String nome){
        this.nome = nome;
        lista = new ArrayList<Estudante>();
    }
    
    public void add(Estudante estudante){
        this.lista.add(estudante);
    }
    public ArrayList<Estudante> getEstudantes(){
        return this.lista;
    }
}
