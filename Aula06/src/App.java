public class App {
    public static void main(String[] args) {
        System.out.println("Listando todas características:");
        Mario mario1 = new Mario();
        mario1.showInfo();
        System.out.println("____________________________________________________________");

        System.out.println("Teste de regeneração de stamina:");
        Mario mario2 = new Mario();
        mario2.showInfo();
        mario2.loseStamina();//-10 Stamina
        mario2.loseStamina();//-10 Stamina
        mario2.showInfo();
        mario2.rest();
        mario2.showInfo();
        System.out.println("____________________________________________________________");

        System.out.println("Quantidade de moedas:");
        Mario mario3 = new Mario();
        mario3.showInfo();
        mario3.pickCoin();
        mario3.pickCoin();
        mario3.pickCoin();
        mario3.showInfo();
        System.out.println("____________________________________________________________");

        System.out.println("Quantidade de vida regenerada a cada 10 moedas coletadas:");
        Mario mario4 = new Mario();
        mario4.showInfo();

        mario4.pickCoin();
        mario4.pickCoin();
        mario4.pickCoin();
        mario4.pickCoin();
        mario4.pickCoin();
        mario4.pickCoin();
        mario4.pickCoin();
        mario4.pickCoin();
        mario4.pickCoin();
        mario4.pickCoin();

        mario4.showInfo();

        mario4.pickCoin();
        mario4.pickCoin();
        mario4.pickCoin();
        mario4.pickCoin();
        mario4.pickCoin();
        mario4.pickCoin();
        mario4.pickCoin();
        mario4.pickCoin();
        mario4.pickCoin();
        System.out.println("____________________________________________________________");

        System.out.println("Teste de perda de vida quando morrer:");
        Mario mario5 = new Mario();
        mario5.showInfo();

        mario5.pickCoin();
        mario5.pickCoin();
        mario5.pickCoin();
        mario5.pickCoin();
        mario5.pickCoin();
        mario5.pickCoin();
        mario5.pickCoin();
        mario5.pickCoin();
        mario5.pickCoin();
        mario5.pickCoin();
        mario5.showInfo();
        //coletar 10 moedas para ganhar uma vida primeiro
        mario5.die();
        mario5.showInfo();
        System.out.println("____________________________________________________________");

        System.out.println("Teste de resetar a Stamina quando morrer:");
        Mario mario6 = new Mario();
        mario6.showInfo();
        mario6.pickCoin();
        mario6.pickCoin();
        mario6.pickCoin();
        mario6.pickCoin();
        mario6.pickCoin();
        mario6.pickCoin();
        mario6.pickCoin();
        mario6.pickCoin();
        mario6.pickCoin();
        mario6.pickCoin();
        mario6.loseStamina();
        mario6.showInfo();
        mario6.die();
        mario6.showInfo();
        System.out.println("____________________________________________________________");

        System.out.println("Teste de quantidade de vidas depois de morrer 2 vezes:");
        Mario mario7 = new Mario();
        mario7.showInfo();
        mario7.die();
        mario7.die();
        mario7.showInfo();
        System.out.println("____________________________________________________________");
    }
}

