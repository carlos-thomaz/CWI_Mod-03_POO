public class Mario extends Personagem{
    private boolean yoshi;

    public Mario(String nome, int idade, double altura) {
        super(nome, idade, altura);
    }
    public void montarYoshi() {
        this.yoshi = true;
    }
    public void statusYoshi(){
        if (this.yoshi != false) {
            System.out.println("Mario esta montado no Yoshi");
        }else {
            System.out.println("Mario não esta montado no Yoshi");
        }
    }


}
