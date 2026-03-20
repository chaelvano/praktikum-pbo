/*  Nama file: Titik.java
    Deskripsi: Kelas Titik untuk merepresentasikan titik dalam bidang 2D
    Pembuat: Michael Stevano (24060124140187)
    Tanggal: 18 Februari 2026
*/

public class Titik {
    double absis;
    double ordinat;

    Titik() {
        this.absis = 0;
        this.ordinat = 0;
    }

    Titik(double x, double y) {
        this.absis = x;
        this.ordinat = y;
    }

    double getAbsis() {
        return this.absis;
    }

    void setAbsis(double x) {
        this.absis = x;
    }

    double getOrdinat() {
        return this.ordinat;
    }

    void setOrdinat(double y) {
        this.ordinat = y;
    }

    void geser(double x, double y) {
        this.absis += x;
        this.ordinat += y;
    }

    void printTitik() {
        System.out.println("Titik (" + this.absis + ", " + this.ordinat + ")");
    }

    @Override   // kali aja perlu
    public String toString() {
        return "Titik (" + this.absis + ", " + this.ordinat + ")";
    }
}
