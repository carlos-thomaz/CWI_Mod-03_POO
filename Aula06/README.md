## Exercício

Baseado nesta aula e na leitura complementar da [aula 4](../aula04/aula.md). Altere o código do exercío que estamos desenvolvendo desde a [segunda aula](../aula02/resolucao.md) e implemente as seguintes mudanças:

### Nível 1
* Elimine os métodos _getters_ e _setters_.
* Crie um atributo que registra a quantidade de moedas coletadas. Esse atributo deve inicializar com zero.
* Crie um atributo que registra a quantidade de vidas. Esse atributo deve incializar com um.
* Crie um método `revigorar()` que reinicia estamina do Mario em 100.

### Nível 2
* Crie um método `morrer()` que zera a estamina do Mario e desconta uma vida.

### Nivel 3
* Crie um método que para coletar moedas que, a cada acionamento, acrescenta 1 na quantidade de moedas atual.
    * A cada 10 moedas coletadas, o Mario deve ganhar uma vida.

* No método `morrer()`
    * Se o número de vidas for menor que zero após o desconto, a quantidade deve permanecer em zero.
    * Se o número de vidas for maior ou igual a zero, a estamina deve revigorar após o desconto.

Por fim, crie uma classe com método `main()`, instancie objetos do Mario e teste sua implementação.