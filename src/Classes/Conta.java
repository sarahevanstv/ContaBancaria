package Classes;

public class Conta {

    private TipoOperacao operacao;
    private double valorOperacao;
    private double saldo;

    //#region


    public TipoOperacao getOperacao() {
        return operacao;
    }
    public double getValorOperacao() {
        return valorOperacao;
    }
    public double getSaldo() {
        return saldo;
    }
    //#endregion

    public void fazOperacao(TipoOperacao operacao, double valor) {

        this.operacao = operacao;
        this.valorOperacao = valor;

        if(operacao == TipoOperacao.SAQUE) {

            if( valor <= saldo) {
                this.saldo = this.saldo - valor;
                System.out.println("Saque realizado com sucesso!!");

            }else
              System.out.println("Saldo insuficiente para retirada.");
              
        }else
         if(operacao == TipoOperacao.DEPOSITO) {
             this.saldo = this.saldo + valor;
             System.out.println("Depósito realizado com sucesso!");

         }

         System.out.println("Seu saldo atual é de: R$" + this.saldo);

    }


}