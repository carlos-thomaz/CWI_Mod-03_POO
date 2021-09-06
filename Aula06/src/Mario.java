public class Mario {
//Atributos
    private String nome;
    private double altura;
    private int idade;
    private int stamina;
    private int coin;
    private int life;
//Construtor #01
    public Mario(String nome, double altura, int idade, int stamina, int coin, int life) {
        this.nome = nome;
        this.altura = altura;
        this.idade = idade;
        this.stamina = stamina;
        this.coin = coin;
        this.life = life;
    }
//Construtor #02
    public Mario(){
        this.nome = "Mario Bros";
        this.altura = 1.50;
        this.idade = 40;
        this.stamina = 100;
        this.coin = 0;
        this.life = 1;
    }
//Funções
    public void rest(){
        this.stamina = 100;
    }
    public void die(){
        this.life --;
        this.life = 0;
        if  (this.life < 0){
            life = 0;
        } else {
            rest();
        }
    }
    public void pickCoin(){
        this.coin++;

        if (this.coin %10 == 0){
            this.life++;
        }
    }
    public void showInfo(){
        System.out.println(
                "Nome: " + nome +
                " |  Altura: " + altura +
                " |  Idade: "  + idade +
                " |  Stamina: " + stamina +
                " |  Moedas: "  + coin +
                " |  Vidas: "  + life
        );
    }
    public void loseStamina(){
        this.stamina = this.stamina -10;
        if (this.stamina < 0){
            this.stamina = 0;
        }
    }
    public void gainStamina(){
        this.stamina = this.stamina + 10;
        if (this.stamina > 100){
            this.stamina = 100;
        }
    }
    public void grow(){
        this.altura = this.altura * 2;
    }
//GetSet

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getCoin() {
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }
}