package advanceprogramming;

import java.util.*;

import javaapplication1.AkunBank;

/** DOKUMENTASI (Hanif)
 *      Program 
 *  
 *  
 */

class AkunBank {
    String nama;
    double saldo;
    String nasabahID;
    String statusNasabah;
    double jumlahTransfer;
    double biayaAdmin;
    String namaTujuan;
    double uangSetor;
    double uangTarik;

    public static Scanner inp = new Scanner(System.in);

    public AkunBank(){
        // no-argument
    }

    public AkunBank(String nama, double saldo){
        this.nama = nama;
        this.saldo = saldo;
        this.nasabahID = "000";
        this.statusNasabah = "Non-member";
    }

    public AkunBank(String nama, double saldo, String nasabahID, String statusNasabah) {
        this.nama = nama;
        this.saldo = saldo;
        this.nasabahID = nasabahID;
        this.statusNasabah = statusNasabah;
    }


    public void infoAkun() {
        System.out.printf("Nama Nasabah     : %s\n",this.nama);
        System.out.printf("Jumlah Saldo     : Rp %,.2f\n",this.saldo);
        System.out.printf("Nomor ID Nasabah : %s\n",this.nasabahID);
        System.out.printf("Jenis Nasabah    : %s\n",this.statusNasabah);
        System.out.println();
    }

    public void cekSaldo(){
        System.out.printf("Rekening anda memiliki saldo sebesar Rp %,.2f \n", this.saldo);
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
    
   public void setorTunai(){
        // (Wira) isi perintah 
        uangSetor = inp.nextDouble();
        this.saldo += uangSetor;
        System.out.printf("Anda telah menyetorkan uang dari rekening anda sebesar Rp %,.2f \n", uangSetor);
        System.out.println();
    }

    public void tarikTunai(){
         // (Wira) isi perintah
        uangTarik = inp.nextDouble();
        this.saldo -= uangTarik;
        System.out.printf("Anda telah mengambil uang dari rekening anda sebesar Rp %,.2f \n", uangTarik);
        System.out.println();
    }

    public void transfer(){
        System.out.print("Masukkan jumlah yang ingin ditransfer : ");
        jumlahTransfer = inp.nextDouble();
        inp.nextLine();
        System.out.print("Masukkan nama rekening tujuan         : ");
        namaTujuan = inp.nextLine();
        System.out.println();
        if (statusNasabah == null){
            biayaAdmin();
        }
        else {
            biayaAdmin(statusNasabah);
        }
       this.saldo -= (jumlahTransfer + biayaAdmin);
       System.out.printf("Anda telah mentransfer uang sebesar Rp %,.2f kepada %s \n", jumlahTransfer, namaTujuan);
       System.out.println();
    }
}


public class Main {
    public static void main(String[] args) {
        // (Wira) Skenario
        AkunBank c1 = new AkunBank("Anton", 1000000);
        c1.infoAkun();
        c1.setorTunai();
        c1.cekSaldo();
        AkunBank c2 = new AkunBank("Zahra", 50000000, "002", "platinum");
        c2.infoAkun();
        c2.transfer();
        c2.cekSaldo();
    }
}
