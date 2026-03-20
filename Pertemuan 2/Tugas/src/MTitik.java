/*  Nama file: MTitik.java
    Deskripsi: Kelas Main untuk menguji kelas Titik
    Pembuat: Michael Stevano (24060124140187)
    Tanggal: 25 Februari 2026
*/

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();

        T1.geser(3, 4);
        T1.printTitik();

        Titik T2 = T1;  // assign memory address T1 ke T2
        T2.printTitik();

        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik();

        Titik T3 = new Titik(2, -3);
        System.out.println("Absis T3: " + T3.getAbsis());
        System.out.println("Ordinat T3: " + T3.getOrdinat());
        T3.printTitik();

        System.out.println("Jumlah objek Titik = " + Titik.getCounterTitik());

        System.out.println("Kuadran T1: " + T1.getKuadran());

        System.out.println("Jarak T1 ke pusat (0, 0): " + T1.getJarakPusat());

        System.out.println("Jarak T1 ke T3: " + T1.getJarak(T3));

        System.out.println("Refleksi T1 terhadap sumbu X: " + T1.getRefleksiX());
        T1.refleksiX();
        T1.printTitik();

        System.out.println("Refleksi T1 terhadap sumbu Y: " + T1.getRefleksiY());
        T1.refleksiY();
        T1.printTitik();
    }
}