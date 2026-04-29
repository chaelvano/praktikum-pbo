/*  Nama file: MData.java
    Deskripsi: Main class untuk mengilustrasikan konsep generik pada larik dalam polimorfisme
    Pembuat: Michael Stevano (24060124140187)
    Tanggal: 29 April 2026
*/

public class MData {
    public static void main(String[] args) {
        Data<Anabul> D = new Data<>();

        D.setIsi(1, new KembangTelon("Thomas", 4.5));
        D.setIsi(2, new Anggora("Toodles", 3.1));
        D.setIsi(3, new Kucing());
        D.setIsi(4, new Anjing());
        D.setIsi(100, new Burung());

        System.out.println("Size D: " + D.getSize());

        D.getIsi(1).gerak();
        D.getIsi(1).bersuara();

        D.getIsi(2).gerak();
        D.getIsi(2).bersuara();

        D.getIsi(3).gerak();
        D.getIsi(3).bersuara();

        D.getIsi(4).gerak();
        D.getIsi(4).bersuara();

        D.getIsi(100).gerak();
        D.getIsi(100).bersuara();
    }
}