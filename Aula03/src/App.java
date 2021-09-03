public class App {
    public static void main(String[] args) {
        Mario mario = new Mario();
        mario.nome = "Mario";
        mario.altura = 1.52;
        mario.bigode = true;
        mario.skill01 = "Super Força";
        mario.skill03 = "Super Pulo";

        mario.showInfos();
        mario.showPowers();
    }
}
