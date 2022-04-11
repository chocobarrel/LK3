package inheritance;

public class OmeletMie extends Mie {

    private int telur;
    private int daunBawang;

    public OmeletMie(){
        // no-argument
    }

    public OmeletMie(int telur, int daunBawang){
        this.telur = telur;
        this.daunBawang = daunBawang;
    }

    @Override
    public void direbus() {
        super.direbus();
        System.out.println("Mie untuk omelet telah direbus!");
    }

    public void disajikan() {
        System.out.println("Omelet mie siap disajikan!");
    }

    public void tambahTelur(int telur) {
        this.telur =  telur;
        System.out.println("Menambahkan telur ke mie sebanyak " + this.telur + " butir");
    }

    public void tambahDaunBawang(int daunBawang){
        this.daunBawang = daunBawang;
        System.out.println("Menambahkan daun bawang ke mie sebanyak " + this.daunBawang + " sendok");
    }

    public void digoreng() {
        System.out.println("Omelet mie digoreng!");
    }
}
