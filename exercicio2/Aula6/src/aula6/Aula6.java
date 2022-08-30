package aula6;

import java.util.ArrayList;

public class Aula6 {
    public static void main(String[] args) {
        Aula6 principal = new Aula6();
        principal.iniciar();
    }
    
    public void iniciar(){
        Estudante joao = new Estudante("joao");
        Curso poo = new Curso("POO");
        poo.add(joao);
        
        ArrayList<Estudante> conteudoLista = poo.getEstudantes();
        for (Estudante estudante : conteudoLista){
            System.out.println(estudante);
        }
        
    }
    
}
