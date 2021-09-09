### Atividade

Baseado nos aprendizados sobre herança vistos nesta aula, vamos tonar o Mario, o Luigi e o Yoshi personagens especializados da classe jogador. Desta forma, passarão a compartilhar dos mesmos atributos e comportamentos da classe jogador, mas terão suas próprias características.

### Nível 1
* Torne a classe `Personagem` abstrata.
* Crie a classe `Mario` que extende `Personagem`.
* Crie a classe `Luigi` que extende `Personagem`.
* Crie a classe `Yoshi` que extende `Personagem`.
* Tente instanciar um objeto do tipo Personagem e veja o que acontece.

### Nível 2
* Para o `Mario`:
    * Adicione um atributo do tipo `Yoshi`.
    * Crie um método `montarNoYoshi()` que recebe um `Yoshi` como parâmetro.
        * Este metodo registra o `Yoshi` recebido no seu respectivo atributo.
    * Crie um método que imprime se o Mario está montado no `Yoshi`.
* Para o Luigi
    * Crie um método `voar()` que simplesmente imprime uma mensagem "Luigi está voando".

### Nível 3
* Para o `Yoshi`:
    * Crie um atributo para registrar a quantidade de frutas que ele come e que deve ser inicializado com 0.
    * Crie um atributo para registrar a velocidade e que deve ser inicializado com 10;
    * Crie um método `get` para a velocidade.
    * Crie um método `comerFruta()` que acrescenta 1 na quantidade de frutas comidas.
        * A cada 2 frutas, a velocidade do Yoshi dobra.

Por fim, crie uma classe com método `main()`, instancie objetos do Mario, do Luigi, do Yoshi e teste sua implementação.