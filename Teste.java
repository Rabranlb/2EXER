public class Teste {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();

        conta.setSaldo(2000);
        conta.depositar(3000);
        System.out.println("Saldo atual em: " + conta.getSaldo());

        conta.saque(4500);
        System.out.println("Seu limite ainda é de " + conta.getLimite());

        System.out.println("Meu saldo é de: " + conta.getSaldo());

        conta.limiteUtilizado();

        if(conta.getLimite() > 0){
            System.out.println("Cheque especial...");
        }else{
            System.out.println("No verde...");
        }
    }
}