public class App {
    public static void main(String[] args) {
        Mario mario1 = new Mario();
        mario1.showInfo();
        mario1.showSkills();
        System.out.println("_____________________________________");

        Mario mario2 = new Mario("Super Mario", 1.25 , 40, 100);
        mario2.showInfo();
        mario2.showSkills();
        System.out.println("_____________________________________");

        Mario mario3 = new Mario("Super Mario Bros", 1.50, 45, 100);
        mario3.showInfo();
        mario3.setNome("It's Me, Mario!");
        mario3.setIdade(50);
        mario3.showInfo();
        mario3.showSkills();
    }
}
