package principal;

public class Conta {
    private int numero;
    private Float saldo;

    public void Conta(int numero, Float saldo){
        this.numero = numero;
        this.saldo = saldo;
    }
    
    public void saque(Float valor){
        if (this.saldo > valor){
            this.saldo -= valor;
            //dinhero.out(valor)
        }
        else
            System.out.println("saldo insuf.");
    }
    
    public void deposito(Float valor){
        this.saldo += valor;
    }
    
    public Float getExtrato(){
        return saldo;
    }
}