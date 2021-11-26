public class ContaCorrente{
    private double numero;
    private double saldo;
    private boolean status;
    private double limite = 5000;

    public void depositar(double valor){
        saldo+=valor;
    }

    public void saque(double valor){
        if(valor > saldo && limite <= 5000){
            status = true;
            saldo-=valor;
            limite = limite+saldo;
        }else{
            status = false;
        }
    }

    public void setNumero(double numero){
        this.numero = numero;
    }public double getNumero(){
        return this.numero;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }public double getSaldo(){
        return this.saldo;
    }

    public void setStatus(boolean status){
        this.status = status;
    }public boolean isStatus(){
        return this.status;
    }

    public void setLimite(Double limite){
        this.limite = limite;
    }public double getLimite(){
        return this.limite;
    }

    public void limiteUtilizado(){
        if(limite != 5000){
            double utilizado;
            utilizado = getLimite()-5000;
            System.out.println("Limite utilizado: " + utilizado);
        }
    }
}