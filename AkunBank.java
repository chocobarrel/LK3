

package javaapplication1;

/**
 *
 * @author Hanif
 */
public class AkunBank {
    
    String nama;
    double saldo;
    String bankID;

    public AkunBank(){
        //no-argument
    }

    public AkunBank(String nama, double saldo){
        this.nama = nama;
        this.saldo = saldo;
    }

    public AkunBank(String nama, double saldo, String bankID){
        this.nama = nama;
        this.saldo = saldo;
        this.bankID = bankID;
    }

    public void cekAkun(){
        System.out.println(this.nama);
        System.out.println(this.saldo);
        System.out.println(this.bankID);
    }

    public void isiSaldo(double uangSetor){
        this.saldo = saldo + uangSetor;
    }

    public void ambilSaldo(double uangAmbil){
        this.saldo = saldo + uangAmbil;
    }

}
