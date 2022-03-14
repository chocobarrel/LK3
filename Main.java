package advanceprogramming;

import java.util.*;

import javaapplication1.AkunBank;

/** TENTANG PROGRAM
*   Disini kami memiliki sebuah bank yaitu Bank Central FILKOM. Pada bank ini terdapat 2 jenis nasabah yaitu
    1. Non member (Yang harus diinputkan adalah nama dan saldo awal)
    2. Member (Yang harus diinputkan adalah nama, saldo, ID nasabah dan jenis member)                
    Nasabah member sendiri memiliki 3 jenis yaitu :
            a. Silver
            b. Gold
            c. Platinum

    Setiap jenis member memiliki biaya admin yang berbeda yaitu :
    1. Silver (member silver memiliki biaya admin sebesar 0,2%)
    2. Gold (Member gold memiliki biaya admin sebesar 0,5%)
    3. Platinum (Member platinum memiliki biaya admin sebesar 1%)
    4. Non member memiliki biaya admin sebesar 0,1%

    Terdapat beberapa pelayanan yang diberikan untuk nasabah yaitu :
    1. Nasabah bisa melihat informasi akun
    2. Nasabah dapat menarik uang tunai dari rekening
    3. Nasabah dapat menyetorkan sejumlah uang ke dalam rekening
    4. Nasabah dapat mentransfer sejumlah uang ke nasabah lain 
 */

 /** SKENARIO
  *  1. Nasabah member silver menyetor uang dan mengecek akun nasabah
     2. Nasabah non-member menarik uang dan mengecek saldo
     3. Nasabah member platinum mentransfer uang dan menarik uang
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
    }

    public AkunBank(String nama, double saldo, String nasabahID, String statusNasabah) {
        this.nama = nama;
        this.saldo = saldo;
        this.nasabahID = nasabahID;
        this.statusNasabah = statusNasabah;
    }


    public void infoAkun() {
        System.out.println("----------------------------------------------");
        System.out.println("|   INFO AKUN NASABAH BANK CENTRAL FILKOM    |");
        System.out.println("----------------------------------------------");
        System.out.printf("| Nama Nasabah     : %-14s          |\n",this.nama);
        System.out.printf("| Jumlah Saldo     : Rp %,-16.2f     |\n",this.saldo);
        System.out.printf("| Nomor ID Nasabah : %-14s          |\n",this.nasabahID);
        if (this.statusNasabah != null){
        System.out.printf("| Jenis Nasabah    : %-14s          |\n",this.statusNasabah);    
        }
        else {  
        }
        System.out.println("----------------------------------------------");
        System.out.println();
    }

    public void cekSaldo(){
        System.out.println("-----------------------------------------------------------");
        System.out.println("                  INFORMASI JUMLAH SALDO                  |");
        System.out.println("-----------------------------------------------------------");
        System.out.printf("Rekening anda memiliki saldo sebesar Rp %,-15.2f   |\n", this.saldo);
        System.out.println("-----------------------------------------------------------");
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
        System.out.print("Masukkan jumlah uang yang akan ditambahkan ke dalam rekening : ");
        uangSetor = inp.nextDouble();
        this.saldo += uangSetor;
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("|                       INFORMASI PENYETORAN UANG TUNAI                     |");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.printf("| Anda telah menyetorkan uang dari rekening anda sebesar Rp %,-17.2f |\n", uangSetor);
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println();
    }

    public void tarikTunai(){
        System.out.print("Masukkan jumlah uang yang akan diambil dari rekening : ");
        uangTarik = inp.nextDouble();
        this.saldo -= uangTarik;
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("|                       INFORMASI PENARIKAN UANG TUNAI                      |");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.printf("| Anda telah mengambil uang dari rekening anda sebesar Rp %,-17.2f |\n", uangTarik);
        System.out.println("-----------------------------------------------------------------------------");
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
       System.out.println("-----------------------------------------------------------");
       System.out.println("|                    TANDA BUKTI TRANFER                  |");
       System.out.println("-----------------------------------------------------------");
       System.out.printf("| Anda telah mentransfer uang sebesar : Rp %,-14.2f |\n", jumlahTransfer);
       System.out.printf("| Kepada                              : %-17s |\n", namaTujuan);
       System.out.printf("| Dengan biaya admin sebesar          : Rp %,-14.2f |\n", biayaAdmin);
       System.out.println("-----------------------------------------------------------");
       System.out.println();
    }
}


public class Main {
    public static void main(String[] args) {

        // Nasabah member silver menyetor uang dan mengecek akun nasabah
        AkunBank c1 = new AkunBank("Bima Zulva", 2000000, "001", "silver");
        c1.setorTunai();
        c1.infoAkun();

        // Nasabah non-member menarik uang dan mengecek saldo
        AkunBank c2 = new AkunBank("Silva Kharisma", 700000);
        c2.tarikTunai();
        c2.cekSaldo();

        // Nasabah member platinum mentransfer dan menarik uang
        AkunBank c3 = new AkunBank("Nizam Ardian", 300000000, "002", "platinum");
        c3.transfer();
        c3.tarikTunai();
        c3.infoAkun();
    }
}
