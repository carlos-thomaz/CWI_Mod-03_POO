import java.util.Random;

public class Jogo {
    private Personagem p01;
    private Personagem p02;

    public Jogo(Personagem p01, Personagem p02){
        this.p01 = p01;
        this.p02 = p02;
    }
    public void Jogar (){
        Random genRandom = new Random();

        int coletaP01 = genRandom.nextInt(30);
        for (int i =0; i < coletaP01; i++){
            p01.coletarMoeda();
        }
        int coletaP02 = genRandom.nextInt(30);
        for  (int i=0; i <coletaP02; i++){
            p02.coletarMoeda();
        }
        System.out.println("Moedas coletadas pelo Jogador 01: "+ coletaP01);
        System.out.println("Resultado final do Jogador 01: ");
        p01.showInfo();

        System.out.println("Moedas coletadas pelo Jogador 02: "+ coletaP02);
        System.out.println("Resultado final do Jogador 02: ");
        p01.showInfo();
    }
}
