class Ex05ContaCorrente {
    int numDaConta;
    double saldo;
    boolean statusDaConta;
    double limite;

    void sacar(double valor) {
        if (valor > (saldo + limite)) {
            System.out.println("Saldo insuficiente");
        } else {
            saldo = saldo - valor;
            System.out.println("Saldo suficiente");
        }
    }

    void depositar(double valor){
        saldo = saldo + valor;
    }

    void consultarSaldo() {
        System.out.println(saldo);
    }

    void chequeEspecial() {
        if (saldo < 0) {
            System.out.println("Está usando cheque especial");
        } else {
            System.out.println("Não está usando cheque especial");
        }
    }
}