package ba.unsa.etf.rpr.t2;

public class Math {

    public final static double PI = 3.14159265358979323846;
    /**
     * metoda koja računa sinus poslanog broja
     */
    public static double sin(double x){
        double suma = 0;
        for(int i=0; i <= 5; i = i + 1){
            suma = suma + power(-1, i) * power(x, 2 * i + 1) / faktorijel(2 * i + 1);
        }
        return suma;
    }

    /**
     * racuna faktorijel proslijeđenog broja
     * @param x - ulazni parametar
     * @return faktorijel broja x
     */
    public static int faktorijel(int x){
        int fact = 1;
        for (int i=2; i <= x; i = i + 1){
            fact = fact * i;
        }
        return fact;
    }

    /**
     * racuna stepen broja
     * @param x - broj za bazu
     * @param pow - broj za stepen
     * @return x ^ pow
     */
    public static double power(double x, int pow){
        double produkt = 1;
        for (int i=0; i < pow; i = i + 1){
            produkt = produkt * x;
        }
        return produkt;
    }
}
