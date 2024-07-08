public class ContaCorrente extends Conta {

    @Override
    public void imprimirExtrato() {
        System.out.println("||| Extrato Conta Corrente |||");
        if (this.saldo < 0) {
            super.imprimirInfosComuns();
            System.out.println("=== Você está utilizando seu Cheque Especial ===");
        } else
            super.imprimirInfosComuns();
    }

}
