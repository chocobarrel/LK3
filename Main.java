package advanceprogramming;

import java.util.*;

class AkunBank {
    String nama;
    double saldo;
    String nasabahID;
    String statusNasabah;

    public static Scannner inp = new Scanner(System.in);

    public AkunBank(){
        // no-argument
    }

    public AkunBank(String nama, double saldo){
        this.nama = nama;
        this.saldo = saldo;
        this.statusNasabah = silver;
    }

    public AkunBank(String nama, double saldo, String nasabahID){
        this.nama = nama;
        this.saldo = saldo;
        this.statusNasabah = nasabahID;
    }

    private void jenisNasabah(String nasabahID) {
        // Wir, minta tolong gaweno body seng gawe nentukno status nasabah
        
    }

    public void infoAkun() {

    }

    public void cekSaldo(){

    }

    private void biayaAdmin(){

    }

    private void biayaAdmin(String nasabahID){

    }
    
    public void setorTunai(){

    }

    public void tarikTunai(){

    }

    public void transfer(){
        double jumlahTransfer = inp.nextDouble();
        if (statusNasabah = null) {
            biayaAdmin(double jumlahTransfer);
        } 
        this.saldo = this.saldo - jumlahTransfer;
    }
}


public class Main {
    public static void main(String[] args) {
        
    }
}
