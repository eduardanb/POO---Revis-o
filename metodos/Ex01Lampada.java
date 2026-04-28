// Exercício 01 - Escreva uma classe para representar uma lâmpada. Desenvolva métodos para ligar, desligar a lâmpada.

package metodos;

class Ex01Lampada {
    String marca;
    double preco;
    double potencia;
    String cor;
    boolean ligada;

    void ligar() {
        ligada = true;
    }

    void desligar() {
        ligada = false;
    }
}
