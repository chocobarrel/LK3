package inheritance;

public class Mie {
    private int berat;
    private int porsi;

    public Mie(){
        //no-argument
    }

    public Mie(int berat, int porsi){
        this.berat = berat;
        this.porsi = porsi;
    }

    public void direbus() {
        System.out.println("Mie Direbus!");
    }
}
