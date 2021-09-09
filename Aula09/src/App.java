public class App {
    public static void main(String[] args) {
        Mario mario = new Mario ("Mario", 40, 1.60);
        Luigi luigi = new Luigi("Luigi", 37, 1.80);
        Yoshi yoshi = new Yoshi("Yoshi", 94, 0.85);

        // Teste para verificar se o Mario monta no Yoshi
        mario.statusYoshi();
        mario.montarYoshi();
        mario.statusYoshi();

        // Teste para verificar se o Luigi voa
        luigi.voar();

        System.out.println("Velocidade atual: "+ yoshi.getVelocidade());
        yoshi.comerFruta();
        System.out.println("Velocidade atual: "+ yoshi.getVelocidade());
        yoshi.comerFruta();
        System.out.println("Velocidade atual: "+ yoshi.getVelocidade());
        yoshi.comerFruta();
        yoshi.comerFruta();
        System.out.println("Velocidade atual: "+ yoshi.getVelocidade());

    }
}
