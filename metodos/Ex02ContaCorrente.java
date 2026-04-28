// Exercício 02 - Crie uma classe para representar uma conta corrente que possui um número, um saldo, um status,
// um status que informa se ela é especial ou não, um limite. Desenvolva métodos para realizar saques
// (verificando se o cliente pode saques), depositar dinheiro, consultar saldo e verificar se o cliente está usando
// cheque especial ou não. Desenvolva um programa para testar essa aula.

package metodos;

class Ex02ContaCorrente {
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