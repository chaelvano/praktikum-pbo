/*  Nama file: MOperatorGenerik.java
    Deskripsi: Main class untuk mengilustrasikan konsep generik pada operator dalam polimorfisme
    Pembuat: Michael Stevano (24060124140187)
    Tanggal: 29 April 2026
*/

public class MOperatorGenerik {
    public static void main(String[] args) {
        Datum<Integer> I1 = new Datum<>();
        Datum<Integer> I2 = new Datum<>();
        Datum<String> S1 = new Datum<>();
        Datum<String> S2 = new Datum<>();
        Datum<Anabul> A1 = new Datum<>();
        Datum<Anabul> A2 = new Datum<>();
        Kucing K1 = new Anggora("Thomas", 4.5);
        Kucing K2 = new KembangTelon("Toodles", 3.1);

        I1.setIsi(1);
        I2.setIsi(2);

        S1.setIsi("foo");
        S2.setIsi("bar");

        A1.setIsi(new Anjing());
        A2.setIsi(new Kucing());

        System.out.println("I1: " + I1.getIsi());
        System.out.println("I2: " + I2.getIsi());

        OperatorGenerik.tukar(I1, I2);
        
        System.out.println("I1: " + I1.getIsi());
        System.out.println("I2: " + I2.getIsi());

        System.out.println("S1: " + S1.getIsi());
        System.out.println("S2: " + S2.getIsi());
        
        OperatorGenerik.tukar(S1, S2);
        
        System.out.println("S1: " + S1.getIsi());
        System.out.println("S2: " + S2.getIsi());

        System.out.print("Suara A1: ");
        A1.getIsi().bersuara();
        System.out.print("Suara A2: ");
        A2.getIsi().bersuara();
        
        OperatorGenerik.tukar(A1, A2);
        
        System.out.print("Suara A1: ");
        A1.getIsi().bersuara();
        System.out.print("Suara A2: ");
        A2.getIsi().bersuara();

        System.out.println("Bobot K1: " + K1.getBobot());
        System.out.println("Bobot K2: " + K2.getBobot());

        System.out.println("Bobot2: " + OperatorGenerik.bobot2(K1, K2));
    }
}