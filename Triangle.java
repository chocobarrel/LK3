package advanceprogramming;
/**
 * Nama: Irfan Hanif Habibi
 * NIM: 215150701111025
 * Kelas: TI-C
 * Mata Kuliah: Pemrograman Lanjut
 */
class Triangle {
    private int base;
    private int height;
    private double area;

    public Triangle(){
        // no-argument
    }
    
    public Triangle(int b, int h) {
        this.base = b;
        this.height = h;
    }

    public void setBase(int b){
        this.base = b;
    }

    public void setHeight(int h){
        this.height = h;
    }
    
    public double getArea() {
        this.area = (this.base * this.height) / 2;
        return this.area;
        fhfh
    }
}
