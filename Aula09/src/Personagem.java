public class Personagem {
    private String nome;
    private double altura;
    private int idade, stamina, moedas, vidas;

    public Personagem(String nome, int idade, double altura) {
        this.nome = nome;
        this.altura = altura;
        this.idade = idade;
        this.stamina = 100;
        this.moedas = 0;
        this.vidas = 1;
    }

    public void revigorar() {
        this.stamina = 100;
    }

    public void morrer() {
        this.vidas--;
        this.stamina = 0;
        if (this.vidas < 0) {
            vidas = 0;
        } else {
            revigorar();
        }
    }

    public void coletarMoeda() {
        this.moedas++;
        if (this.moedas % 10 == 0) {
            this.vidas++;
        }
    }

    public void showInfo() {
        System.out.println("Nome= " + nome +
                        " |  Altura= " + altura +
                        " |  Idade= " + idade +
                        " |  stamina= " + stamina +
                        " |  Moedas= " + moedas +
                        " |  Vidas= " + vidas);
    }
    public void loseStamina(){
        this.stamina = this.stamina - 10;
        if(this.stamina < 0){
            this.stamina = 0;
        }
    }
    public void gainStamina(){
        this.stamina = this.stamina +5;
        if (this.stamina > 100){
            this.stamina = 100;
        }
    }
    public void grow(){
        this.altura = this.altura *2;
    }
    public void jump(){
        if(this.nome.equals("Mario"))
            System.out.println("Altura do pulo: "+this.altura * 0.5);
        if (this.nome.equals ("Luigi"))
            System.out.println("Altura do pulo: "+ this.altura * 2);
    }
}
