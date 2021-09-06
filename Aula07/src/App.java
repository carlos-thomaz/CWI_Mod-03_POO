public class App {

    public static void main(String[] args) {
        System.out.println("Teste de altura do pulo do Mario");
        Personagem char01 = new Personagem("Mario", 1.60, 40);
        char01.showInfo();
        char01.saltar();
        System.out.println("____________________");

        System.out.println("Teste de altura do pulo do Luigi");
        Personagem char02 = new Personagem("Luigi", 1.80, 40);
        char02.showInfo();
        char02.saltar();
        System.out.println("____________________");
    }
}
