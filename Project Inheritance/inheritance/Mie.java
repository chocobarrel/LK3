package inheritance;

public class Mie {
    private final int beratOriginal = 100;
    private int beratTotal;
    private int porsi;

    public Mie(){
        //no-argument
    }

    public Mie(int porsi){
        this.beratTotal = this.beratOriginal;
        this.porsi = porsi;
    }

    public void direbus() {
        System.out.println("Mie Direbus!");
    }

    public void disajikan(){
        System.out.println("Mie siap disajikan");
    }

    public void tambahBerat(int beratTambahan) {
        this.beratTotal =  this.beratOriginal +  beratTambahan;
    }
}
