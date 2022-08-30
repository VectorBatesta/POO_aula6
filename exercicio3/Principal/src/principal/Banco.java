package principal;

import java.util.ArrayList;

public class Banco {
    private ArrayList<Cliente> lista;
    private String nome;
    
    public Banco(String nome){
        this.nome = nome;
        this.lista = new ArrayList<>();
    }
    
    public void add(Cliente cliente){
        this.lista.add(cliente);
    }
    public void del(Cliente cliente){
        this.lista.remove(cliente);
    }
}