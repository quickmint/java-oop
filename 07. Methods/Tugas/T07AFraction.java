// File: T07AFraction.java

public class T07Afraction {
    //method ini digunakan untuk melakukan penjumlahan pecahan
    static void sumFraction(int e1, int d1, int e2, int d2) {
        int es, ds, x;
        es = (e1 * d2 + e2 * d1);
        ds = d1 * d2;

        //panggil method simplyFraction() untuk mencari faktor pembagi pecahan
        x = simplyFraction(es, ds);

        //bagi pecahan yang telah dicari dengan faktor pembagi x
        es = es / x;
        ds = ds / x;

        //panggil method printFraction() untuk mencetak pecahan
        printFraction(es, ds);
    }

    //method ini digunakan untuk melakukan perkalian pecahan
    static void productFraction(int e1, int d1, int e2, int d2) {
        int ep, dp, x;
        ep = e1 * e2;
        dp = d1 * d2;
        x = simplyFraction(ep, dp);
        ep = ep / x;
        dp = dp / x;
        printFraction(ep, dp);
    }

    //method ini digunakan sebagai format untuk mencetak output hasil perhitungan pecahan
    static void printFraction(int x, int y) {
        System.out.println(x + " / " + y);
    }
    
    //method ini digunakan untuk menyederhanakan sebuah pecahan dengan mencari faktor pembagi
    static int simplyFraction(int a, int b) {
        int temp;
        while( b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        // method utama untuk melaukan testcase
        sumFraction(1, 2, 2, 3);
        sumFraction(1, 3, 3, 4);
        productFraction(1, 2, 2, 3);
        productFraction(1, 4, 2, 3);
    }
}
