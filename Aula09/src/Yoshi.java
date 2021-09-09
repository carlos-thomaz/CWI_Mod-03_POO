public class Yoshi extends Personagem{
    private int frutasComidas;
    private int velocidade;

    public Yoshi(String nome, int idade, double altura){
        super (nome, idade, altura);
        this.frutasComidas = 0;
        this.velocidade = 10;
    }
    public void comerFruta(){
        frutasComidas++;
        if(this.frutasComidas % 2 ==0){
            this.velocidade *= 2;
        }
    }
    public int getVelocidade(){
        return velocidade;
    }
}
