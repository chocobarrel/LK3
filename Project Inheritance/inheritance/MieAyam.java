package inheritance;

public class MieAyam extends Mie {
    
    private int sawi;
    private int ayam;
    private double kuah;
    
    public MieAyam(){
        //no-argument
    }

    public MieAyam(int sawi, int ayam, double kuah) {
        this.sawi = sawi;
        this.ayam = ayam;
        this.kuah = kuah;
    }

    @Override
    public void direbus() {
        System.out.println("Mie Ayam direbus!");
    }

    public void tambahSawi(int sawi) {
        this.sawi = sawi;
    }

    public void tambahAyam(int ayam) {
        this.ayam = ayam;
    }

    public void disiramKuah(){
        System.out.println("Mie Ayam diberi kuah");
    }
}

