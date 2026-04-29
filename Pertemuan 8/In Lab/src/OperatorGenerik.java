/*  Nama file: OperatorGenerik.java
    Deskripsi: Utility class OperatorGenerik yang memiliki fungsi statik tukar dan bobot2
    Pembuat: Michael Stevano (24060124140187)
    Tanggal: 29 April 2026
*/

public class OperatorGenerik {
    public static <T> void tukar(Datum<T> a, Datum<T> b) {
        T temp = a.getIsi();
        a.setIsi(b.getIsi());
        b.setIsi(temp);
    }

    public static Double bobot2(Kucing a, Kucing b) {
        return a.getBobot() + b.getBobot();
    }
}