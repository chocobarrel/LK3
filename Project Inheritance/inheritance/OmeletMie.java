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
        System.out.println("Mie untuk omelet direbus!");
    }

    public void tambahTelur(int telur) {
        this.telur =  telur;
    }

    public void tambahDaunBawang(int daunBawang){
        this.daunBawang = daunBawang;
    }

    public void digoreng() {
        System.out.println("Omelet mie digoreng!");
    }
}
