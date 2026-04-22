/*  Nama file: Coercion.java
    Deskripsi: Class Coercion untuk mengilustrasikan konsep coercion dalam polimorfisme
    Pembuat: Michael Stevano (24060124140187)
    Tanggal: 22 April 2026
*/

public class Coercion {
    public static void main(String[] args) throws Exception {
        int x = 65;
        
        System.out.println("x = " + x);
        System.out.println("(char) x = " + (char) x);
        System.out.println("(double) x = " + (double) x);

        double y = (double) x;
        int z = (int) y;

        System.out.println("y = " + y);
        System.out.println("z = " + z);

        String X = "1234";
        String Y = "5678";
        String S = X + Y;
        Integer Z = Integer.parseInt(X) + Integer.parseInt(Y);

        System.out.println("S = " + S);
        System.out.println("Z = " + Z);

        String P = "12.34";
        String Q = "56.78";
        String R = P + Q;
        Double D = Double.parseDouble(P) + Double.parseDouble(Q);

        System.out.println("R = " + R);
        System.out.println("D = " + D);

        Integer A = Integer.parseInt(S);

        System.out.println("A = " + A);

        String T = A.toString();

        System.out.println("T = " + T);
    }
}
