public class app {
    public static void main(String[] args) {
        Mario mario = new Mario();
        mario.nome = "Mario Bros";
        mario.altura = 1.52;
        mario.idade = 46;

        mario.imprimeCaracteristicas();
        mario.imprimePoderes();
    }
}