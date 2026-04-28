# Programação Orientada a Objetos

> Paradigma que organiza o software em torno de **objetos** que encapsulam dados e comportamento.

---

## 01 · Classes & Objetos — a base de tudo

| Conceito | Definição |
|---|---|
| **Objeto** | Entidade com atributos, métodos e escopo definido. Ex.: `Mario`, `Cano`. |
| **Classe** | O molde. Define quais atributos e métodos os objetos daquele tipo terão — como uma receita para o bolo. |
| **Instância** | Objeto concreto criado a partir da classe. `Carro` → "Ferrari vermelha" e "Fusca azul" são instâncias distintas, sem repetir código. |

---

## 02 · Encapsulamento — proteção interna

**Objetivo:** proteger o estado interno do objeto de alterações externas indevidas, isolando a lógica.

> Como uma cápsula que protege o remédio: o que está dentro só pode ser modificado pelos métodos autorizados da própria classe.

**Na prática:** `tanqueCheio` público → qualquer objeto externo pode corrompê-lo. Tornando-o `private` e expondo um método `abastecer()`, o controle é garantido.

Modificadores comuns: `public` · `private` · `protected` · getters/setters

---

## 03 · Herança — reutilizar e estender

Uma classe filha herda atributos e métodos da classe pai, adicionando ou sobrescrevendo o que precisar.

**Exemplo:** `Inimigo` tem movimentação base → `InimigoVoador` herda tudo e adiciona lógica do eixo Y. Zero repetição.

> **Cuidado:** hierarquias profundas demais dificultam manutenção. Prefira composição quando a relação não for genuinamente *"é um"*.

---

## 04 · Polimorfismo — mesma interface, formas diferentes

A capacidade de tratar objetos distintos de maneira uniforme por meio de um tipo comum.

> Um controlador de input trata `Guerreiro` e `Mago` apenas como `Personagem` — chama `atacar()` sem saber qual implementação será executada.

---

## 05 · Abstração — contratos e esqueletos

**Classe abstrata:** esqueleto que não pode ser instanciado diretamente. Pode conter implementação base e força as filhas a implementar certos métodos.

**Interface / Protocolo:** contrato puro — define *o que* deve existir, sem nenhuma implementação. Qualquer objeto que a assine pode substituir outro no sistema.

Palavras-chave: `abstract class` · `interface` · `protocol` · métodos obrigatórios

---

## Por que dominar POO?

- **Escalabilidade** — sistemas complexos crescem de forma organizada e previsível.
- **Manutenção** — menos repetição (DRY) e erros isolados mais fáceis de rastrear.
- **Testabilidade** — abstrações e interfaces permitem substituir dependências por mocks em testes.
