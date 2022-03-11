package advanceprogramming;

import java.util.*;

class AkunBank {
     String nama;
    double saldo;
    String nasabahID;
    String statusNasabah;
    double jumlahTransfer;
    double biayaAdmin;

    public static Scanner inp = new Scanner(System.in);

    public akunBank(){
        // no-argument
    }

    public akunBank(String nama, double saldo){
        this.nama = nama;
        this.saldo = saldo;
    }

    public akunBan(String nama, double saldo, String nasabahID){
        this.nama = nama;
        this.saldo = saldo;
        this.nasabahID = nasabahID;
    }

    private void jenisNasabah(String nasabahID) {
        // Wir, minta tolong gaweno body seng gawe nentukno status nasabah
        
    }

    public void infoAkun() {

    }

    public void cekSaldo(){
        System.out.printf("Rekening anda memiliki saldo sebesar %,.2f", this.saldo);
        System.out.println();
    }

    private void biayaAdmin(){
        biayaAdmin = jumlahTransfer * 0.001;
    }

    private void biayaAdmin(String statusNasabah){
        switch (statusNasabah) {
            case "silver" :
                biayaAdmin = jumlahTransfer * 0.002;
                break;
            case "gold" :
                biayaAdmin = jumlahTransfer * 0.005;
                break;
            case "platinum" :
                biayaAdmin = jumlahTransfer * 0.01;
                break;
        }
                
    }
    
   public void setorTunai(double uangSetor){
        this.saldo += uangSetor;
        System.out.printf("Anda telah menyetorkan uang dari rekening anda sebesar %,.2f", uangSetor);
        System.out.println();
    }

    public void tarikTunai(double uangTarik){
        this.saldo -= uangTarik;
        System.out.printf("Anda telah mengambil uang dari rekening anda sebesar %,.2f", uangTarik);
        System.out.println();
    }

    public void transfer(){
        jumlahTransfer = inp.nextDouble();
        if (statusNasabah == null){
            biayaAdmin();
        }
        else {
            biayaAdmin(statusNasabah);
        }
       this.saldo -= (jumlahTransfer + biayaAdmin);
    }
}


public class Main {
    public static void main(String[] args) {
        
    }
}
