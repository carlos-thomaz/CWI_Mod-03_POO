public class Mario {
    public String nome;
    protected double altura;
    private int idade;
    public String corPele;
    protected boolean bigode;
    private String nascionalidade;
    public  String skill01;
    private String skill02;
    protected String skill03;

    public void showInfos(){
        System.out.println(
            "Nome: " + nome + " | " + "Altura: " + altura + " | " + "Idade: " + (idade=46)
            + " | " + "Cor da Pele: " + corPele + " | " + "Bigode: " + bigode + " | "
            + "Nascionalidade: " + (nascionalidade="Italiano"));
    }
    public void showPowers(){
        System.out.println(
            "Habilidade #01: " + skill01 + " | " + "Habilidade #02: " + (skill02="Super Velocidade")
            + " | " + "Habilidade #03: " + skill03);
    }
}
