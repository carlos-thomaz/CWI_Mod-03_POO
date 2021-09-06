//Características da Classe
public class Mario {
    private String nome;
    private double altura;
    private int idade;
    private int stamina;
//Método Construtor
    public Mario() {
        this.nome = "Mario Bros";
        this.altura = 1.50;
        this.idade = 40;
        this.stamina = 100;
    }
    public Mario(String nome, double altura, int idade, int stamina) {
        this.nome = nome;
        this.altura = altura;
        this.idade = idade;
        this.stamina = 100;
    }
//Métodos de Funções
    public void showSkills(){
        System.out.println( "Super Força, Super Pulo e Super Velocidade");
    }
    public void showInfo(){
        System.out.println(
                "Nome: " + nome +
                " | Altura: " + altura +
                " | Idade: " + idade +
                " | Stamina: " + stamina
        );
    }
    public void loseStamina(){
        this.stamina = this.stamina -100;
        if( this.stamina <0){
            this.stamina = 0;
        }
    }
    public void gainStamina(){
        this.stamina = this.stamina + 5;
        if (this.stamina >100) {
            this.stamina = 100;
        }
    }
    public void grow(){
        this.altura = this.altura * 2;
    }
//Getters e Setters
    public String getNome(){
        return nome;
    }
    public void setNome (String nome){
        this.nome = nome;
    }
    public double getAltura(){
        return altura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public int getIdade (){
        return idade;
    }
    public void setIdade (int idade){
        this.idade = idade;
    }
    public int getStamina() {
        return stamina;
    }
    public void setStamina(int stamina) {
        this.stamina = stamina;
    }
}
