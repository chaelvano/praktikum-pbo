/*  Nama file: MGaris.java
    Deskripsi: Kelas Main untuk menguji kelas Garis
    Pembuat: Michael Stevano (24060124140187)
    Tanggal: 25 Februari 2026
*/

public class MGaris {
    public static void main(String[] args) {
        Garis G1 = new Garis(1, 2, 3, 4);
        G1.printGaris();

        Garis G2 = G1;  // assign memory address G1 ke G2
        G1.setAwal(2, 3);
        G1.setAkhir(3, 4); 
        G2.printGaris();

        Garis G3 = new Garis(new Titik(-1, -1), new Titik(1, 1));
        G3.printGaris();

        System.out.println("Jumlah objek Garis = " + Garis.getCounterGaris());

        System.out.println("Panjang G1: " + G1.getPanjang());

        System.out.println("Gradien G1: " + G1.getGradien());

        System.out.println("Titik Tengah G1: " + G1.getTitikTengah());

        System.out.println("Apakah G1 sejajar dengan G3? " + G1.isSejajar(G3));

        System.out.println("Apakah G1 tegak lurus dengan G3? " + G1.isTegakLurus(G3));
    }
}