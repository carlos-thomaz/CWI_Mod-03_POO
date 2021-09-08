public class App {
    public static void main(String[] args) {
        Personagem mario = new Personagem("Mario", 1.60, 40);
        Personagem luigi = new Personagem("Luigi", 1.80, 40);

        Jogo jogo = new Jogo(mario, luigi);
        jogo.Jogar();
    }
}
