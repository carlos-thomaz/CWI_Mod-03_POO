public class App {
    public static void main(String[] args) {
        System.out.println("Perda de Stamina");
        Mario mario1 = new Mario();
        mario1.showInfo();
        mario1.loseStamina();
        mario1.showInfo();
        System.out.println("____________________");

        System.out.println("Ganho de Stamina");
        Mario mario2 = new Mario();
        mario2.showInfo();
        mario2.loseStamina();
        mario2.loseStamina();
        mario2.gainStamina();
        mario2.showInfo();
        System.out.println("____________________");

        System.out.println("Limite de ganho de Stamina");
        Mario mario3 = new Mario();
        mario3.showInfo();
        mario3.gainStamina();
        mario3.gainStamina();
        mario3.showInfo();
        System.out.println("____________________");

        System.out.println("Limite de perda de Stamina");
        Mario mario4 = new Mario();
        mario4.showInfo();
        mario4.loseStamina();
        mario4.showInfo();
        mario4.loseStamina();
        mario4.showInfo();
        System.out.println("____________________");

        System.out.println("Crescimento");
        Mario mario5 = new Mario();
        mario5.showInfo();
        mario5.grow();
        mario5.showInfo();
        System.out.println("____________________");
    }

}
