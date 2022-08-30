package principal;

public class Principal {

    public static void main(String[] args) {
        Principal iniciar = new Principal();
        iniciar.iniciar();
    }
    
    public void iniciar(){
        Conta contajoao = new Conta(9591, 1000.0f);
        Cliente joao = new Cliente(contajoao);
        Banco ptdb = new Banco("pt do b");
        
        ptdb.add(joao);
        
    }
    
    
}
