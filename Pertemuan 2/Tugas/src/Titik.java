/*  Nama file: Titik.java
    Deskripsi: Kelas Titik untuk merepresentasikan titik dalam bidang 2D
    Pembuat: Michael Stevano (24060124140187)
    Tanggal: 25 Februari 2026
*/

public class Titik {
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    public Titik() {
        this.absis = 0;
        this.ordinat = 0;
        counterTitik += 1;
    }

    public Titik(double x, double y) {
        this.absis = x;
        this.ordinat = y;
        counterTitik += 1;
    }

    public double getAbsis() {
        return this.absis;
    }

    public void setAbsis(double x) {
        this.absis = x;
    }

    public double getOrdinat() {
        return this.ordinat;
    }

    public void setOrdinat(double y) {
        this.ordinat = y;
    }

    public static int getCounterTitik() {
        return counterTitik;
    }

    public void geser(double x, double y) {
        this.absis += x;
        this.ordinat += y;
    }

    public int getKuadran() {
        if (this.absis > 0 && this.ordinat > 0) {
            return 1;
        } else if (this.absis < 0 && this.ordinat > 0) {
            return 2;
        } else if (this.absis < 0 && this.ordinat < 0) {
            return 3;
        } else if (this.absis > 0 && this.ordinat < 0) {
            return 4;
        } else {
            return 0;   // Titik berada di garis sumbu
        }
    }

    public double getJarakPusat() {
        return Math.sqrt(Math.pow(this.absis, 2) + Math.pow(this.ordinat, 2));    // (x^2 + y^2)^(1/2)
    }

    public double getJarak(Titik T) {
        return Math.sqrt(Math.pow(this.absis - T.getAbsis(), 2) + Math.pow(this.ordinat - T.getOrdinat(), 2));    // ((x1-x2)^2 + (y1-y2)^2)^(1/2)
    }

    public void refleksiX() {
        this.ordinat *= -1;
    }

    public Titik getRefleksiX() {
        return new Titik(this.absis, this.ordinat * -1);
    }

    public void refleksiY() {
        this.absis *= -1;
    }

    public Titik getRefleksiY() {
        return new Titik(this.absis * -1, this.ordinat);
    }

    public void printTitik() {
        System.out.println("Titik (" + this.absis + ", " + this.ordinat + ")");
    }

    @Override   // kali aja perlu
    public String toString() {
        return "Titik (" + this.absis + ", " + this.ordinat + ")";
    }
}
